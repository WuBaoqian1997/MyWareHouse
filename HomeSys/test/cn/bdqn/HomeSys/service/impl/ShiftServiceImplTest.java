 /**  
* @Title: ShiftServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:11:32
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
 * 项目名称：HomeSys   
 * 类名称：ShiftServiceImplTest   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:11:32   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:11:32   
 * 修改备注：   
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
		shift.setShiftName("午班");
		shift.setShiftStartTime("13");
		try {
			shiftService.saveShift(shift);
			System.out.println("添加成功");
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			System.out.println("添加失敗");
		}
				
	}

}
