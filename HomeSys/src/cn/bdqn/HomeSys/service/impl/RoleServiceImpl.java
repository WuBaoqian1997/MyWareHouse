 /**  
* @Title: RoleServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:46:22
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoleServiceImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����4:46:22   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����4:46:22   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoleServiceImpl implements IRoleService {

	/**(�� Javadoc)
	 * <p>Title: saveIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#saveIRole(cn.bdqn.HomeSys.entity.Role)
	 */
	IRoleDao RoleDao = null;
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.saveRole(role);
	}

	/**(�� Javadoc)
	 * <p>Title: updateIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#updateIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.updateRole(role);
	}

	/**(�� Javadoc)
	 * <p>Title: delIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.service.IRoleService#delIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void delRole(Role role) {
		// TODO Auto-generated method stub
		RoleDao.delRole(role);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoleById</p>
	 * <p>Description(����): </p>
	 * @param roleId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoleService#getRoleById(java.lang.Integer)
	 */

	@Override
	public Role getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return RoleDao.getRoleById(roleId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoleList</p>
	 * <p>Description(����): </p>
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
