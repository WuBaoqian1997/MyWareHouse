 /**  
* @Title: IRoomstatusDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����6:32:56
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomstatus;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IRoomstatusDao   
 * ��������   
 * �����ˣ�Sun Zhong Tian 
 * ����ʱ�䣺2017-7-24 ����6:32:56   
 * �޸��ˣ�Sun Zhong Tian 
 * �޸�ʱ�䣺2017-7-24 ����6:32:56   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IRoomstatusDao {
	/**
	 * 
	* @Title: savaRoomstatus
	* @Description: �÷�������Ҫ���ã����ӷ���
	* @param  @param roomstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void savaRoomstatus(Roomstatus roomstatus);
	
	
	/**
	 * 
	* @Title: updeteRoomstatus
	* @Description: �÷�������Ҫ���ã��޸�
	* @param  @param roomstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updeteRoomstatus(Roomstatus roomstatus);
	
	/**
	 * 
	* @Title: delRoomstatus
	* @Description: �÷�������Ҫ���ã�ɾ��
	* @param  @param roomstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delRoomstatus(Roomstatus roomstatus);
	
	/**
	 * 
	* @Title: getRoomstatusById
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param  @param roomstatusId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Roomstatus   
	* @throws
	 */
	Roomstatus getRoomstatusById(Integer roomstatusId);
	
	/**
	 * 
	* @Title: getRoomstatusList
	* @Description: �÷�������Ҫ���ã���ѯ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Roomstatus>   
	* @throws
	 */
	List<Roomstatus>getRoomstatusList();
	
	/**
	 * 
	* @Title: getRoomstatusById
	* @Description: �÷�������Ҫ���ã�����Name��ѯ
	* @param  @param roomstatusName 
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Roomstatus   
	* @throws
	 */
	Roomstatus getRoomstatusByName(String roomstatusName);
}