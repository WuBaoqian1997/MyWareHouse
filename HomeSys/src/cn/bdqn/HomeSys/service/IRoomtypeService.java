 /**  
* @Title: IRoomtypeService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:19:55
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IRoomtypeService   
 * ��������   
 * �����ˣ�Sun Zhong Tian  
 * ����ʱ�䣺2017-7-24 ����4:19:55   
 * �޸��ˣ�Sun Zhong Tian    
 * �޸�ʱ�䣺2017-7-24 ����4:19:55   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IRoomtypeService {
	/**
	 * 
	* @Title: savaRoomtype
	* @Description: �÷�������Ҫ���ã����
	* @param  @param roomtype �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void savaRoomtype(Roomtype roomtype);

	/**
	 * 
	* @Title: updateRoomtype
	* @Description: �÷�������Ҫ���ã��޸�
	* @param  @param roomtype �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateRoomtype(Roomtype roomtype);
	
	/**
	 * 
	* @Title: delRoomtype
	* @Description: �÷�������Ҫ���ã�ɾ��
	* @param  @param roomtype �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delRoomtype(Roomtype roomtype);
	
	/**
	 * @return 
	 * 
	* @Title: getRoomtypeById
	* @Description: �÷�������Ҫ���ã�����Id��ѯ
	* @param  @param roomtypeId �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	Roomtype getRoomtypeById(Integer roomtypeId);
	
	/**
	 * 
	* @Title: getRoomtypeList
	* @Description: �÷�������Ҫ���ã���ѯ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Roomtype>   
	* @throws
	 */
	List<Roomtype> getRoomtypeList();
	
	/**
	 * 
	* @Title: getRoomtypeList
	* @Description: �÷�������Ҫ���ã���ѯ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Roomtype>   
	* @throws
	 */
	List<Roomtype> getRoomtypeList(int fist,int size);
	/**
	 * 
	 * @Title: getRoomtypeCount
	 * @Description: �÷�������Ҫ���ã���ѯ���͵��ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	int getRoomtypeCount();

	
	List<Roomtype> getAllRoomType();
}
