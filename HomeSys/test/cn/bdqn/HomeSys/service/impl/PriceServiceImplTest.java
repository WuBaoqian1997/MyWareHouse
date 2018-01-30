 /**  
 * @Title: PriceServiceImplTest.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:55:17
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;


import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.service.IPriceService;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PriceServiceImplTest   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:55:17   
 * �޸��ˣ�������
 * �޸�ʱ�䣺2017-7-24 ����10:55:17   
 * �޸ı�ע��   
 * @version    
 */
public class PriceServiceImplTest {

	private IPriceService priceService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		priceService = (IPriceService)ctx.getBean("priceService");
	}
	@Test
	public void testSavePrice() {
		Price price = new Price();
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(1);
		price.setPriceId(((Long)System.currentTimeMillis()).intValue());
		price.setAccommodation(accommodation);
		price.setStartTime(new Date());
		price.setEndTime(new Date());
		price.setRoutinePrice(500D);
		price.setWeekendPrice(250D);
		int rel = 0;
		try {
			priceService.savePrice(price);
			rel = 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}
	public IPriceService getPriceService() {
		return priceService;
	}
	public void setPriceService(IPriceService priceService) {
		this.priceService = priceService;
	}
}
