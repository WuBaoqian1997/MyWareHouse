package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Customer;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�ICustomerService   
* ��������   �ͻ���service����
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:26:03   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:26:03   
* �޸ı�ע��   
* @version    
*
 */
public interface ICustomerService {
	/**
	 * 
	* @Title: saveCustomer
	* @Description: �÷�������Ҫ���ã���ӿͻ�
	* @param  @param customer �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveCustomer(Customer customer);
	
	/**
	 * 
	* @Title: updateCustomer
	* @Description: �÷�������Ҫ���ã�
	* @param  @param customer �趨�ļ�  �޸Ŀͻ���Ϣ
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 
	* @Title: delCustomer
	* @Description: �÷�������Ҫ���ã�
	* @param  @param customer �趨�ļ�  ɾ���ͻ�
	* @return  �������ͣ�void   
	* @throws
	 */
	void delCustomer(Customer customer);
	
	/**
	 * 
	* @Title: getCustomerByID
	* @Description: �÷�������Ҫ���ã�����ID��ȡ�ͻ�
	* @param  @param cuIntegerID
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Customer   
	* @throws
	 */
	Customer getCustomerByID(Integer customerID);
	
	/**
	 * 
	* @Title: getCustomerList
	* @Description: �÷�������Ҫ���ã���ȡȫ���ͻ�
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Customer>   
	* @throws
	 */
	List<Customer> getCustomerList();
}
