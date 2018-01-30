 /**  
* @Title: IOrdersitemService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 ����11:27:25
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Ordersitem;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IOrdersitemService   
 * ��������   ҵ���߼��ӿ�
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-30 ����11:27:25   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-30 ����11:27:25   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IOrdersitemService {

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
