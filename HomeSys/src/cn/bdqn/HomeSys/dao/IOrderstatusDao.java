 /**  
* @Title: IOrderstatusDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����3:54:07
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Orderstatus;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IOrderstatusDao   
 * ��������   ����״̬��
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����3:54:07   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����3:54:07   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IOrderstatusDao {
	
	/**
	 * 
	* @Title: saveOrderstatus
	* @Description: �÷�������Ҫ���ã���Ӷ���״̬
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: �÷�������Ҫ���ã��޸Ķ���״̬
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: �÷�������Ҫ���ã�ɾ������״̬
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: getOradeOrderstatuById
	* @Description: �÷�������Ҫ���ã�����id��ѯ����
	* @param  @param orderStatusId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Orderstatus   
	* @throws
	 */
	Orderstatus getOradeOrderstatuById(Integer orderStatusId);
	
	/**
	 * 
	* @Title: getOrderstatuList
	* @Description: �÷�������Ҫ���ã���ѯȫ���Ķ���״̬
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Orderstatus>   
	* @throws
	 */
	List<Orderstatus> getOrderstatuList();
	
	

}
