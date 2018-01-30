 /**  
* @Title: RoleServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:46:22
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IAccommodationDao;
import cn.bdqn.HomeSys.dao.IRoleDao;
import cn.bdqn.HomeSys.entity.Role;
import cn.bdqn.HomeSys.service.IRoleService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoleServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:46:22   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:46:22   
 * 修改备注：   
 * @version    
 *    
 */
public class RoleServiceImpl implements IRoleService {

	/**(非 Javadoc)
	 * <p>Title: saveIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#saveIRole(cn.bdqn.HomeSys.entity.Role)
	 */
	IRoleDao RoleDao = null;
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.saveRole(role);
	}

	/**(非 Javadoc)
	 * <p>Title: updateIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#updateIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.updateRole(role);
	}

	/**(非 Javadoc)
	 * <p>Title: delIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#delIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void delRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.delRole(role);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoleById</p>
	 * <p>Description(描述): </p>
	 * @param roleId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoleService#getRoleById(java.lang.Integer)
	 */

	@Override
	public Role getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return RoleDao.getRoleById(roleId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoleList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoleService#getRoleList()
	 */

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		return RoleDao.getRoleList();
	}

	public IRoleDao getRoleDao() {
		return RoleDao;
	}

	public void setRoleDao(IRoleDao roleDao) {
		RoleDao = roleDao;
	}
	
}
