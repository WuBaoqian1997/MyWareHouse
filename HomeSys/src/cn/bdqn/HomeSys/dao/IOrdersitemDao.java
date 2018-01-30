 /**  
* @Title: IOrdersitemDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 ����11:01:45
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Ordersitem;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IOrdersitemDao   
 * ��������   ��Ŀ��ϸ
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-30 ����11:01:45   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-30 ����11:01:45   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IOrdersitemDao {
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: �÷�������Ҫ���ã����
	* @param  @param ordersitem �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveOrdersItem(Ordersitem ordersitem);
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: �÷�������Ҫ���ã��޸�
	* @param  @param ordersitem �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateOrdersItem(Ordersitem ordersitem);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: �÷�������Ҫ���ã�ɾ��
	* @param  @param ordersitem �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delOrdersItem(Ordersitem ordersitem);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param  @param ordersitem �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	Ordersitem getOrdersitemsById(Integer itemid);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: �÷�������Ҫ���ã���ѯȫ��
	* @param  @param ordersitem �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	List<Ordersitem> getOrdersitems();
	
	/**
	 * 
	* @Title: getOrdersitemsByOrdersId
	* @Description: �÷�������Ҫ���ã����ݶ�����Ų�ѯ������ϸ
	* @param  @param ordersid
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Ordersitem>   
	* @throws
	 */
	List<Ordersitem> getOrdersitemsByOrdersId(Integer ordersid);

}
