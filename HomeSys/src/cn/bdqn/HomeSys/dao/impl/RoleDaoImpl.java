 /**  
* @Title: RoleDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:23:32
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoleDaoImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����4:23:32   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����4:23:32   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoleDaoImpl extends HibernateDaoSupport implements IRoleDao {

	/**(�� Javadoc)
	 * <p>Title: saveIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#saveIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(role);
	}

	/**(�� Javadoc)
	 * <p>Title: updateIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#updateIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(role);
	}

	/**(�� Javadoc)
	 * <p>Title: delIRole</p>
	 * <p>Description(����): </p>
	 * @param role
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#delIRole(cn.bdqn.HomeSys.entity.Role)
	 */

	@Override
	public void delRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(role);

	}

	/**(�� Javadoc)
	 * <p>Title: getRoleById</p>
	 * <p>Description(����): </p>
	 * @param roleId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoleDao#getRoleById(java.lang.Integer)
	 */

	@Override
	public Role getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Role.class, roleId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoleList</p>
	 * <p>Description(����): </p>
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
