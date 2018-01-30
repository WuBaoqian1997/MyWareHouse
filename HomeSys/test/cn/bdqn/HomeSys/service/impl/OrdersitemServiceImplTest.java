package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Ordersitem;
import cn.bdqn.HomeSys.service.IOrdersService;
import cn.bdqn.HomeSys.service.IOrdersitemService;

public class OrdersitemServiceImplTest {
	
	private IOrdersitemService ordersitemService;

	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordersitemService = (IOrdersitemService)ctx.getBean("ordersitemService");
	} 
	
	@Test
	public void getOrdersItems() {
		List<Ordersitem> ordersitems = ordersitemService.getOrdersitemsByOrdersId(1);
		for (Ordersitem ordersitem : ordersitems) {
			System.out.println(ordersitem.getItemname());
		}
	}


	
	
	
	public IOrdersitemService getOrdersitemService() {
		return ordersitemService;
	}


	public void setOrdersitemService(IOrdersitemService ordersitemService) {
		this.ordersitemService = ordersitemService;
	}

	
	
	
	
}
