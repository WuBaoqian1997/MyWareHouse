 /**  
* @Title: PaymentDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:52:40
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
 * 项目名称：HomeSys   
 * 类名称：PaymentDaoImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:52:40   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:52:40   
 * 修改备注：   
 * @version    
 *    
 */
public class PaymentDaoImpl extends HibernateDaoSupport implements IPaymentDao {

		
	
	/**(非 Javadoc)
	 * <p>Title: savePayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#savePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void savePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#updatePayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: delPayment</p>
	 * <p>Description(描述): </p>
	 * @param payment
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#delPayment(cn.bdqn.HomeSys.entity.Payment)
	 */

	@Override
	public void delPayment(Payment payment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(payment);
	}

	/**(非 Javadoc)
	 * <p>Title: getPaymentById</p>
	 * <p>Description(描述): </p>
	 * @param paymentid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPaymentDao#getPaymentById(java.lang.Integer)
	 */

	@Override
	public Payment getPaymentById(Integer paymentid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Payment.class, paymentid);
	}

	/**(非 Javadoc)
	 * <p>Title: getPaymentList</p>
	 * <p>Description(描述): </p>
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
