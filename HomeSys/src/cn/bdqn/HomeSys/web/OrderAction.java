 /**  
* @Title: OrderAction.java
* @Package cn.bdqn.HomeSys.web
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-26 下午9:43:40
* @version V1.0  
*/
package cn.bdqn.HomeSys.web;

import java.awt.ItemSelectable;
import java.util.Date;
import java.util.List;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.entity.Orders;
import cn.bdqn.HomeSys.entity.Ordersitem;
import cn.bdqn.HomeSys.entity.Orderstatus;
import cn.bdqn.HomeSys.entity.Payment;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Staff;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.ICustomerService;
import cn.bdqn.HomeSys.service.IOrdersService;
import cn.bdqn.HomeSys.service.IOrdersitemService;
import cn.bdqn.HomeSys.service.IOrderstatusService;
import cn.bdqn.HomeSys.service.IPaymentService;
import cn.bdqn.HomeSys.service.IRoomService;
import cn.bdqn.HomeSys.service.IRoomstatusService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：OrderAction   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-26 下午9:43:40   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-26 下午9:43:40   
 * 修改备注：   
 * @version    
 *    
 */
public class OrderAction extends ActionSupport {
	private List<Accommodation> accommodationList;                  //房价代码集合
	private IAccommodationService accommodationService;             //房价代码的业务逻辑层
	private Integer roomid;                                         //房间编号
	private Room room;												//房间的对象
	private IRoomService roomService;								//房间表的业务逻辑层
	private Integer roomCount;										//空净房间数量
	private IRoomstatusService roomstatusService;                   //房间状态的业务
	private ICustomerService customerService;                       //客户信息的业务逻辑层
	private Customer customer;                                      //客户信息的对象
	private IOrdersService orderService; 							//订单的Service
	private Orders orders;                                          //订单对象
	private Orderstatus orderstatus;								//订单状态
	private IOrderstatusService orderstatusService;                 //订单状态业务员
	private List<Payment> paymentList;                              //支付方式集合
	private Payment payment;                                        //支付方式对象
	private IPaymentService paymentService;                         //支付方式 业务
	private Integer ordersid;										//订单编号
	private Roomstatus roomstatus;									//房间状态
	private Ordersitem ordersitem;                                  //订单明细
	private IOrdersitemService ordersitemService;                   //订单明细业务
	private List<Ordersitem> ordersitemList;                        //订单明细集合
	private Double xiaofei;											//消费
	private Double yue;												//余额
	private Double totalMoney;										//总金额
	private Integer paymentId;										//支付方式的id
	private Double price;											//调价的新价格
	private List<Room> roomsList;									//房间的集合
	private Integer newRoomid;										//新房间编号
	
