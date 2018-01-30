 /**  
* @Title: RoomstatusDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����6:42:17
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomstatusDaoImpl   
 * ��������   
 * �����ˣ�Sun Zhong Tian
 * ����ʱ�䣺2017-7-24 ����6:42:17   
 * �޸��ˣ�Sun Zhong Tian
 * �޸�ʱ�䣺2017-7-24 ����6:42:17   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoomstatusDaoImpl extends HibernateDaoSupport implements
		IRoomstatusDao {

	/**(�� Javadoc)
	 * <p>Title: savaRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#savaRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void savaRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(roomstatus);
	}

	/**(�� Javadoc)
	 * <p>Title: updeteRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#updeteRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void updeteRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(roomstatus);

	}

	/**(�� Javadoc)
	 * <p>Title: delRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#delRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void delRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(roomstatus);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomstatusById</p>
	 * <p>Description(����): </p>
	 * @param roomstatusId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomstatusDao#getRoomstatusById(java.lang.Integer)
	 */

	@Override
	public Roomstatus getRoomstatusById(Integer roomstatusId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Roomstatus.class, roomstatusId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomstatusList</p>
	 * <p>Description(����): </p>
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
	 * (�� Javadoc)
	* <p>Title: getRoomstatusByName</p>
	* <p>Description(����):����״̬���Ʋ�ѯ </p>
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
