 /**  
* @Title: RoleServiceTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午5:11:16
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Role;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IRoleService;
import cn.bdqn.HomeSys.service.IRoomService;
import cn.bdqn.HomeSys.service.IRoomstatusService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoleServiceTest   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午5:11:16   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午5:11:16   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomServiceTest {
	private IRoomService roomService;
	private IRoomstatusService roomstatusService;
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		roomService = (IRoomService)ctx.getBean("roomService");
		roomstatusService = (IRoomstatusService)ctx.getBean("roomstatusService");
	} 
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：添加房间
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveRoom() {
		Room room = new Room();
		room.setRoomId(((Long)System.currentTimeMillis()).intValue());  //编号
		room.setRoomId(122);
		int rel = 0;
		try {
			roomService.saveRoom(room);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	/**
	 * 
	* @Title: testUpdateRole
	* @Description: 该方法的主要作用：修改房间名称
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateRole() {
		Room room = roomService.getRoomById(101);
		room.setRoomId(12);
		int rel = 0;
		try {
			roomService.updateRoom(room);
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
	* @Title: testDelAccommodation
	* @Description: 该方法的主要作用：删房间
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testDelRoom() {
		Room room = roomService.getRoomById(101);
		int rel = 0;
		try {
			roomService.delRoom(room);
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
	* @Title: testgetAccommodationById
	* @Description: 该方法的主要作用：根据ID查询房间
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRoomById() {
		Room room = roomService.getRoomById(101);
		System.out.println(room.getRoomtype().getPrice().getRoutinePrice());
	}
	/**
	 * 
	* @Title: testgetRole
	* @Description: 该方法的主要作用：查询所有房间
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRole() {
		List<Room> roomList  = roomService.getRoomList();
		for (Room room : roomList) {
			System.out.println("编号"+room.getRoomId());
		}
	}
	
	/**
	 * 
	* @Title: getRoomByStatus
	* @Description: 该方法的主要作用：根据房间状态名称查询房间信息
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void getRoomByStatus()
	{
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(5);//住净
		List<Room> rooms = roomService.getRoomByStatus(roomstatus);
		System.out.println(rooms.size());   //数量
		for (Room room : rooms) {
			System.out.println(room.getRoomId());
		}
	}
	
	/**
	 * 
	* @Title: testGetRoomByStatus
	* @Description: 该方法的主要作用：根据房间状态查询房间信息
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testGetRoomByStatus()
	{
		List<Room> roomsList = roomService.getRoomByRoomStatus("空净");
		for (Room room : roomsList) {
			System.out.println(room.getRoomId());
		}
	}
	
	
	public IRoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}
	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}
	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}
	
	
	
}