	/**
	 * 
	* @Title: saveOrders
	* @Description: 该方法的主要作用：
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
 	public String check_in(){
		//添加一个客户信息
		String name = customer.getCustomerName();
		String phone = customer.getPhone();
		customer  = new Customer();
		Integer customid  =((Long) System.currentTimeMillis()).intValue();
		customer.setCustomerId(customid);
		customer.setCustomerName(name);								//姓名
		customer.setPhone(phone);									//电话
		customer.setStarttime(orders.getStartTime());                 //入住时间
		customer.setEndtime(orders.getEndTime());					//离店时间
		customer.setHouseing(orders.getAccountsPayable());          //今日房价
		customerService.saveCustomer(customer);		
		
		//添加一个订单信息
		orders.setOrderId(((Long)System.currentTimeMillis()).intValue());
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1);//已入住
		orders.setOrderstatus(orderstatus);
		//设置当前房态为住
		
		
		roomstatus = new Roomstatus();
		roomstatus = roomstatusService.getRoomstatusById(6);        //住净
		room.setRoomstatus(roomstatus);
		room.setCustomer(customer);									//加入一个客户
		roomService.updateRoom(room);                            //修改房间的状态是住净
		Date startD = orders.getStartTime();
		Date endD = orders.getEndTime();
		int days = (int)((endD.getTime()-startD.getTime())/86400000);
		orders.setDays(days);
		Staff staff = (Staff)ActionContext.getContext().getSession().get("user");//当前用户
		orders.setStaff(staff);
		orders.setCustomer(customer);
		orderService.saveOrders(orders);
		//获取当前入住的订单信息
		orders = orderService.getOrdersByID(orders.getOrderId());
		
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: save_money
	* @Description: 该方法的主要作用：获取所有的支付方式
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String getPayment()
	{
		paymentList = paymentService.getPaymentList();
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();     //客户信息
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: tiaozhuan_record
	* @Description: 该方法的主要作用：跳转到入账
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String tiaozhuan_record()
	{
		orders = orderService.getOrdersByID(ordersid);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: recorded
	* @Description: 该方法的主要作用：入账
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String recorded()
	{
		Double xiaofei = ordersitem.getXiaofei();									//消费	
		orders = orderService.getOrdersByID(ordersid);								//得到订单信息
		customer = orders.getCustomer();											//得到原来的客户
		
		Double oldAccountsPayable = customer.getAccountsPayable();					//原来的消费金额
		if(oldAccountsPayable==null){
			oldAccountsPayable=0d;
		}
		customer.setAccountsPayable(xiaofei+oldAccountsPayable);   					//消费金额
		customerService.updateCustomer(customer);
		//添加一个订单明细
		String itemname = ordersitem.getItemname();									//项目名称
		ordersitem = new Ordersitem();
		ordersitem.setXiaofei(xiaofei);												//消费
		ordersitem.setItemid(((Long)System.currentTimeMillis()).intValue());   		//编号
		ordersitem.setCreatetime(new Date());                                  		//操作时间是当前时间
		ordersitem.setItemname(itemname);      										//项目名称
		ordersitem.setItemstatus("未结");
		ordersitem.setFukuan(0d);                               					//消费是0
		Orders orders = orderService.getOrdersByID(ordersid);
		ordersitem.setOrders(orders);                                         		//订单
		ordersitemService.saveOrdersItem(ordersitem);
		return SUCCESS;
	}
	
	
	
	/**
	 * 
	* @Title: saveMoney
	* @Description: 该方法的主要作用：交押金
	* 修改客户表的信息
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String saveMoney(){
		Double fukuan = ordersitem.getFukuan();	
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();											//得到员原来的客户
		customer.setAccountsPayable(0d);   											//消费金额
		Double yue = customer.getBalance();  										//原来的余额
		Double olddeposit = customer.getDeposit();//原来的押金
		//如果余额是null的话，赋值为0
		if(yue==null){
			yue = 0d;
		}
		if(olddeposit==null){
			olddeposit = 0d;
		}
		try {
			customer.setBalance(yue+fukuan);                    //交完押金之后的余额
			customer.setDeposit(olddeposit+fukuan);				//押金
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			System.out.println(e);
		
		}							
		customerService.updateCustomer(customer);
		//添加一个订单明细
											//支付金额
		ordersitem = new Ordersitem();
		ordersitem.setFukuan(fukuan);												//付款
		ordersitem.setItemid(((Long)System.currentTimeMillis()).intValue());   		//编号
		ordersitem.setCreatetime(new Date());                                  		//操作时间是当前时间
		payment = paymentService.getPaymentById(paymentId);							//支付方式
		ordersitem.setItemname(payment.getPaymentMethod());      					//项目名称
		ordersitem.setItemstatus("未结");
		ordersitem.setXiaofei(0d);                               					//消费是0
		Orders orders = orderService.getOrdersByID(ordersid);
		ordersitem.setOrders(orders);                                         		//订单
		ordersitemService.saveOrdersItem(ordersitem);
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: getOrdersInfo
	* @Description: 该方法的主要作用：点击日租入住，跳转到daycheck_in.jsp
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String getOrdersInfo(){
		accommodationList = accommodationService.getAccommodationList();  //所有的房价代码
		room = roomService.getRoomById(roomid);
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(5);//住净房
		List<Room> rooms = roomService.getRoomByStatus(roomstatus);    //住净房
		roomCount = rooms.size();   //可入住房间数量
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: client_list
	* @Description: 该方法的主要作用：点击当前入住人的信息
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String client_list(){
		orders = orderService.getOrderByRoomid(ordersid);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: v_updateHousePrice
	* @Description: 该方法的主要作用：跳转到调价页面
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String v_updateHousePrice()
	{
		orders = orderService.getOrderByRoomid(ordersid);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updateHousePrice
	* @Description: 该方法的主要作用：调价
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String updateHousePrice()
	{
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();
		customer.setHouseing(price);
		customerService.updateCustomer(customer);
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: viewFinance
	* @Description: 该方法的主要作用：显示财务明细
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String viewFinance()
	{
		ordersitemList = ordersitemService.getOrdersitemsByOrdersId(ordersid);
		orders  = orderService.getOrdersByID(ordersid);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: getQuitMoney
	* @Description: 该方法的主要作用：跳转到退房的页面
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String getQuitMoney()
	{
		paymentList = paymentService.getPaymentList();
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();     //客户信息
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: refund
	* @Description: 该方法的主要作用：退款
	* @param  @return 设定文件  
	* @return 返回类型：String   
	* @throws
	 */
	public String refund()
	{
		//根据订单id查询一遍
		orders = orderService.getOrdersByID(ordersid);
		Customer customer = orders.getCustomer();
		customer.setAccountsPayable(0d);
		customer.setBalance(0d);
		customer.setDeposit(0d);
		//修改客户表，消费0，余额0，押金0
		customerService.updateCustomer(customer);
		//刪除當前用戶
		room = roomService.getRoomById(orders.getRoom().getRoomId());
		roomstatus = new Roomstatus();
		roomstatus.setRoomStatusId(8);
		room.setRoomstatus(roomstatus);
		room.setCustomer(null);   //这间房没有客户
		//修改房间状态是空脏
		roomService.updateRoom(room);
		orderstatus = orderstatusService.getOradeOrderstatuById(2);
		orders.setOrderstatus(orderstatus);
		//修改订单，状态是退房
		orderService.updateOrders(orders);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: v_swopRoom
	* @Description: 该方法的主要作用：跳转到换房页面
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String v_swopRoom()
	{
		orders = orderService.getOrderByRoomid(ordersid);
		roomsList = roomService.getRoomByRoomStatus("空净");
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: swopRoom
	* @Description: 该方法的主要作用：
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String swopRoom()
	{
		//先把原来的房间状态改为空脏
		room = roomService.getRoomById(roomid); //根据旧的房间编号查询房间信息
		roomstatus =roomstatusService.getRoomstatusById(8);//空脏
		room.setRoomstatus(roomstatus);
		room.setCustomer(null);
		roomService.updateRoom(room);
		//再把换过去的房间设置为住净
		room = roomService.getRoomById(roomid); //根据旧的房间编号查询房间信息
		roomstatus =roomstatusService.getRoomstatusById(6);//住净
		room.setRoomstatus(roomstatus);
		try {
			room.setRoomId(newRoomid);
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
		}
		roomService.updateRoom(room);
		return SUCCESS;
	}
	
	
	public List<Accommodation> getAccommodationList() {
		return accommodationList;
	}
	public void setAccommodationList(List<Accommodation> accommodationList) {
		this.accommodationList = accommodationList;
	}
	public IAccommodationService getAccommodationService() {
		return accommodationService;
	}
	public void setAccommodationService(IAccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}

	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public IRoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}

	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}

