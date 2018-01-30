package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomtype;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�IRoomtypeDao   
* ��������   
* �����ˣ�Sun Zhong Tian  
* ����ʱ�䣺2017-7-24 ����3:51:19   
* �޸��ˣ�Sun Zhong Tian  
* �޸�ʱ�䣺2017-7-24 ����3:51:19   
* �޸ı�ע��   
* @version    
*
 */
public interface IRoomtypeDao {
	
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
	List<Roomtype> getRoomtypeList(int first,int size);
	
	/**
	 * 
	 * @Title: getRoomtypeCount
	 * @Description: �÷�������Ҫ���ã���ѯ���͵��ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	int getRoomtypeCount();
	
	/**
	 * 
	 * @Title: getAllRoomType
	 * @Description: �÷�������Ҫ���ã���ѯȫ��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�List<Roomtype>   
	 * @throws
	 */
	List<Roomtype> getAllRoomType();
	
	
	
	
}
