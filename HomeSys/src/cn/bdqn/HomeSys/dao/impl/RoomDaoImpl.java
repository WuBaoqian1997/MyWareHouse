 /**  
* @Title: RoomDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:33:15
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IRoomDao;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomDaoImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����4:33:15   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����4:33:15   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoomDaoImpl extends HibernateDaoSupport implements IRoomDao {

	/**(�� Javadoc)
	 * <p>Title: saveRoom</p>
	 * <p>Description(����): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#saveRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
	}

	/**(�� Javadoc)
	 * <p>Title: updateRoom</p>
	 * <p>Description(����): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#updateRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(room);
	}

	/**(�� Javadoc)
	 * <p>Title: delRoom</p>
	 * <p>Description(����): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#delRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void delRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(room);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomById</p>
	 * <p>Description(����): </p>
	 * @param roomId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomById(java.lang.Integer)
	 */

	@Override
	public Room getRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Room.class, roomId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomList()
	 */

	@Override
	public List<Room> getRoomList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		String hql="from Room where tag=1";
		return session.createQuery(hql).list();
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: getRoomList</p>
	* <p>Description(����):����¥���ѯ������Ϣ </p>
	* @param floor
	* @return
	* @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomList(java.lang.String)
	 */
	@Override
	public List<Room> getRoomList(Integer floor) {
		Session session = this.getSession();
		String hql="from Room where position.positionId=?";
		List<Room> roomList = session.createQuery(hql)
									.setParameter(0,floor)
									.list();
		return roomList;
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: getRoomByStatus</p>
	* <p>Description(����): ���ݷ����״̬  ��ѯ������Ϣ</p>
	* @param roomtype
	* @return
	* @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomByStatus(cn.bdqn.HomeSys.entity.Roomtype)
	 */
	@Override
	public List<Room> getRoomByStatus(Roomstatus roomstatus) {
		String hql = "from Room where roomstatus=?";
		Session session  = this.getSession();
		return session.createQuery(hql).setParameter(0,roomstatus).list();
	}


	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Room").listIterator().next()).intValue();
	}
	
	/**(�� Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomList()
	 */

	@Override
	public List<Room> getRoomList(int first,int size) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(Room.class);
		return this.getHibernateTemplate().findByCriteria(dc, first, size);
	}

	@Override
	public List<Room> getRoomByType(Roomtype roomtype) {
		
		String hql = "from Room where roomtype=? and roomstatus.roomStatusName=? or roomstatus.roomStatusName=?  ";
		Session session  = this.getSession();
		return session.createQuery(hql)
				.setParameter(0,roomtype)
				.setParameter(1, "�վ�")
				.setParameter(2, "����")
				.list();
	}
	
	
	@Override
	public int getRoomCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Room").listIterator().next()).intValue();
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: getRoomByRoomStatus</p>
	* <p>Description(����):���ݷ���״̬��ѯ������Ϣ </p>
	* @param status
	* @return
	* @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomByRoomStatus(java.lang.String)
	 */
	@Override
	public List<Room> getRoomByRoomStatus(String status) {
		String hql="from Room where roomstatus.roomStatusName = ?";
		Session session = this.getSession();
		
		return session.createQuery(hql).setParameter(0,status).list();
	}



}
