 /**  
* @Title: AccommodationServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����1:36:26
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.Init;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.service.IAccommodationService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�AccommodationServiceImplTest   
 * ��������  ����ס������ 
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����1:36:26   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����1:36:26   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class AccommodationServiceImplTest {

	private IAccommodationService accommodationService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		accommodationService = (IAccommodationService)ctx.getBean("accommodationService");
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
	public void testSaveAccommodation() {
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(((Long)System.currentTimeMillis()).intValue());  //���
		accommodation.setAccommodationType("�Ź�");
		int rel = 0;
		try {
			accommodationService.saveAccommodation(accommodation);
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
	public void testUpdateAccommodation() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		accommodation.setAccommodationType("�Ź�");
		int rel = 0;
		try {
			accommodationService.updateAccommodation(accommodation);
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
	public void testDelAccommodation() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		int rel = 0;
		try {
			accommodationService.delAccommodation(accommodation);
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
	public void testgetAccommodationById() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		System.out.println(accommodation.getAccommodationType());
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
	public void testgetAccommodations() {
		List<Accommodation> accommodationList  = accommodationService.getAccommodationList();
		for (Accommodation accommodation : accommodationList) {
			System.out.println("���"+accommodation.getAccommodationId());
			System.out.println("����"+accommodation.getAccommodationType());
		}
	}
	
	
	
	
	public IAccommodationService getAccommodationService() {
		return accommodationService;
	}

	public void setAccommodationService(IAccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}
	
	

}
