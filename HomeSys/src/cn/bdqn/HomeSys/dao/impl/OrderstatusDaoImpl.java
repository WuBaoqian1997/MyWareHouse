 /**  
* @Title: OrderstatusDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午3:55:46
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IOrderstatusDao;
import cn.bdqn.HomeSys.entity.Orderstatus;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：OrderstatusDaoImpl   
 * 类描述：   订单状态表的实现类
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午3:55:46   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午3:55:46   
 * 修改备注：   
 * @version    
 *    
 */
public class OrderstatusDaoImpl extends HibernateDaoSupport implements
		IOrderstatusDao {

	/**(非 Javadoc)
	 * <p>Title: saveOrderstatus</p>
	 * <p>Description(描述): 添加订单状态</p>
	 * @param orderstatus
	 * @see cn.bdqn.HomeSys.dao.IOrderstatusDao#saveOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */

	@Override
	public void saveOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(orderstatus);
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: updateOrderstatus</p>
	* <p>Description(描述): 修改订单状态</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#updateOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void updateOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(orderstatus);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delOrderstatus</p>
	* <p>Description(描述): 删除订单状态</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#delOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void delOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orderstatus);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getOradeOrderstatuById</p>
	* <p>Description(描述):根据id查询订单状态 </p>
	* @param orderStatusId
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#getOradeOrderstatuById(java.lang.Integer)
	 */
	@Override
	public Orderstatus getOradeOrderstatuById(Integer orderStatusId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orderstatus.class, orderStatusId);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getOrderstatuList</p>
	* <p>Description(描述):查询全部的订单状态 </p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#getOrderstatuList()
	 */
	@Override
	public List<Orderstatus> getOrderstatuList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		return session.createQuery("from Orderstatus").list();
	}

}
