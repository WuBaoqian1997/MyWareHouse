 /**  
* @Title: StaffServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:32:02
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
 * 项目名称：HomeSys   
 * 类名称：StaffServiceImplTest   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:32:02   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:32:02   
 * 修改备注：   
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
	* @Description: 该方法的主要作用：添加
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void test() {
		Staff staff = new Staff();
		staff.setAddress("山西吕梁");
		staff.setEmail("2451999120@qq.com");
		staff.setHeadPortrait("touxiang");
		staff.setPhone("150666675713");
		staff.setPwd("111");
		Shift shift = shiftService.getShiftById(1965826044);
		staff.setStaffId(((Long)System.currentTimeMillis()).intValue());
		staff.setShift(shift);
		staff.setStaffName("穆雄雄");
		try {
			staffService.saveStaff(staff);
			System.out.println("添加成功");
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			System.out.println("添加失败");
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
