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
	* @Description: 该方法的主要作用：添加住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveCustomer() {
		Customer customer = new Customer();
		customer.setCustomerId(((Long)System.currentTimeMillis()).intValue());
		customer.setCustomerName("爸爸");
		customer.setIdnumber("35269852714222");
		customer.setBalance(500d);
		int rel = 0;
		try {
			customerService.saveCustomer(customer);
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
		Customer customer = new Customer();
		int rel = 0;
		try {
			customerService.updateCustomer(customer);
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
		Customer customer = new Customer();
		int rel = 0;
		try {
			customerService.delCustomer(customer);
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
		Customer customer = customerService.getCustomerByID(1);
		System.out.println("客户编号"+customer.getCustomerId());
		System.out.println("客户名称"+customer.getCustomerName());
		System.out.println("身份证号"+customer.getIdnumber());
		System.out.println("客户余额"+customer.getBalance());
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
		List<Customer> cutomerList  = customerService.getCustomerList();
		for (Customer customer : cutomerList) {
			System.out.println("客户编号"+customer.getCustomerId());
			System.out.println("客户名称"+customer.getCustomerName());
			System.out.println("身份证号"+customer.getIdnumber());
			System.out.println("客户余额"+customer.getBalance());
		}
	}
	

}
