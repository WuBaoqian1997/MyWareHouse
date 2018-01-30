 /**  
* @Title: OrdersitemDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 下午11:24:22
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
 * 项目名称：HomeSys   
 * 类名称：OrdersitemDaoImpl   
 * 类描述：   订单明细的实现类
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-30 下午11:24:22   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-30 下午11:24:22   
 * 修改备注：   
 * @version    
 *    
 */
public class OrdersitemDaoImpl extends HibernateDaoSupport implements IOrdersitemDao {

	/**(非 Javadoc)
	 * <p>Title: saveOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#saveOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void saveOrdersItem(Ordersitem ordersitem) {
		this.getHibernateTemplate().save(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: updateOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#updateOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void updateOrdersItem(Ordersitem ordersitem) {
		this.getHibernateTemplate().update(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: delOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#delOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void delOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: getOrdersitemsById</p>
	 * <p>Description(描述): </p>
	 * @param itemid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IOrdersitemDao#getOrdersitemsById(java.lang.Integer)
	 */

	@Override
	public Ordersitem getOrdersitemsById(Integer itemid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Ordersitem.class, itemid);
	}

	/**(非 Javadoc)
	 * <p>Title: getOrdersitems</p>
	 * <p>Description(描述): </p>
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
