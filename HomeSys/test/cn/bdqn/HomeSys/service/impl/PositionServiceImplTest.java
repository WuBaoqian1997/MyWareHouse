 /**  
 * @Title: PositionServiceImplTest.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO该方法的主要作用：
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 下午10:36:21
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
 * 项目名称：HomeSys   
 * 类名称：PositionServiceImplTest   
 * 类描述：   
 * 创建人：穆雄雄
 * 创建时间：2017-7-24 下午10:36:21   
 * 修改人：穆雄雄  
 * 修改时间：2017-7-24 下午10:36:21   
 * 修改备注：   
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
		Position position = new Position(((Long)System.currentTimeMillis()).intValue(),"五楼");
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
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	
	public IPositionService getPositionService() {
		return positionService;
	}
	public void setPositionService(IPositionService positionService) {
		this.positionService = positionService;
	} 
}
