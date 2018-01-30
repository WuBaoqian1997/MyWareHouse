 /**  
* @Title: PaymentDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:52:40
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IPaymentDao;
import cn.bdqn.HomeSys.entity.Payment;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PaymentDaoImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:52:40   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:52:40   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class PaymentDaoImpl extends HibernateDaoSupport implements IPaymentDao {

		
	
	/**(�� Javadoc)
	 * <p>Title: savePayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#savePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void savePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#updatePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: delPayment</p>
	 * <p>Description(����): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#delPayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void delPayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(payment);
	}

	/**(�� Javadoc)
	 * <p>Title: getPaymentById</p>
	 * <p>Description(����): </p>
	 * @param paymentid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#getPaymentById(java.lang.Integer)
	 */

	@Override
	public Payment getPaymentById(Integer paymentid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Payment.class, paymentid);
	}

	/**(�� Javadoc)
	 * <p>Title: getPaymentList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#getPaymentList()
	 */

	@Override
	public List<Payment> getPaymentList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		return session.createQuery("from Payment").list();
	}

}
