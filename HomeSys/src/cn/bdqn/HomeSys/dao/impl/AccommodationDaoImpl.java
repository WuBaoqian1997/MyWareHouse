 /**  
* @Title: AccommodationDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����12:02:57
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�AccommodationDaoImpl   
 * ��������   ס�����͵�ʵ����
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����12:02:57   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����12:02:57   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class AccommodationDaoImpl extends HibernateDaoSupport implements IAccommodationDao {

	/**(�� Javadoc)
	 * <p>Title: saveAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#saveAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void saveAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(accommodation);
	}

	/**(�� Javadoc)
	 * <p>Title: updateAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#updateAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void updateAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(accommodation);
	}

	/**(�� Javadoc)
	 * <p>Title: delAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#delAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void delAccommodation(Accommodation accommodation) {
		this.getHibernateTemplate().delete(accommodation);

	}

	/**(�� Javadoc)
	 * <p>Title: getAccommodationById</p>
	 * <p>Description(����): </p>
	 * @param accommodationId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IAccommodationDao#getAccommodationById(java.lang.Integer)
	 */

	@Override
	public Accommodation getAccommodationById(Integer accommodationId) {
		
		return this.getHibernateTemplate().get(Accommodation.class, accommodationId);
	}

	/**(�� Javadoc)
	 * <p>Title: getAccommodationList</p>
	 * <p>Description(����): </p>
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
