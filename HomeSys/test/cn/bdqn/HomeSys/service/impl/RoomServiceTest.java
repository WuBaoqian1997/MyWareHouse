 /**  
* @Title: RoleServiceTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����5:11:16
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoleServiceTest   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����5:11:16   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����5:11:16   
 * �޸ı�ע��   
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
	* @Description: �÷�������Ҫ���ã���ӷ���
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testSaveRoom() {
		Room room = new Room();
		room.setRoomId(((Long)System.currentTimeMillis()).intValue());  //���
		room.setRoomId(122);
		int rel = 0;
		try {
			roomService.saveRoom(room);
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
	* @Title: testUpdateRole
	* @Description: �÷�������Ҫ���ã��޸ķ�������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Title: testDelAccommodation
	* @Description: �÷�������Ҫ���ã�ɾ����
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Title: testgetAccommodationById
	* @Description: �÷�������Ҫ���ã�����ID��ѯ����
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Description: �÷�������Ҫ���ã���ѯ���з���
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetRole() {
		List<Room> roomList  = roomService.getRoomList();
		for (Room room : roomList) {
			System.out.println("���"+room.getRoomId());
		}
	}
	
	/**
	 * 
	* @Title: getRoomByStatus
	* @Description: �÷�������Ҫ���ã����ݷ���״̬���Ʋ�ѯ������Ϣ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void getRoomByStatus()
	{
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(5);//ס��
		List<Room> rooms = roomService.getRoomByStatus(roomstatus);
		System.out.println(rooms.size());   //����
		for (Room room : rooms) {
			System.out.println(room.getRoomId());
		}
	}
	
	/**
	 * 
	* @Title: testGetRoomByStatus
	* @Description: �÷�������Ҫ���ã����ݷ���״̬��ѯ������Ϣ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testGetRoomByStatus()
	{
		List<Room> roomsList = roomService.getRoomByRoomStatus("�վ�");
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
