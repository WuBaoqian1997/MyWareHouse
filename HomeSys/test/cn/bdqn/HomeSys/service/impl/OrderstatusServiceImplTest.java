package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Orderstatus;
import cn.bdqn.HomeSys.service.IOrderstatusService;

public class OrderstatusServiceImplTest {

	private IOrderstatusService orderstatusService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		orderstatusService = (IOrderstatusService)ctx.getBean("orderstatusService");
	} 
	
	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: 该方法的主要作用：添加订单状态
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveOrderStatus() {
	
		Orderstatus orderstatus = new Orderstatus();
		orderstatus.setOrderStatusId(((Long)System.currentTimeMillis()).intValue());
		orderstatus.setOrderStatusName("已付款");
		int rel=0;
		try {
			orderstatusService.saveOrderstatus(orderstatus);
			rel = 1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
	}

	
	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: 该方法的主要作用：修改订单状态
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateOrderStatus() {
	
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1940006305);
		orderstatus.setOrderStatusName("已付款1");
		int rel=0;
		try {
			orderstatusService.updateOrderstatus(orderstatus);
			rel = 1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("修改成功");
		}else{
			System.out.println("添修改失败");
		}
		
	}

	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: 该方法的主要作用：删除订单状态
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testDelOrderStatus() {
	
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1940006305);
		int rel=0;
		try {
			orderstatusService.delOrderstatus(orderstatus);
			rel = 1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		
	}

	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: 该方法的主要作用：根据id查询
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testGetOrderStatusById() {
	
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1940006305);
		System.out.println(orderstatus.getOrderStatusName());
		
	}

	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: 该方法的主要作用：查询全部
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testGetOrderStatus() {
	
		List<Orderstatus> orderstatusList =orderstatusService.getOrderstatuList();
		for (Orderstatus orderstatus : orderstatusList) {
			System.out.println(orderstatus.getOrderStatusName());
		}
		
	}

	
	
	public IOrderstatusService getOrderstatusService() {
		return orderstatusService;
	}

	public void setOrderstatusService(IOrderstatusService orderstatusService) {
		this.orderstatusService = orderstatusService;
	}
	
	
	

}
