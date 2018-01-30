package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.service.ICustomerService;

public class CustomerServiceImplTest {

	private ICustomerService customerService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		customerService = (ICustomerService)ctx.getBean("customerService");
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
		Customer customer = new Customer();
		customer.setCustomerId(((Long)System.currentTimeMillis()).intValue());
		customer.setCustomerName("�ְ�");
		customer.setIdnumber("35269852714222");
		customer.setBalance(500d);
		int rel = 0;
		try {
			customerService.saveCustomer(customer);
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
		Customer customer = new Customer();
		int rel = 0;
		try {
			customerService.updateCustomer(customer);
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
		Customer customer = new Customer();
		int rel = 0;
		try {
			customerService.delCustomer(customer);
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
		Customer customer = customerService.getCustomerByID(1);
		System.out.println("�ͻ����"+customer.getCustomerId());
		System.out.println("�ͻ�����"+customer.getCustomerName());
		System.out.println("���֤��"+customer.getIdnumber());
		System.out.println("�ͻ����"+customer.getBalance());
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
		List<Customer> cutomerList  = customerService.getCustomerList();
		for (Customer customer : cutomerList) {
			System.out.println("�ͻ����"+customer.getCustomerId());
			System.out.println("�ͻ�����"+customer.getCustomerName());
			System.out.println("���֤��"+customer.getIdnumber());
			System.out.println("�ͻ����"+customer.getBalance());
		}
	}
	

}
