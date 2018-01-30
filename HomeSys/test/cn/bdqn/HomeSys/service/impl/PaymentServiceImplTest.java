package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Payment;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IPaymentService;

public class PaymentServiceImplTest {

	
	private IPaymentService paymentService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		paymentService = (IPaymentService)ctx.getBean("paymentService");
	} 
	
	
	
	@Test
	public void test() {
		Payment payment = new Payment();
		payment.setPaymentId(((Long)System.currentTimeMillis()).intValue());
		payment.setPaymentMethod("΢�Ÿ���");
		try {
			paymentService.savePayment(payment);
			System.out.println("��ӳɹ�");
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			System.out.println("���ʧ��");
		}
	}



	public IPaymentService getPaymentService() {
		return paymentService;
	}



	public void setPaymentService(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}

}
