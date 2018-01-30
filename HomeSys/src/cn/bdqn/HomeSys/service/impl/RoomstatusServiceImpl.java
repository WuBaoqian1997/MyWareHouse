 /**  
* @Title: RoomstatusServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����6:50:10
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IRoomstatusDao;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.service.IRoomstatusService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomstatusServiceImpl   
 * ��������   
 * �����ˣ�Sun Zhong Tian
 * ����ʱ�䣺2017-7-24 ����6:50:10   
 * �޸��ˣ�Sun Zhong Tian
 * �޸�ʱ�䣺2017-7-24 ����6:50:10   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoomstatusServiceImpl implements IRoomstatusService {

	
	IRoomstatusDao roomstatusDao =null;
	
	/**(�� Javadoc)
	 * <p>Title: savaRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#savaRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void savaRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.savaRoomstatus(roomstatus);
	}

	/**(�� Javadoc)
	 * <p>Title: updeteRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#updeteRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void updeteRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.updeteRoomstatus(roomstatus);
	}

	/**(�� Javadoc)
	 * <p>Title: delRoomstatus</p>
	 * <p>Description(����): </p>
	 * @param roomstatus
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#delRoomstatus(cn.bdqn.HomeSys.entity.Roomstatus)
	 */

	@Override
	public void delRoomstatus(Roomstatus roomstatus) {
		// TODO Auto-generated method stub
		roomstatusDao.delRoomstatus(roomstatus);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomstatusById</p>
	 * <p>Description(����): </p>
	 * @param roomstatusId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomstatusService#getRoomstatusById(java.lang.Integer)
	 */

	@Override
	public Roomstatus getRoomstatusById(Integer roomstatusId) {
		// TODO Auto-generated method stub
		return roomstatusDao.getRoomstatusById(roomstatusId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomstatusList</p>
	 * <p>Description(����): </p>
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
