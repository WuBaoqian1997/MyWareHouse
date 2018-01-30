 /**  
* @Title: RoomDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:33:15
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
 * 项目名称：HomeSys   
 * 类名称：RoomDaoImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:33:15   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:33:15   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomDaoImpl extends HibernateDaoSupport implements IRoomDao {

	/**(非 Javadoc)
	 * <p>Title: saveRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#saveRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
	}

	/**(非 Javadoc)
	 * <p>Title: updateRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#updateRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(room);
	}

	/**(非 Javadoc)
	 * <p>Title: delRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#delRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void delRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(room);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomById</p>
	 * <p>Description(描述): </p>
	 * @param roomId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IRoomDao#getRoomById(java.lang.Integer)
	 */

	@Override
	public Room getRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Room.class, roomId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(描述): </p>
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
	 * (非 Javadoc)
	* <p>Title: getRoomList</p>
	* <p>Description(描述):根据楼层查询房间信息 </p>
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
	 * (非 Javadoc)
	* <p>Title: getRoomByStatus</p>
	* <p>Description(描述): 根据房间的状态  查询房间信息</p>
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
	
	/**(非 Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(描述): </p>
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
				.setParameter(1, "空净")
				.setParameter(2, "空脏")
				.list();
	}
	
	
	@Override
	public int getRoomCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Room").listIterator().next()).intValue();
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getRoomByRoomStatus</p>
	* <p>Description(描述):根据房间状态查询房间信息 </p>
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
