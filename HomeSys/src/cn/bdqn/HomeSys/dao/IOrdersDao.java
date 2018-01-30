package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Orders;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：IOrders   
* 类描述：   订单表dao层接口
* 创建人：武保谦
* 创建时间：2017-7-24 下午3:58:53   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午3:58:53   
* 修改备注：   
* @version    
*
 */
public interface IOrdersDao {

	/**
	 * 
	* @Title: saveOrders
	* @Description: 该方法的主要作用：添加订单
	* @param  @param orders 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveOrders(Orders orders);
	
	/**
	 * 
	* @Title: updateOrders
	* @Description: 该方法的主要作用：修改订单
	* @param  @param orders 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateOrders(Orders orders);
	
	/**
	 * 
	* @Title: delOrders
	* @Description: 该方法的主要作用：删除订单
	* @param  @param orders 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delOrders(Orders orders);
	
	/**
	 * 
	* @Title: getOrdersByID
	* @Description: 该方法的主要作用：根据ID获取订单
	* @param  @param ordersID
	* @param  @return 设定文件  
	* @return  返回类型：Orders   
	* @throws
	 */
	Orders getOrdersByID(Integer ordersID);
	
	/**
	 * 
	* @Title: getOrderList
	* @Description: 该方法的主要作用： 获取所以订单
	* @param  @return 设定文件  
	* @return  返回类型：List<Orders>   
	* @throws
	 */
	List<Orders> getOrderList();
	
	/**
	 * 
	* @Title: getOrderByRoomid
	* @Description: 该方法的主要作用：根据房间号查询订单信息
	* @param  @return 设定文件  
	* @return  返回类型：Orders   
	* @throws
	 */
	Orders getOrderByRoomid(Integer roomid);
}
