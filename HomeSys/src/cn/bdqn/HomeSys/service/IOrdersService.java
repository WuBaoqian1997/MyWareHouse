package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Orders;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�IOrdersServiceImpl   
* ��������   ������service��ӿ�
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:28:39   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:28:39   
* �޸ı�ע��   
* @version    
*
 */
public interface IOrdersService {
	/**
	 * 
	* @Title: saveOrders
	* @Description: �÷�������Ҫ���ã���Ӷ���
	* @param  @param orders �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveOrders(Orders orders);
	
	/**
	 * 
	* @Title: updateOrders
	* @Description: �÷�������Ҫ���ã��޸Ķ���
	* @param  @param orders �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateOrders(Orders orders);
	
	/**
	 * 
	* @Title: delOrders
	* @Description: �÷�������Ҫ���ã�ɾ������
	* @param  @param orders �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delOrders(Orders orders);
	
	/**
	 * 
	* @Title: getOrdersByID
	* @Description: �÷�������Ҫ���ã�����ID��ȡ����
	* @param  @param ordersID
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Orders   
	* @throws
	 */
	Orders getOrdersByID(Integer ordersID);
	
	/**
	 * 
	* @Title: getOrderList
	* @Description: �÷�������Ҫ���ã� ��ȡ���Զ���
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Orders>   
	* @throws
	 */
	List<Orders> getOrderList();
	
	/**
	 * 
	* @Title: getOrderByRoomid
	* @Description: �÷�������Ҫ���ã����ݷ���Ų�ѯ������Ϣ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Orders   
	* @throws
	 */
	Orders getOrderByRoomid(Integer roomid);
}
