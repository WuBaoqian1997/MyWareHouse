 /**  
* @Title: IRoleService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:41:51
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Role;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IRoleService   
 * 类描述：   角色的业务逻辑类
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:41:51   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:41:51   
 * 修改备注：   
 * @version    
 *    
 */
public interface IRoleService {
	
/**
 * 
* @Title: saveIRole
* @Description: 该方法的主要作用：增加角色
* @param  @param accommodation 设定文件  
* @return  返回类型：void   
* @throws
 */
	void saveRole(Role role);
	/**
	 * 
	* @Title: updateIRole
	* @Description: 该方法的主要作用：修改角色
	* @param  @param role 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateRole(Role role);
	/**
	 * 
	* @Title: delIRole
	* @Description: 该方法的主要作用：删除角色
	* @param  @param role 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delRole(Role role);
	/**
	 * 
	* @Title: getRoleById
	* @Description: 该方法的主要作用：根据编号获得角色
	* @param  @param roleId
	* @param  @return 设定文件  
	* @return  返回类型：Role   
	* @throws
	 */
	Role getRoleById(Integer roleId);
	/**
	 * 
	* @Title: getRoleList
	* @Description: 该方法的主要作用：获取所有的角色
	* @param  @return 设定文件  
	* @return  返回类型：List<Role>   
	* @throws
	 */
	List<Role> getRoleList();
}
