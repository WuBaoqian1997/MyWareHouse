 /**  
* @Title: AccommodationDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午12:02:57
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IAccommodationDao;
import cn.bdqn.HomeSys.entity.Accommodation;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：AccommodationDaoImpl   
 * 类描述：   住宿类型的实现类
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午12:02:57   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午12:02:57   
 * 修改备注：   
 * @version    
 *    
 */
public class AccommodationDaoImpl extends HibernateDaoSupport implements IAccommodationDao {

	/**(非 Javadoc)
	 * <p>Title: saveAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#saveAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void saveAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(accommodation);
	}

	/**(非 Javadoc)
	 * <p>Title: updateAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#updateAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void updateAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(accommodation);
	}

	/**(非 Javadoc)
	 * <p>Title: delAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#delAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void delAccommodation(Accommodation accommodation) {
		this.getHibernateTemplate().delete(accommodation);

	}

	/**(非 Javadoc)
	 * <p>Title: getAccommodationById</p>
	 * <p>Description(描述): </p>
	 * @param accommodationId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#getAccommodationById(java.lang.Integer)
	 */

	@Override
	public Accommodation getAccommodationById(Integer accommodationId) {
		
		return this.getHibernateTemplate().get(Accommodation.class, accommodationId);
	}

	/**(非 Javadoc)
	 * <p>Title: getAccommodationList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#getAccommodationList()
	 */

	@Override
	public List<Accommodation> getAccommodationList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		String hql="from Accommodation";
		return session.createQuery(hql).list();
	}

}
