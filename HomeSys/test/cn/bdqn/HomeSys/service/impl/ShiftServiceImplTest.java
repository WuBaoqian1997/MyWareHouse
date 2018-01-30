 /**  
* @Title: ShiftServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:11:32
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Shift;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IShiftService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�ShiftServiceImplTest   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:11:32   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:11:32   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class ShiftServiceImplTest {

	private IShiftService shiftService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		shiftService = (IShiftService)ctx.getBean("shiftService");
	} 
	
	
	@Test
	public void testSaveShift() {
		Shift shift = new Shift();
		shift.setShiftEndTime("8");
		shift.setShiftId(((Long)System.currentTimeMillis()).intValue());
		shift.setShiftName("���");
		shift.setShiftStartTime("13");
		try {
			shiftService.saveShift(shift);
			System.out.println("��ӳɹ�");
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			System.out.println("���ʧ��");
		}
				
	}

}
