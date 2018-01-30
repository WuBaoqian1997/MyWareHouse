 /**  
* @Title: PaymentServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:55:26
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPaymentDao;
import cn.bdqn.HomeSys.entity.Payment;
import cn.bdqn.HomeSys.service.IPaymentService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PaymentServiceImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:55:26   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:55:26   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class PaymentServiceImpl implements IPaymentService {

	private IPaymentDao paymentDao;
	
	/**(�� Javadoc)
	 * <p>Title: savePayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#savePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
 	public void savePayment(Payment payment) {
		paymentDao.savePayment(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#updatePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.updatePayment(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: delPayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.service.IPaymentService#delPayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void delPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.delPayment(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: getPaymentById</p>
	 * <p>Description(����): </p>
	 * @param paymentid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPaymentService#getPaymentById(java.lang.Integer)
	 */

	@Override
	public Payment getPaymentById(Integer paymentid) {
		// TODO Auto-generated method stub
		return paymentDao.getPaymentById(paymentid);
	}

	/**(�� Javadoc)
	 * <p>Title: getPaymentList</p>
	 * <p>Description(����): </p>
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
