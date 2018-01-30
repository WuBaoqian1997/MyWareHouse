 /**  
* @Title: RoomstatusServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午6:58:24
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.service.IRoomstatusService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomstatusServiceImplTest   
 * 类描述：   
 * 创建人：Sun Zhong Tian
 * 创建时间：2017-7-24 下午6:58:24   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午6:58:24   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomstatusServiceImplTest {
	private IRoomstatusService roomstatusService;
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		roomstatusService = (IRoomstatusService)ctx.getBean("roomstatusService");
	}
	
	/**
	 * 
	* @Title: testSaveRoomstatus
	* @Description: 该方法的主要作用：添加数据
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveRoomstatus() {
		Roomstatus roomstatus = new Roomstatus();
		roomstatus.setRoomStatusId(((Long)System.currentTimeMillis()).intValue());
		roomstatus.setRoomStatusName("脏房");
		int rel = 0;
		try {
			roomstatusService.savaRoomstatus(roomstatus);
			rel=1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rel = 0;
		}
		if(rel>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	
	
	/**
	 * 
	* @Title: testUpdateRoomstatus
	* @Description: 该方法的主要作用：根据id修改房间名称
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateRoomstatus(){
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(2000559988);
		//根据id  修改的内容
		roomstatus.setRoomStatusName("小小房间");
		int rel = 0;
		try {
			roomstatusService.updeteRoomstatus(roomstatus);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	
	/**
	 * 
	* @Title: testDelRoomstatus
	* @Description: 该方法的主要作用：根据id  删除
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testDelRoomstatus(){
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(1951057942);
		int rel = 0;
		try {
			roomstatusService.delRoomstatus(roomstatus);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}

	/**
	 * 
	* @Title: testgetRoomstatusById
	* @Description: 该方法的主要作用：根据id查询
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRoomstatusById()
	{
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(1);
		System.out.println(roomstatus.getRoomStatusName());
	}
	
	
	/**
	 * 
	* @Title: getRoomstatus
	* @Description: 该方法的主要作用：查询房间状态
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void getRoomstatus()
	{
		List<Roomstatus> roomstatusList = roomstatusService.getRoomstatusList();
		for(Roomstatus room : roomstatusList){
			System.out.println("房间状态："+room.getRoomStatusName());
		}
	}
	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}

	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}
	
	
}
