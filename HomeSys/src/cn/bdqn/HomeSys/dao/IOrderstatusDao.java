 /**  
* @Title: IOrderstatusDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午3:54:07
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Orderstatus;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IOrderstatusDao   
 * 类描述：   订单状态表
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午3:54:07   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午3:54:07   
 * 修改备注：   
 * @version    
 *    
 */
public interface IOrderstatusDao {
	
	/**
	 * 
	* @Title: saveOrderstatus
	* @Description: 该方法的主要作用：添加订单状态
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: 该方法的主要作用：修改订单状态
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: updateOrderstatus
	* @Description: 该方法的主要作用：删除订单状态
	* @param  @param orderstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delOrderstatus(Orderstatus orderstatus);
	
	/**
	 * 
	* @Title: getOradeOrderstatuById
	* @Description: 该方法的主要作用：根据id查询详情
	* @param  @param orderStatusId
	* @param  @return 设定文件  
	* @return  返回类型：Orderstatus   
	* @throws
	 */
	Orderstatus getOradeOrderstatuById(Integer orderStatusId);
	
	/**
	 * 
	* @Title: getOrderstatuList
	* @Description: 该方法的主要作用：查询全部的订单状态
	* @param  @return 设定文件  
	* @return  返回类型：List<Orderstatus>   
	* @throws
	 */
	List<Orderstatus> getOrderstatuList();
	
	

}
