 /**  
* @Title: StaffServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:32:02
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Shift;
import cn.bdqn.HomeSys.entity.Staff;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IShiftService;
import cn.bdqn.HomeSys.service.IStaffService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�StaffServiceImplTest   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:32:02   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:32:02   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class StaffServiceImplTest {

	private IStaffService staffService;
	private IShiftService shiftService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		staffService = (IStaffService)ctx.getBean("staffService");
		shiftService = (IShiftService)ctx.getBean("shiftService");
	} 
	
	/**
	 * 
	* @Title: test
	* @Description: �÷�������Ҫ���ã����
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void test() {
		Staff staff = new Staff();
		staff.setAddress("ɽ������");
		staff.setEmail("2451999120@qq.com");
		staff.setHeadPortrait("touxiang");
		staff.setPhone("150666675713");
		staff.setPwd("111");
		Shift shift = shiftService.getShiftById(1965826044);
		staff.setStaffId(((Long)System.currentTimeMillis()).intValue());
		staff.setShift(shift);
		staff.setStaffName("������");
		try {
			staffService.saveStaff(staff);
			System.out.println("��ӳɹ�");
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			System.out.println("���ʧ��");
		}
		
		
	}

	public IStaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(IStaffService staffService) {
		this.staffService = staffService;
	}

	public IShiftService getShiftService() {
		return shiftService;
	}

	public void setShiftService(IShiftService shiftService) {
		this.shiftService = shiftService;
	}

}
