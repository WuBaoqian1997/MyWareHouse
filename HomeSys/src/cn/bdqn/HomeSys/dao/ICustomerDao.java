package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Customer;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：ICustomer   
* 类描述：   客户表dao层接口
* 创建人：武保谦
* 创建时间：2017-7-24 下午3:48:25   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午3:48:25   
* 修改备注：   
* @version    
*
 */
public interface ICustomerDao {
	
	/**
	 * 
	* @Title: saveCustomer
	* @Description: 该方法的主要作用：添加客户
	* @param  @param customer 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveCustomer(Customer customer);
	
	/**
	 * 
	* @Title: updateCustomer
	* @Description: 该方法的主要作用：
	* @param  @param customer 设定文件  修改客户信息
	* @return  返回类型：void   
	* @throws
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 
	* @Title: delCustomer
	* @Description: 该方法的主要作用：
	* @param  @param customer 设定文件  删除客户
	* @return  返回类型：void   
	* @throws
	 */
	void delCustomer(Customer customer);
	
	/**
	 * 
	* @Title: getCustomerByID
	* @Description: 该方法的主要作用：根据ID获取客户
	* @param  @param cuIntegerID
	* @param  @return 设定文件  
	* @return  返回类型：Customer   
	* @throws
	 */
	Customer getCustomerByID(Integer customerID);
	
	/**
	 * 
	* @Title: getCustomerList
	* @Description: 该方法的主要作用：获取全部客户
	* @param  @return 设定文件  
	* @return  返回类型：List<Customer>   
	* @throws
	 */
	List<Customer> getCustomerList();
}
