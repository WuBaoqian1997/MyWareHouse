 /**  
* @Title: StaffDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:21:13
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IStaffDao;
import cn.bdqn.HomeSys.entity.Staff;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：StaffDaoImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:21:13   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:21:13   
 * 修改备注：   
 * @version    
 *    
 */
public class StaffDaoImpl extends HibernateDaoSupport implements IStaffDao {

	/**(非 Javadoc)
	 * <p>Title: saveStaff</p>
	 * <p>Description(描述): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#saveStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void saveStaff(Staff staff) {
		this.getHibernateTemplate().save(staff);

	}

	/**(非 Javadoc)
	 * <p>Title: updateStaff</p>
	 * <p>Description(描述): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#updateStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(staff);
	}

	/**(非 Javadoc)
	 * <p>Title: delStaff</p>
	 * <p>Description(描述): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#delStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void delStaff(Staff staff) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(staff);
	}

	/**(非 Javadoc)
	 * <p>Title: getStaffById</p>
	 * <p>Description(描述): </p>
	 * @param staffid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#getStaffById(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public Staff getStaffById(Integer staffid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Staff.class, staffid);
	}

	/**(非 Javadoc)
	 * <p>Title: getStaffList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#getStaffList()
	 */

	@Override
	public List<Staff> getStaffList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		return session.createQuery("from Staff").list();
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getStaffByName</p>
	* <p>Description(描述): </p>
	* @param staffName
	* @return
	* @see cn.bdqn.HomeSys.dao.IStaffDao#getStaffByName(java.lang.String)
	 */
	@Override
	public Staff getStaffByName(String staffName) {
		Session sessiom  = this.getSession();
		String hql = "from Staff where staffName = ?";
		return (Staff)sessiom.createQuery(hql).setParameter(0, staffName).uniqueResult();
	}
}
