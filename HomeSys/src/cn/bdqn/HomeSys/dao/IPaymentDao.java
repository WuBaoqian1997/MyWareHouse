 /**  
* @Title: IPaymentDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:50:02
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Payment;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IPaymentDao   
 * ��������   ֧����ʽ��
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:50:02   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:50:02   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IPaymentDao {

	/**
	 * 
	* @Title: saveOrderstatus
	* @Description: �÷�������Ҫ���ã����֧����ʽ
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void savePayment(Payment payment);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: �÷�������Ҫ���ã��޸�֧����ʽ
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updatePayment(Payment payment);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: �÷�������Ҫ���ã�ɾ��֧����ʽ
	* @param  @param orderstatus �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delPayment(Payment payment);
	
	/**
	 * 
	* @Title: getOradeOrderstatuById
	* @Description: �÷�������Ҫ���ã�����id��ѯ����
	* @param  @param orderStatusId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Orderstatus   
	* @throws
	 */
	Payment getPaymentById(Integer paymentid);
	
	/**
	 * 
	* @Title: getOrderstatuList
	* @Description: �÷�������Ҫ���ã���ѯȫ����֧����ʽ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Orderstatus>   
	* @throws
	 */
	List<Payment> getPaymentList();
}
