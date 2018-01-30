 /**  
* @Title: RoleDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:23:32
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IRoleDao;
import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Role;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoleDaoImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:23:32   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:23:32   
 * 修改备注：   
 * @version    
 *    
 */
public class RoleDaoImpl extends HibernateDaoSupport implements IRoleDao {

	/**(非 Javadoc)
	 * <p>Title: saveIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#saveIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(role);
	}

	/**(非 Javadoc)
	 * <p>Title: updateIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#updateIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(role);
	}

	/**(非 Javadoc)
	 * <p>Title: delIRole</p>
	 * <p>Description(描述): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#delIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void delRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(role);

	}

	/**(非 Javadoc)
	 * <p>Title: getRoleById</p>
	 * <p>Description(描述): </p>
	 * @param roleId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#getRoleById(java.lang.Integer)
	 */

	@Override
	public Role getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Role.class, roleId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoleList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#getRoleList()
	 */

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		String hql="from Role";
		return session.createQuery(hql).list();
	}

}
