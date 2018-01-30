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
	* @Description: �÷�������Ҫ���ã���Ӷ���״̬
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testSaveOrderStatus() {
	
		Orderstatus orderstatus = new Orderstatus();
		orderstatus.setOrderStatusId(((Long)System.currentTimeMillis()).intValue());
		orderstatus.setOrderStatusName("�Ѹ���");
		int rel=0;
		try {
			orderstatusService.saveOrderstatus(orderstatus);
			rel = 1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
		
	}

	
	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: �÷�������Ҫ���ã��޸Ķ���״̬
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testUpdateOrderStatus() {
	
		Orderstatus orderstatus =orderstatusService.getOradeOrderstatuById(1940006305);
		orderstatus.setOrderStatusName("�Ѹ���1");
		int rel=0;
		try {
			orderstatusService.updateOrderstatus(orderstatus);
			rel = 1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("���޸�ʧ��");
		}
		
	}

	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: �÷�������Ҫ���ã�ɾ������״̬
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
		
	}

	/**
	 * 
	* @Title: testSaveOrderStatus
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Description: �÷�������Ҫ���ã���ѯȫ��
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
