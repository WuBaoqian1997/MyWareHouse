package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrdersDao;
import cn.bdqn.HomeSys.dao.impl.OrdersDaoImpl;
import cn.bdqn.HomeSys.entity.Orders;
import cn.bdqn.HomeSys.service.IOrdersService;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�OrdersServiceImpl   
* ��������   ������service��ӿ�
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:34:52   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:34:52   
* �޸ı�ע��   
* @version    
*
 */
public class OrdersServiceImpl implements IOrdersService {

	IOrdersDao ordersDao = new OrdersDaoImpl();
	
	/**
	 * (�� Javadoc)
	* <p>Title: saveOrders</p>
	* <p>Description(����): ��Ӷ���</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#saveOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.saveOrders(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: updateOrders</p>
	* <p>Description(����): �޸Ķ���</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#updateOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.updateOrders(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delOrders</p>
	* <p>Description(����): ɾ������</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#delOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.delOrders(orders);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOrdersByID</p>
	* <p>Description(����):����ID��ȡ������Ϣ</p>
	* @param ordersID
	* @return
	* @see cn.bdqn.HomeSys.service.IOrdersService#getOrdersByID(java.lang.Integer)
	 */
	@Override
	public Orders getOrdersByID(Integer ordersID) {
		// TODO Auto-generated method stub
		return ordersDao.getOrdersByID(ordersID);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOrderList</p>
	* <p>Description(����): ��ȡ���ж�����Ϣ</p>
	* @return
	* @see cn.bdqn.HomeSys.service.IOrdersService#getOrderList()
	 */
	@Override
	public List<Orders> getOrderList() {
		// TODO Auto-generated method stub
		return ordersDao.getOrderList();
	}

	public IOrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(IOrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: getOrderByRoomid</p>
	* <p>Description(����):���ݷ���Ų�ѯ������Ϣ </p>
	* @param roomid
	* @return
	* @see cn.bdqn.HomeSys.service.IOrdersService#getOrderByRoomid(java.lang.Integer)
	 */
	@Override
	public Orders getOrderByRoomid(Integer roomid) {
		return ordersDao.getOrderByRoomid(roomid);
	}

	
	
}
