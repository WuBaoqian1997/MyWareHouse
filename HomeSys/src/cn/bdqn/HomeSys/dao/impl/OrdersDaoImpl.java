package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IOrdersDao;
import cn.bdqn.HomeSys.entity.Orders;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：OrdersDaoImpl   
* 类描述：   订单表Dao层实现类
* 创建人：武保谦
* 创建时间：2017-7-24 下午4:26:48   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午4:26:48   
* 修改备注：   
* @version    
*
 */
public class OrdersDaoImpl extends HibernateDaoSupport implements IOrdersDao {

	/**
	 * (非 Javadoc)
	* <p>Title: saveOrders</p>
	* <p>Description(描述):添加订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#saveOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: updateOrders</p>
	* <p>Description(描述): 修改订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#updateOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delOrders</p>
	* <p>Description(描述): 删除订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#delOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getOrdersByID</p>
	* <p>Description(描述): 根据ID获取订单</p>
	* @param ordersID
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#getOrdersByID(java.lang.Integer)
	 */
	public Orders getOrdersByID(Integer ordersID) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orders.class, ordersID);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getOrderList</p>
	* <p>Description(描述): 获取所以ID</p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#getOrderList()
	 */
	@Override
	public List<Orders> getOrderList() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Orders").list();
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getOrderByRoomid</p>
	* <p>Description(描述):根据房间号查询订单信息 </p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#getOrderByRoomid()
	 */
	@Override
	public Orders getOrderByRoomid(Integer roomid) {
		String hql="from Orders where room.roomId=? and orderstatusid = 1";
		Session session = this.getSession();
		Orders orders = null;
		
			List<Orders> ordersList = session.createQuery(hql).setParameter(0, roomid)
										.list();
			if(ordersList.size()>0){
				orders = ordersList.get(0);
			}
				return orders;
	}

	
	
}
