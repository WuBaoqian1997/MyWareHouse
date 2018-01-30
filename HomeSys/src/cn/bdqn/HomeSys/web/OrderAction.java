 /**  
* @Title: OrderAction.java
* @Package cn.bdqn.HomeSys.web
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-26 ����9:43:40
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�OrderAction   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-26 ����9:43:40   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-26 ����9:43:40   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class OrderAction extends ActionSupport {
	private List<Accommodation> accommodationList;                  //���۴��뼯��
	private IAccommodationService accommodationService;             //���۴����ҵ���߼���
	private Integer roomid;                                         //������
	private Room room;												//����Ķ���
	private IRoomService roomService;								//������ҵ���߼���
	private Integer roomCount;										//�վ���������
	private IRoomstatusService roomstatusService;                   //����״̬��ҵ��
	private ICustomerService customerService;                       //�ͻ���Ϣ��ҵ���߼���
	private Customer customer;                                      //�ͻ���Ϣ�Ķ���
	private IOrdersService orderService; 							//������Service
	private Orders orders;                                          //��������
	private Orderstatus orderstatus;								//����״̬
	private IOrderstatusService orderstatusService;                 //����״̬ҵ��Ա
	private List<Payment> paymentList;                              //֧����ʽ����
	private Payment payment;                                        //֧����ʽ����
	private IPaymentService paymentService;                         //֧����ʽ ҵ��
	private Integer ordersid;										//�������
	private Roomstatus roomstatus;									//����״̬
	private Ordersitem ordersitem;                                  //������ϸ
	private IOrdersitemService ordersitemService;                   //������ϸҵ��
	private List<Ordersitem> ordersitemList;                        //������ϸ����
	private Double xiaofei;											//����
	private Double yue;												//���
	private Double totalMoney;										//�ܽ��
	private Integer paymentId;										//֧����ʽ��id
	private Double price;											//���۵��¼۸�
	private List<Room> roomsList;									//����ļ���
	private Integer newRoomid;										//�·�����
	
	/**
	 * 
	* @Title: saveOrders
	* @Description: �÷�������Ҫ���ã�
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
 	public String check_in(){
		//���һ���ͻ���Ϣ
		String name = customer.getCustomerName();
		String phone = customer.getPhone();
		customer  = new Customer();
		Integer customid  =((Long) System.currentTimeMillis()).intValue();
		customer.setCustomerId(customid);
		customer.setCustomerName(name);								//����
		customer.setPhone(phone);									//�绰
		customer.setStarttime(orders.getStartTime());                 //��סʱ��
		customer.setEndtime(orders.getEndTime());					//���ʱ��
		customer.setHouseing(orders.getAccountsPayable());          //���շ���
		customerService.saveCustomer(customer);		
		
		//���һ��������Ϣ
		orders.setOrderId(((Long)System.currentTimeMillis()).intValue());
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1);//����ס
		orders.setOrderstatus(orderstatus);
		//���õ�ǰ��̬Ϊס
		
		
		roomstatus = new Roomstatus();
		roomstatus = roomstatusService.getRoomstatusById(6);        //ס��
		room.setRoomstatus(roomstatus);
		room.setCustomer(customer);									//����һ���ͻ�
		roomService.updateRoom(room);                            //�޸ķ����״̬��ס��
		Date startD = orders.getStartTime();
		Date endD = orders.getEndTime();
		int days = (int)((endD.getTime()-startD.getTime())/86400000);
		orders.setDays(days);
		Staff staff = (Staff)ActionContext.getContext().getSession().get("user");//��ǰ�û�
		orders.setStaff(staff);
		orders.setCustomer(customer);
		orderService.saveOrders(orders);
		//��ȡ��ǰ��ס�Ķ�����Ϣ
		orders = orderService.getOrdersByID(orders.getOrderId());
		
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: save_money
	* @Description: �÷�������Ҫ���ã���ȡ���е�֧����ʽ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String getPayment()
	{
		paymentList = paymentService.getPaymentList();
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();     //�ͻ���Ϣ
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: tiaozhuan_record
	* @Description: �÷�������Ҫ���ã���ת������
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã�����
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String recorded()
	{
		Double xiaofei = ordersitem.getXiaofei();									//����	
		orders = orderService.getOrdersByID(ordersid);								//�õ�������Ϣ
		customer = orders.getCustomer();											//�õ�ԭ���Ŀͻ�
		
		Double oldAccountsPayable = customer.getAccountsPayable();					//ԭ�������ѽ��
		if(oldAccountsPayable==null){
			oldAccountsPayable=0d;
		}
		customer.setAccountsPayable(xiaofei+oldAccountsPayable);   					//���ѽ��
		customerService.updateCustomer(customer);
		//���һ��������ϸ
		String itemname = ordersitem.getItemname();									//��Ŀ����
		ordersitem = new Ordersitem();
		ordersitem.setXiaofei(xiaofei);												//����
		ordersitem.setItemid(((Long)System.currentTimeMillis()).intValue());   		//���
		ordersitem.setCreatetime(new Date());                                  		//����ʱ���ǵ�ǰʱ��
		ordersitem.setItemname(itemname);      										//��Ŀ����
		ordersitem.setItemstatus("δ��");
		ordersitem.setFukuan(0d);                               					//������0
		Orders orders = orderService.getOrdersByID(ordersid);
		ordersitem.setOrders(orders);                                         		//����
		ordersitemService.saveOrdersItem(ordersitem);
		return SUCCESS;
	}
	
	
	
	/**
	 * 
	* @Title: saveMoney
	* @Description: �÷�������Ҫ���ã���Ѻ��
	* �޸Ŀͻ������Ϣ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String saveMoney(){
		Double fukuan = ordersitem.getFukuan();	
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();											//�õ�Աԭ���Ŀͻ�
		customer.setAccountsPayable(0d);   											//���ѽ��
		Double yue = customer.getBalance();  										//ԭ�������
		Double olddeposit = customer.getDeposit();//ԭ����Ѻ��
		//��������null�Ļ�����ֵΪ0
		if(yue==null){
			yue = 0d;
		}
		if(olddeposit==null){
			olddeposit = 0d;
		}
		try {
			customer.setBalance(yue+fukuan);                    //����Ѻ��֮������
			customer.setDeposit(olddeposit+fukuan);				//Ѻ��
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			System.out.println(e);
		
		}							
		customerService.updateCustomer(customer);
		//���һ��������ϸ
											//֧�����
		ordersitem = new Ordersitem();
		ordersitem.setFukuan(fukuan);												//����
		ordersitem.setItemid(((Long)System.currentTimeMillis()).intValue());   		//���
		ordersitem.setCreatetime(new Date());                                  		//����ʱ���ǵ�ǰʱ��
		payment = paymentService.getPaymentById(paymentId);							//֧����ʽ
		ordersitem.setItemname(payment.getPaymentMethod());      					//��Ŀ����
		ordersitem.setItemstatus("δ��");
		ordersitem.setXiaofei(0d);                               					//������0
		Orders orders = orderService.getOrdersByID(ordersid);
		ordersitem.setOrders(orders);                                         		//����
		ordersitemService.saveOrdersItem(ordersitem);
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: getOrdersInfo
	* @Description: �÷�������Ҫ���ã����������ס����ת��daycheck_in.jsp
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String getOrdersInfo(){
		accommodationList = accommodationService.getAccommodationList();  //���еķ��۴���
		room = roomService.getRoomById(roomid);
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(5);//ס����
		List<Room> rooms = roomService.getRoomByStatus(roomstatus);    //ס����
		roomCount = rooms.size();   //����ס��������
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: client_list
	* @Description: �÷�������Ҫ���ã������ǰ��ס�˵���Ϣ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String client_list(){
		orders = orderService.getOrderByRoomid(ordersid);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: v_updateHousePrice
	* @Description: �÷�������Ҫ���ã���ת������ҳ��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã�����
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã���ʾ������ϸ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã���ת���˷���ҳ��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String getQuitMoney()
	{
		paymentList = paymentService.getPaymentList();
		orders = orderService.getOrdersByID(ordersid);
		customer = orders.getCustomer();     //�ͻ���Ϣ
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: refund
	* @Description: �÷�������Ҫ���ã��˿�
	* @param  @return �趨�ļ�  
	* @return �������ͣ�String   
	* @throws
	 */
	public String refund()
	{
		//���ݶ���id��ѯһ��
		orders = orderService.getOrdersByID(ordersid);
		Customer customer = orders.getCustomer();
		customer.setAccountsPayable(0d);
		customer.setBalance(0d);
		customer.setDeposit(0d);
		//�޸Ŀͻ�������0�����0��Ѻ��0
		customerService.updateCustomer(customer);
		//�h����ǰ�Ñ�
		room = roomService.getRoomById(orders.getRoom().getRoomId());
		roomstatus = new Roomstatus();
		roomstatus.setRoomStatusId(8);
		room.setRoomstatus(roomstatus);
		room.setCustomer(null);   //��䷿û�пͻ�
		//�޸ķ���״̬�ǿ���
		roomService.updateRoom(room);
		orderstatus = orderstatusService.getOradeOrderstatuById(2);
		orders.setOrderstatus(orderstatus);
		//�޸Ķ�����״̬���˷�
		orderService.updateOrders(orders);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: v_swopRoom
	* @Description: �÷�������Ҫ���ã���ת������ҳ��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String v_swopRoom()
	{
		orders = orderService.getOrderByRoomid(ordersid);
		roomsList = roomService.getRoomByRoomStatus("�վ�");
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: swopRoom
	* @Description: �÷�������Ҫ���ã�
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String swopRoom()
	{
		//�Ȱ�ԭ���ķ���״̬��Ϊ����
		room = roomService.getRoomById(roomid); //���ݾɵķ����Ų�ѯ������Ϣ
		roomstatus =roomstatusService.getRoomstatusById(8);//����
		room.setRoomstatus(roomstatus);
		room.setCustomer(null);
		roomService.updateRoom(room);
		//�ٰѻ���ȥ�ķ�������Ϊס��
		room = roomService.getRoomById(roomid); //���ݾɵķ����Ų�ѯ������Ϣ
		roomstatus =roomstatusService.getRoomstatusById(6);//ס��
		room.setRoomstatus(roomstatus);
		try {
			room.setRoomId(newRoomid);
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
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
