 /**  
* @Title: RoomServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:57:56
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IRoomDao;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IRoomService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:57:56   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:57:56   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomServiceImpl implements IRoomService {

	/**(非 Javadoc)
	 * <p>Title: saveRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.service.IRoomService#saveRoom(cn.bdqn.HomeSys.entity.Room)
	 */
	IRoomDao RoomDao = null;
	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		RoomDao.saveRoom(room);
	}

	/**(非 Javadoc)
	 * <p>Title: updateRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.service.IRoomService#updateRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		RoomDao.updateRoom(room);
	}

	/**(非 Javadoc)
	 * <p>Title: delRoom</p>
	 * <p>Description(描述): </p>
	 * @param room
	 * @see cn.bdqn.HomeSys.service.IRoomService#delRoom(cn.bdqn.HomeSys.entity.Room)
	 */

	@Override
	public void delRoom(Room room) {
		// TODO Auto-generated method stub
		RoomDao.delRoom(room);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomById</p>
	 * <p>Description(描述): </p>
	 * @param roomId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomService#getRoomById(java.lang.Integer)
	 */

	@Override
	public Room getRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		return RoomDao.getRoomById(roomId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomService#getRoomList()
	 */

	@Override
	public List<Room> getRoomList() {
		// TODO Auto-generated method stub
		return RoomDao.getRoomList();
	}

	
	/**(非 Javadoc)
	 * <p>Title: getRoomList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomService#getRoomList()
	 */

	@Override
	public List<Room> getRoomList(int first,int size) {
		// TODO Auto-generated method stub
		return RoomDao.getRoomList(first,size);
	}
	
	/**
	 * (非 Javadoc)
	 * <p>Title: getRoomCount</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomService#getRoomCount()
	 */
	@Override
	public int getRoomCount() {
		// TODO Auto-generated method stub
		return RoomDao.getRoomCount();
	}
	
	public IRoomDao getRoomDao() {
		return RoomDao;
	}

	public void setRoomDao(IRoomDao roomDao) {
		RoomDao = roomDao;
	}

	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return RoomDao.getPositionCount();
	}
	
	
	/**
	 * (非 Javadoc)
	* <p>Title: getRoomList</p>
	* <p>Description(描述): 根据楼层查询房间信息</p>
	* @param floor
	* @return
	* @see cn.bdqn.HomeSys.service.IRoomService#getRoomList(java.lang.Integer)
	 */
	@Override
	public List<Room> getRoomList(Integer floor) {
		// TODO Auto-generated method stub
		return RoomDao.getRoomList(floor);
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getRoomByStatus</p>
	* <p>Description(描述): </p>
	* @param roomstatus
	* @return
	* @see cn.bdqn.HomeSys.service.IRoomService#getRoomByStatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */
	@Override
	public List<Room> getRoomByStatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		return RoomDao.getRoomByStatus(roomstatus);
	}

	@Override
	public List<Room> getRoomByType(Roomtype roomtype) {
		// TODO Auto-generated method stub
		return RoomDao.getRoomByType(roomtype);
	}

	
	/**
	 * (非 Javadoc)
	* <p>Title: getRoomByRoomStatus</p>
	* <p>Description(描述):根据房间状态查询房间信息 </p>
	* @param status
	* @return
	* @see cn.bdqn.HomeSys.service.IRoomService#getRoomByRoomStatus(java.lang.String)
	 */
	@Override
	public List<Room> getRoomByRoomStatus(String status) {
		return RoomDao.getRoomByRoomStatus(status);
	}
}
