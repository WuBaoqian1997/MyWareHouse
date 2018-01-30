 /**  
* @Title: RoomstatusServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午6:50:10
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IRoomstatusDao;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.service.IRoomstatusService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomstatusServiceImpl   
 * 类描述：   
 * 创建人：Sun Zhong Tian
 * 创建时间：2017-7-24 下午6:50:10   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午6:50:10   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomstatusServiceImpl implements IRoomstatusService {

	
	IRoomstatusDao roomstatusDao =null;
	
	/**(非 Javadoc)
	 * <p>Title: savaRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#savaRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void savaRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.savaRoomstatus(roomstatus);
	}

	/**(非 Javadoc)
	 * <p>Title: updeteRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#updeteRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void updeteRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.updeteRoomstatus(roomstatus);
	}

	/**(非 Javadoc)
	 * <p>Title: delRoomstatus</p>
	 * <p>Description(描述): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#delRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void delRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.delRoomstatus(roomstatus);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomstatusById</p>
	 * <p>Description(描述): </p>
	 * @param roomstatusId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#getRoomstatusById(java.lang.Integer)
	 */

	@Override
	public Roomstatus getRoomstatusById(Integer roomstatusId) {
		// TODO Auto-generated method stub
		return roomstatusDao.getRoomstatusById(roomstatusId);
	}

	/**(非 Javadoc)
	 * <p>Title: getRoomstatusList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#getRoomstatusList()
	 */

	@Override
	public List<Roomstatus> getRoomstatusList() {
		// TODO Auto-generated method stub
		return roomstatusDao.getRoomstatusList();
	}

	public IRoomstatusDao getRoomstatusDao() {
		return roomstatusDao;
	}

	public void setRoomstatusDao(IRoomstatusDao roomstatusDao) {
		this.roomstatusDao = roomstatusDao;
	}

	
	

	@Override
	public Roomstatus getRoomstatusByName(String roomstatusName) {
		// TODO Auto-generated method stub
		return roomstatusDao.getRoomstatusByName(roomstatusName);
	}

	
	
}
