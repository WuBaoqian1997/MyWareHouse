package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IOrdersDao;
import cn.bdqn.HomeSys.entity.Orders;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�OrdersDaoImpl   
* ��������   ������Dao��ʵ����
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:26:48   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:26:48   
* �޸ı�ע��   
* @version    
*
 */
public class OrdersDaoImpl extends HibernateDaoSupport implements IOrdersDao {

	/**
	 * (�� Javadoc)
	* <p>Title: saveOrders</p>
	* <p>Description(����):��Ӷ���</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#saveOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: updateOrders</p>
	* <p>Description(����): �޸Ķ���</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#updateOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delOrders</p>
	* <p>Description(����): ɾ������</p>
	* @param orders
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#delOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOrdersByID</p>
	* <p>Description(����): ����ID��ȡ����</p>
	* @param ordersID
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#getOrdersByID(java.lang.Integer)
	 */
	public Orders getOrdersByID(Integer ordersID) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orders.class, ordersID);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOrderList</p>
	* <p>Description(����): ��ȡ����ID</p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrdersDao#getOrderList()
	 */
	@Override
	public List<Orders> getOrderList() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Orders").list();
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: getOrderByRoomid</p>
	* <p>Description(����):���ݷ���Ų�ѯ������Ϣ </p>
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
