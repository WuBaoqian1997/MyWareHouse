 /**  
* @Title: RoomtypeDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:14:50
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IRoomtypeDao;
import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomtypeDaoImpl   
 * 类描述：   
 * 创建人：Sun Zhong Tian  
 * 创建时间：2017-7-24 下午4:14:50   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午4:14:50   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomtypeDaoImpl extends HibernateDaoSupport implements
		IRoomtypeDao {

	/**(非 Javadoc)
	 * <p>Title: savaRoomtype</p>
	 * <p>Description(描述): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#savaRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void savaRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(roomtype);
	}

	/**(非 Javadoc)
	 * <p>Title: updateRoomtype</p>
	 * <p>Description(描述): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#updateRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void updateRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(roomtype);
	}

	/**(非 Javadoc)
	 * <p>Title: delRoomtype</p>
	 * <p>Description(描述): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#delRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void delRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(roomtype);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomtypeById</p>
	 * <p>Description(描述): </p>
	 * @param roomtypeId
	 * @return 
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#getRoomtypeById(java.lang.Integer)
	 */

	@Override
	public Roomtype getRoomtypeById(Integer roomtypeId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Roomtype.class, roomtypeId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomtypeList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#getRoomtypeList()
	 */

	@Override
	public List<Roomtype> getRoomtypeList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		String hql="from Roomtype";
		return session.createQuery(hql).list();
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomtypeList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#getRoomtypeList()
	 */

	@Override
	public List<Roomtype> getRoomtypeList(int first,int size) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(Roomtype.class);
		return this.getHibernateTemplate().findByCriteria(dc, first, size);
	}
	/**
	 * (非 Javadoc)
	 * <p>Title: getRoomtypeCount</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomtypeDao#getRoomtypeCount()
	 */
	@Override
	public int getRoomtypeCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Roomtype").listIterator().next()).intValue();
	}
	
	@Override
	public List<Roomtype> getAllRoomType() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Roomtype").list();
	}
}