	public ICustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public IOrdersService getOrderService() {
		return orderService;
	}

	public void setOrderService(IOrdersService orderService) {
		this.orderService = orderService;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Orderstatus getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public IOrderstatusService getOrderstatusService() {
		return orderstatusService;
	}

	public void setOrderstatusService(IOrderstatusService orderstatusService) {
		this.orderstatusService = orderstatusService;
	}

	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public IPaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Integer getOrdersid() {
		return ordersid;
	}

	public void setOrdersid(Integer ordersid) {
		this.ordersid = ordersid;
	}

	public Roomstatus getRoomstatus() {
		return roomstatus;
	}

	public void setRoomstatus(Roomstatus roomstatus) {
		this.roomstatus = roomstatus;
	}

	public Ordersitem getOrdersitem() {
		return ordersitem;
	}

	public void setOrdersitem(Ordersitem ordersitem) {
		this.ordersitem = ordersitem;
	}

	public IOrdersitemService getOrdersitemService() {
		return ordersitemService;
	}

	public void setOrdersitemService(IOrdersitemService ordersitemService) {
		this.ordersitemService = ordersitemService;
	}

	public List<Ordersitem> getOrdersitemList() {
		return ordersitemList;
	}

	public void setOrdersitemList(List<Ordersitem> ordersitemList) {
		this.ordersitemList = ordersitemList;
	}

	public Double getXiaofei() {
		return xiaofei;
	}

	public void setXiaofei(Double xiaofei) {
		this.xiaofei = xiaofei;
	}

	public Double getYue() {
		return yue;
	}

	public void setYue(Double yue) {
		this.yue = yue;
	}

	public Double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}

	public Integer getNewRoomid() {
		return newRoomid;
	}

	public void setNewRoomid(Integer newRoomid) {
		this.newRoomid = newRoomid;
	}
	
	
	
}
