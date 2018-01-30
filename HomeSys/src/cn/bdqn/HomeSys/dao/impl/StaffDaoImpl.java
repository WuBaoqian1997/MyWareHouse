 /**  
* @Title: StaffDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:21:13
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�StaffDaoImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:21:13   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:21:13   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class StaffDaoImpl extends HibernateDaoSupport implements IStaffDao {

	/**(�� Javadoc)
	 * <p>Title: saveStaff</p>
	 * <p>Description(����): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#saveStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void saveStaff(Staff staff) {
		this.getHibernateTemplate().save(staff);

	}

	/**(�� Javadoc)
	 * <p>Title: updateStaff</p>
	 * <p>Description(����): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#updateStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(staff);
	}

	/**(�� Javadoc)
	 * <p>Title: delStaff</p>
	 * <p>Description(����): </p>
	 * @param staff
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#delStaff(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public void delStaff(Staff staff) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(staff);
	}

	/**(�� Javadoc)
	 * <p>Title: getStaffById</p>
	 * <p>Description(����): </p>
	 * @param staffid
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IStaffDao#getStaffById(cn.bdqn.HomeSys.entity.Staff)
	 */

	@Override
	public Staff getStaffById(Integer staffid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Staff.class, staffid);
	}

	/**(�� Javadoc)
	 * <p>Title: getStaffList</p>
	 * <p>Description(����): </p>
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
	 * (�� Javadoc)
	* <p>Title: getStaffByName</p>
	* <p>Description(����): </p>
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
