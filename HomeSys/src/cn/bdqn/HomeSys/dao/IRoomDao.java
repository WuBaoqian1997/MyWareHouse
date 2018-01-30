 /**  
* @Title: IRoomDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:27:39
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IRoomDao   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����4:27:39   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����4:27:39   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IRoomDao {
/**
 * 
* @Title: saveRoom
* @Description: �÷�������Ҫ���ã���ӷ���
* @param  @param room �趨�ļ�  
* @return  �������ͣ�void   
* @throws
 */
	void saveRoom(Room room);
	/**
	 * 
	* @Title: updateRoom
	* @Description: �÷�������Ҫ���ã��޸ķ���
	* @param  @param room �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateRoom(Room room);
	/**
	 * 
	* @Title: delRoom
	* @Description: �÷�������Ҫ���ã����ķ�����
	* @param  @param room �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delRoom(Room room);
	/**
	 * 
	* @Title: getRoomById
	* @Description: �÷�������Ҫ���ã�ɾ������
	* @param  @param roomId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Room   
	* @throws
	 */
	Room getRoomById(Integer roomId);
	/**
	 * 
	* @Title: getRoomList
	* @Description: �÷�������Ҫ���ã����ݱ�Ż�÷����
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Room>   
	* @throws
	 */
	List<Room> getRoomList();
	
	/**
	 * 
	* @Title: getRoomList
	* @Description: �÷�������Ҫ���ã�����¥���ѯ������Ϣ
	* @param  @param floor
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Room>   
	* @throws
	 */
	List<Room> getRoomList(Integer floor);
	
	/**
	 * 
	* @Title: getRoomByStatus
	* @Description: �÷�������Ҫ���ã����ݷ���״̬���Ʋ�ѯ������Ϣ
	* @param  @param roomtype
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Room>   
	* @throws
	 */
	List<Room> getRoomByStatus(Roomstatus roomstatus);
	
	List<Room> getRoomList(int first,int size);
	/**
	 * 
	 * @Title: getRoomCount
	 * @Description: �÷�������Ҫ���ã���ѯ������ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	int getRoomCount();
	
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: �÷�������Ҫ���ã���ѯ¥����ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	int getPositionCount();
	
	/**
	 * 
	* @Title: getRoomByType
	* @Description: �÷�������Ҫ���ã����ݷ����������Ʋ�ѯ������Ϣ
	* @param  @param roomstatus
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Room>   
	* @throws
	 */
	List<Room> getRoomByType(Roomtype roomtype);

	/**
	 * 
	* @Title: getRoomByRoomStatus
	* @Description: �÷�������Ҫ���ã����ݷ���״̬��ѯ������Ϣ
	* @param  @param status
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Room>   
	* @throws
	 */
	List<Room>getRoomByRoomStatus(String status);
	
}
