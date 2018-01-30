package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrdersDao;
import cn.bdqn.HomeSys.dao.impl.OrdersDaoImpl;
import cn.bdqn.HomeSys.entity.Orders;
import cn.bdqn.HomeSys.service.IOrdersService;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：OrdersServiceImpl   
* 类描述：   订单表service层接口
* 创建人：武保谦
* 创建时间：2017-7-24 下午4:34:52   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午4:34:52   
* 修改备注：   
* @version    
*
 */
public class OrdersServiceImpl implements IOrdersService {

	IOrdersDao ordersDao = new OrdersDaoImpl();
	
	/**
	 * (非 Javadoc)
	* <p>Title: saveOrders</p>
	* <p>Description(描述): 添加订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#saveOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.saveOrders(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: updateOrders</p>
	* <p>Description(描述): 修改订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#updateOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.updateOrders(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delOrders</p>
	* <p>Description(描述): 删除订单</p>
	* @param orders
	* @see cn.bdqn.HomeSys.service.IOrdersService#delOrders(cn.bdqn.HomeSys.entity.Orders)
	 */
	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.delOrders(orders);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getOrdersByID</p>
	* <p>Description(描述):根据ID获取订单信息</p>
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
	 * (非 Javadoc)
	* <p>Title: getOrderList</p>
	* <p>Description(描述): 获取所有订单信息</p>
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
	 * (非 Javadoc)
	* <p>Title: getOrderByRoomid</p>
	* <p>Description(描述):根据房间号查询订单信息 </p>
	* @param roomid
	* @return
	* @see cn.bdqn.HomeSys.service.IOrdersService#getOrderByRoomid(java.lang.Integer)
	 */
	@Override
	public Orders getOrderByRoomid(Integer roomid) {
		return ordersDao.getOrderByRoomid(roomid);
	}

	
	
}
