 /**  
* @Title: OrdersitemDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 ����11:24:22
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IOrdersitemDao;
import cn.bdqn.HomeSys.entity.Ordersitem;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�OrdersitemDaoImpl   
 * ��������   ������ϸ��ʵ����
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-30 ����11:24:22   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-30 ����11:24:22   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class OrdersitemDaoImpl extends HibernateDaoSupport implements IOrdersitemDao {

	/**(�� Javadoc)
	 * <p>Title: saveOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#saveOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void saveOrdersItem(Ordersitem ordersitem) {
		this.getHibernateTemplate().save(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: updateOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#updateOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void updateOrdersItem(Ordersitem ordersitem) {
		this.getHibernateTemplate().update(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: delOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#delOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void delOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: getOrdersitemsById</p>
	 * <p>Description(����): </p>
	 * @param itemid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#getOrdersitemsById(java.lang.Integer)
	 */

	@Override
	public Ordersitem getOrdersitemsById(Integer itemid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Ordersitem.class, itemid);
	}

	/**(�� Javadoc)
	 * <p>Title: getOrdersitems</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#getOrdersitems()
	 */

	@Override
	public List<Ordersitem> getOrdersitems() {
		String hql="from Ordersitem";
		Session session = this.getSession();
		return session.createQuery(hql).list();
	}

	@Override
	public List<Ordersitem> getOrdersitemsByOrdersId(Integer ordersid) {
		Session session  = this.getSession();
		String hql ="from Ordersitem where orders.orderId=?";
		return session.createQuery(hql).setParameter(0,ordersid).list();
	}

}
