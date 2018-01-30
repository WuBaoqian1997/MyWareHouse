 /**  
* @Title: RoomstatusDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午6:42:17
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IRoomstatusDao;
import cn.bdqn.HomeSys.entity.Roomstatus;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomstatusDaoImpl   
 * 类描述：   
 * 创建人：Sun Zhong Tian
 * 创建时间：2017-7-24 下午6:42:17   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午6:42:17   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomstatusDaoImpl extends HibernateDaoSupport implements
		IRoomstatusDao {

	/**(非 Javadoc)
	 * <p>Title: savaRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#savaRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void savaRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(roomstatus);
	}

	/**(非 Javadoc)
	 * <p>Title: updeteRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#updeteRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void updeteRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(roomstatus);

	}

	/**(非 Javadoc)
	 * <p>Title: delRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#delRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void delRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(roomstatus);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomstatusById</p>
	 * <p>Description(描述): </p>
	 * @param roomstatusId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#getRoomstatusById(java.lang.Integer)
	 */

	@Override
	public Roomstatus getRoomstatusById(Integer roomstatusId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Roomstatus.class, roomstatusId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomstatusList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#getRoomstatusList()
	 */

	@Override
	public List<Roomstatus> getRoomstatusList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		String hql="from Roomstatus";
		return session.createQuery(hql).list();
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getRoomstatusByName</p>
	* <p>Description(描述):根据状态名称查询 </p>
	* @param roomstatusName
	* @return
	* @see cn.bdqn.HomeSys.dao.IRoomstatusDao#getRoomstatusByName(java.lang.String)
	 */
	@Override
	public Roomstatus getRoomstatusByName(String roomstatusName) {
		// TODO Auto-generated method stub
				Session session = this.getSession();
				String hql="from Roomstatus where roomstatusName=?";
				Roomstatus roomstatus = (Roomstatus) session.createQuery(hql)
											.setParameter(0,roomstatusName).uniqueResult();
				return roomstatus;
	}

}
