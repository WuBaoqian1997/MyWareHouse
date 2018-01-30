 /**  
* @Title: IOrdersitemDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 下午11:01:45
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Ordersitem;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IOrdersitemDao   
 * 类描述：   项目明细
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-30 下午11:01:45   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-30 下午11:01:45   
 * 修改备注：   
 * @version    
 *    
 */
public interface IOrdersitemDao {
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: 该方法的主要作用：添加
	* @param  @param ordersitem 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveOrdersItem(Ordersitem ordersitem);
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: 该方法的主要作用：修改
	* @param  @param ordersitem 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateOrdersItem(Ordersitem ordersitem);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: 该方法的主要作用：删除
	* @param  @param ordersitem 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delOrdersItem(Ordersitem ordersitem);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: 该方法的主要作用：根据id查询
	* @param  @param ordersitem 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	Ordersitem getOrdersitemsById(Integer itemid);
	
	/**
	 * 
	* @Title: saveOrdersItem
	* @Description: 该方法的主要作用：查询全部
	* @param  @param ordersitem 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	List<Ordersitem> getOrdersitems();
	
	/**
	 * 
	* @Title: getOrdersitemsByOrdersId
	* @Description: 该方法的主要作用：根据订单编号查询订单明细
	* @param  @param ordersid
	* @param  @return 设定文件  
	* @return  返回类型：List<Ordersitem>   
	* @throws
	 */
	List<Ordersitem> getOrdersitemsByOrdersId(Integer ordersid);

}
