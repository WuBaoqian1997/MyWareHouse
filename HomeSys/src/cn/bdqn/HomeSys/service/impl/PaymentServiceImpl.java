 /**  
* @Title: PaymentServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:55:26
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPaymentDao;
import cn.bdqn.HomeSys.entity.Payment;
import cn.bdqn.HomeSys.service.IPaymentService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：PaymentServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:55:26   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:55:26   
 * 修改备注：   
 * @version    
 *    
 */
public class PaymentServiceImpl implements IPaymentService {

	private IPaymentDao paymentDao;
	
	/**(非 Javadoc)
	 * <p>Title: savePayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#savePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
 	public void savePayment(Payment payment) {
		paymentDao.savePayment(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#updatePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.updatePayment(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: delPayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#delPayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void delPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.delPayment(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: getPaymentById</p>
	 * <p>Description(描述): </p>
	 * @param paymentid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPaymentService#getPaymentById(java.lang.Integer)
	 */

	@Override
	public Payment getPaymentById(Integer paymentid) {
		// TODO Auto-generated method stub
		return paymentDao.getPaymentById(paymentid);
	}

	/**(非 Javadoc)
	 * <p>Title: getPaymentList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPaymentService#getPaymentList()
	 */

	@Override
	public List<Payment> getPaymentList() {
		// TODO Auto-generated method stub
		return paymentDao.getPaymentList();
	}

	
	
	
	public IPaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(IPaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

}
