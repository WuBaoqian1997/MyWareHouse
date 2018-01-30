 /**  
* @Title: IPaymentDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:50:02
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Payment;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IPaymentDao   
 * 类描述：   支付方式表
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:50:02   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:50:02   
 * 修改备注：   
 * @version    
 *    
 */
public interface IPaymentDao {

	/**
	 * 
	* @Title: saveOrderstatus
	* @Description: 该方法的主要作用：添加支付方式
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void savePayment(Payment payment);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: 该方法的主要作用：修改支付方式
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updatePayment(Payment payment);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: 该方法的主要作用：删除支付方式
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delPayment(Payment payment);
	
	/**
	 * 
	* @Title: getOradeOrderstatuById
	* @Description: 该方法的主要作用：根据id查询详情
	* @param  @param orderStatusId
	* @param  @return 设定文件  
	* @return  返回类型：Orderstatus   
	* @throws
	 */
	Payment getPaymentById(Integer paymentid);
	
	/**
	 * 
	* @Title: getOrderstatuList
	* @Description: 该方法的主要作用：查询全部的支付方式
	* @param  @return 设定文件  
	* @return  返回类型：List<Orderstatus>   
	* @throws
	 */
	List<Payment> getPaymentList();
}
