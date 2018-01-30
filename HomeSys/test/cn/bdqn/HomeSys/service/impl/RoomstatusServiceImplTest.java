 /**  
* @Title: RoomstatusServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����6:58:24
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomstatusServiceImplTest   
 * ��������   
 * �����ˣ�Sun Zhong Tian
 * ����ʱ�䣺2017-7-24 ����6:58:24   
 * �޸��ˣ�Sun Zhong Tian
 * �޸�ʱ�䣺2017-7-24 ����6:58:24   
 * �޸ı�ע��   
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
	* @Description: �÷�������Ҫ���ã��������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testSaveRoomstatus() {
		Roomstatus roomstatus = new Roomstatus();
		roomstatus.setRoomStatusId(((Long)System.currentTimeMillis()).intValue());
		roomstatus.setRoomStatusName("�෿");
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
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}
	
	
	/**
	 * 
	* @Title: testUpdateRoomstatus
	* @Description: �÷�������Ҫ���ã�����id�޸ķ�������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testUpdateRoomstatus(){
		Roomstatus roomstatus = roomstatusService.getRoomstatusById(2000559988);
		//����id  �޸ĵ�����
		roomstatus.setRoomStatusName("СС����");
		int rel = 0;
		try {
			roomstatusService.updeteRoomstatus(roomstatus);
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
	* @Title: testDelRoomstatus
	* @Description: �÷�������Ҫ���ã�����id  ɾ��
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Title: testgetRoomstatusById
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Description: �÷�������Ҫ���ã���ѯ����״̬
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void getRoomstatus()
	{
		List<Roomstatus> roomstatusList = roomstatusService.getRoomstatusList();
		for(Roomstatus room : roomstatusList){
			System.out.println("����״̬��"+room.getRoomStatusName());
		}
	}
	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}

	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}
	
	
}
