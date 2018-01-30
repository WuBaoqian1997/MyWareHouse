 /**  
* @Title: ShiftDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:00:27
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IShiftDao;
import cn.bdqn.HomeSys.entity.Shift;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�ShiftDaoImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:00:27   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:00:27   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class ShiftDaoImpl extends HibernateDaoSupport implements IShiftDao {

	/**(�� Javadoc)
	 * <p>Title: saveShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#saveShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void saveShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(shift);
		
	}

	/**(�� Javadoc)
	 * <p>Title: updateShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#updateShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void updateShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(shift);
	}

	/**(�� Javadoc)
	 * <p>Title: delShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#delShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void delShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(shift);
	}

	/**(�� Javadoc)
	 * <p>Title: getShiftById</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#getShiftById(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public Shift getShiftById(Integer shiftid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Shift.class, shiftid);
	}

	/**(�� Javadoc)
	 * <p>Title: getShiftsList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#getShiftsList()
	 */

	@Override
	public List<Shift> getShiftsList() {
		Session session = this.getSession();
		return session.createQuery("from Shift").list();
	}

}
