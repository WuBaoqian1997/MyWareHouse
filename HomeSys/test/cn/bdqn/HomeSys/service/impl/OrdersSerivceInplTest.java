package cn.bdqn.HomeSys.service.impl;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import jxl.write.DateTime;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.entity.Orders;
import cn.bdqn.HomeSys.entity.Orderstatus;
import cn.bdqn.HomeSys.entity.Payment;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Staff;
import cn.bdqn.HomeSys.service.ICustomerService;
import cn.bdqn.HomeSys.service.IOrdersService;

public class OrdersSerivceInplTest {
	
	IOrdersService ordersService ;

	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordersService = (IOrdersService)ctx.getBean("ordersService");
	} 
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：添加住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveCustomer() {
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		Staff staff = new Staff();
		staff.setStaffId(2);
		Customer customer = new Customer();
		customer.setCustomerId(2);
		Orderstatus orderstatus = new Orderstatus();
		orderstatus.setOrderStatusId(1);
		Room room = new Room();
		room.setRoomId(301);
		Payment payment = new Payment();
		payment.setPaymentId(1);
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(1);
		Timestamp startTime = null;
		Timestamp  endTime = null ;
		try {
			startTime = new Timestamp ( sdf.parse("2017-07-01 21:42:12").getTime());
			endTime = new Timestamp ( sdf.parse("2017-07-02 21:42:12").getTime());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Orders orders = new Orders(001, staff, customer, orderstatus, room, payment, 
					//accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"没有钱了");
		int rel = 0;
		try {
			//ordersService.saveOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}

	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：修改住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateCustomer() {
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		Staff staff = new Staff();
		staff.setStaffId(2);
		Customer customer = new Customer();
		customer.setCustomerId(2);
		Orderstatus orderstatus = new Orderstatus();
		orderstatus.setOrderStatusId(1);
		Room room = new Room();
		room.setRoomId(301);
		Payment payment = new Payment();
		payment.setPaymentId(1);
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(1);
		Timestamp startTime = null;
		Timestamp  endTime = null ;
		try {
			startTime = new Timestamp ( sdf.parse("2017-07-01 21:42:12").getTime());
			endTime = new Timestamp ( sdf.parse("2017-07-02 21:42:12").getTime());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Orders orders = new Orders(001, staff, customer, orderstatus, room, payment, 
					//accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"有钱了");
		int rel = 0;
		try {
			//ordersService.updateOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：删除住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testDelCustomer() {
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		Staff staff = new Staff();
		staff.setStaffId(2);
		Customer customer = new Customer();
		customer.setCustomerId(2);
		Orderstatus orderstatus = new Orderstatus();
		orderstatus.setOrderStatusId(1);
		Room room = new Room();
		room.setRoomId(301);
		Payment payment = new Payment();
		payment.setPaymentId(1);
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(1);
		Timestamp startTime = null;
		Timestamp  endTime = null ;
		try {
			startTime = new Timestamp ( sdf.parse("2017-07-01 21:42:12").getTime());
			endTime = new Timestamp ( sdf.parse("2017-07-02 21:42:12").getTime());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	//	Orders orders = new Orders(001, staff, customer, orderstatus, room, payment, 
				//	accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"有钱了");
		int rel = 0;
		try {
		//	ordersService.delOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：根据id查询
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetCustomerById() {
		Orders orders = ordersService.getOrdersByID(1) ;
		System.out.println("订单编号"+orders.getOrderId());
		System.out.println("入住天数"+orders.getDays());
		System.out.println("押金金额"+orders.getDeposit());
		System.out.println("消费金额"+orders.getAccountsPayable());
		System.out.println("备注"+orders.getRemarks());
	}
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：查询全部的住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetCustomerList() {
		List<Orders> ordersList = ordersService.getOrderList();
		for (Orders orders : ordersList) {
			System.out.println("订单编号"+orders.getOrderId());
			System.out.println("入住天数"+orders.getDays());
			System.out.println("押金金额"+orders.getDeposit());
			System.out.println("消费金额"+orders.getAccountsPayable());
			System.out.println("备注"+orders.getRemarks());
		}
	}
	
	/**
	 * 
	* @Title: testOrdersByRoomId
	* @Description: 该方法的主要作用：根据房间号查询订单信息
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testOrdersByRoomId()
	{
		Orders orders  = ordersService.getOrderByRoomid(107);
		System.out.println(orders.getRoom().getCustomer().getCustomerName());
	}
	
	
	
	
	
	
	
	
	
	public IOrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(IOrdersService ordersService) {
		this.ordersService = ordersService;
	}
	
	
	
	
}
