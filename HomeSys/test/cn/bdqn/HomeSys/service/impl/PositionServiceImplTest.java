 /**  
 * @Title: PositionServiceImplTest.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:36:21
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IPositionService;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PositionServiceImplTest   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:36:21   
 * �޸��ˣ�������  
 * �޸�ʱ�䣺2017-7-24 ����10:36:21   
 * �޸ı�ע��   
 * @version    
 */
public class PositionServiceImplTest {

	private IPositionService positionService;
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		positionService = (IPositionService)ctx.getBean("positionService");
	}
	
	@Test
	public void testSavePosition(){
		Position position = new Position(((Long)System.currentTimeMillis()).intValue(),"��¥");
		int rel = 0;
		try {
			positionService.savePosition(position);
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
	
	public IPositionService getPositionService() {
		return positionService;
	}
	public void setPositionService(IPositionService positionService) {
		this.positionService = positionService;
	} 
}
