 /**  
* @Title: RoomtypeServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:33:30
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomtypeServiceImplTest   
 * ��������   
 * �����ˣ�Sun Zhong Tian
 * ����ʱ�䣺2017-7-24 ����4:33:30   
 * �޸��ˣ�Sun Zhong Tian
 * �޸�ʱ�䣺2017-7-24 ����4:33:30   
 * �޸ı�ע��   
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
		roomtype.setRoomTypeId(((Long)System.currentTimeMillis()).intValue());//long�����ȡ��ǰ����
		roomtype.setBedType(111);
		roomtype.setRoomTypeName("����ͳ");
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
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}

	
	
	/**
	 * 
	* @Title: testUpdateRoomtype
	* @Description: �÷�������Ҫ���ã� ����id  ���Ĵ󴲷�С����
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testUpdateRoomtype(){
		Roomtype roomtype = roomtypeService.getRoomtypeById(1944048497);
		roomtype.setRoomTypeName("��ͳ��");
		int rel = 0;
		try {
			roomtypeService.updateRoomtype(roomtype);
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
	* @Title: testdelRoomtype
	* @Description: �÷�������Ҫ���ã�����id ɾ������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Title: testgetRoomtypeById
	* @Description: �÷�������Ҫ���ã�����id ��ѯ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
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
	* @Description: �÷�������Ҫ���ã���ѯȫ������
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetRoomtype()
	{
		List<Roomtype> roomtypeList = roomtypeService.getRoomtypeList();
		for(Roomtype roomtype :roomtypeList)
		{
			System.out.println("��������"+roomtype.getRoomTypeName());
			System.out.println("�������"+roomtype.getBedType());
			System.out.println("����۸�"+roomtype.getAcreage());
		}
	}
	
	public IRoomtypeService getRoomtypeService() {
		return roomtypeService;
	}

	public void setRoomtypeService(IRoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}
	
	
}
