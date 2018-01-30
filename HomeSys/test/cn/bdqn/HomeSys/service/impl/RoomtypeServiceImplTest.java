 /**  
* @Title: RoomtypeServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:33:30
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IRoomtypeService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomtypeServiceImplTest   
 * 类描述：   
 * 创建人：Sun Zhong Tian
 * 创建时间：2017-7-24 下午4:33:30   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午4:33:30   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomtypeServiceImplTest {

	private IRoomtypeService roomtypeService;
	
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		roomtypeService = (IRoomtypeService)ctx.getBean("roomtypeService");
	}
	
	@Test
	public void testSaveRoomtype() {
		Roomtype roomtype = new Roomtype();
		roomtype.setRoomTypeId(((Long)System.currentTimeMillis()).intValue());//long随机获取当前毫秒
		roomtype.setBedType(111);
		roomtype.setRoomTypeName("大总统");
		roomtype.setAcreage(2.0);
		int rel = 0;
		try {
			roomtypeService.savaRoomtype(roomtype);
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
	* @Title: testUpdateRoomtype
	* @Description: 该方法的主要作用： 根据id  更改大床房小床放
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateRoomtype(){
		Roomtype roomtype = roomtypeService.getRoomtypeById(1944048497);
		roomtype.setRoomTypeName("总统房");
		int rel = 0;
		try {
			roomtypeService.updateRoomtype(roomtype);
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
	* @Title: testdelRoomtype
	* @Description: 该方法的主要作用：根据id 删除数据
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testdelRoomtype(){
		Roomtype roomtype = roomtypeService.getRoomtypeById(1944048497);
		int rel = 0;
		try {
			roomtypeService.delRoomtype(roomtype);
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
	* @Title: testgetRoomtypeById
	* @Description: 该方法的主要作用：根据id 查询
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRoomtypeById()
	{
		Roomtype roomtype = roomtypeService.getRoomtypeById(1);
		System.out.println(roomtype.getRoomTypeName());
	}
	
	
	/**
	 * 
	* @Title: testgetRoomtype
	* @Description: 该方法的主要作用：查询全部房间
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRoomtype()
	{
		List<Roomtype> roomtypeList = roomtypeService.getRoomtypeList();
		for(Roomtype roomtype :roomtypeList)
		{
			System.out.println("房间类型"+roomtype.getRoomTypeName());
			System.out.println("房间面积"+roomtype.getBedType());
			System.out.println("房间价格"+roomtype.getAcreage());
		}
	}
	
	public IRoomtypeService getRoomtypeService() {
		return roomtypeService;
	}

	public void setRoomtypeService(IRoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}
	
	
}
