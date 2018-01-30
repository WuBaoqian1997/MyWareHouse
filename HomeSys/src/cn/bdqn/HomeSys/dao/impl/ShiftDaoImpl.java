 /**  
* @Title: ShiftDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:00:27
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
 * 项目名称：HomeSys   
 * 类名称：ShiftDaoImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:00:27   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:00:27   
 * 修改备注：   
 * @version    
 *    
 */
public class ShiftDaoImpl extends HibernateDaoSupport implements IShiftDao {

	/**(非 Javadoc)
	 * <p>Title: saveShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#saveShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void saveShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(shift);
		
	}

	/**(非 Javadoc)
	 * <p>Title: updateShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#updateShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void updateShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(shift);
	}

	/**(非 Javadoc)
	 * <p>Title: delShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#delShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void delShift(Shift shift) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(shift);
	}

	/**(非 Javadoc)
	 * <p>Title: getShiftById</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#getShiftById(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public Shift getShiftById(Integer shiftid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Shift.class, shiftid);
	}

	/**(非 Javadoc)
	 * <p>Title: getShiftsList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IShiftDao#getShiftsList()
	 */

	@Override
	public List<Shift> getShiftsList() {
		Session session = this.getSession();
		return session.createQuery("from Shift").list();
	}

}
