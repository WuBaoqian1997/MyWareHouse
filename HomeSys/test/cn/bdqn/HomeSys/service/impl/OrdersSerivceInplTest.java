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
	* @Description: �÷�������Ҫ���ã����ס������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
					//accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"û��Ǯ��");
		int rel = 0;
		try {
			//ordersService.saveOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}

	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: �÷�������Ҫ���ã��޸�ס������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
					//accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"��Ǯ��");
		int rel = 0;
		try {
			//ordersService.updateOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: �÷�������Ҫ���ã�ɾ��ס������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
				//	accommodation, startTime, endTime, 1, 5000.0, 400.0 ,"��Ǯ��");
		int rel = 0;
		try {
		//	ordersService.delOrders(orders);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
	}
	
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetCustomerById() {
		Orders orders = ordersService.getOrdersByID(1) ;
		System.out.println("�������"+orders.getOrderId());
		System.out.println("��ס����"+orders.getDays());
		System.out.println("Ѻ����"+orders.getDeposit());
		System.out.println("���ѽ��"+orders.getAccountsPayable());
		System.out.println("��ע"+orders.getRemarks());
	}
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: �÷�������Ҫ���ã���ѯȫ����ס������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetCustomerList() {
		List<Orders> ordersList = ordersService.getOrderList();
		for (Orders orders : ordersList) {
			System.out.println("�������"+orders.getOrderId());
			System.out.println("��ס����"+orders.getDays());
			System.out.println("Ѻ����"+orders.getDeposit());
			System.out.println("���ѽ��"+orders.getAccountsPayable());
			System.out.println("��ע"+orders.getRemarks());
		}
	}
	
	/**
	 * 
	* @Title: testOrdersByRoomId
	* @Description: �÷�������Ҫ���ã����ݷ���Ų�ѯ������Ϣ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
