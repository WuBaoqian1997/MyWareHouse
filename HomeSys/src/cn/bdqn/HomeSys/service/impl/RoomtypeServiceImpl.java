 /**  
* @Title: RoomtypeServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:21:17
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IRoomtypeDao;
import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IRoomtypeService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomtypeServiceImpl   
 * ��������   
 * �����ˣ�Sun Zhong Tian
 * ����ʱ�䣺2017-7-24 ����4:21:17   
 * �޸��ˣ�Sun Zhong Tian   
 * �޸�ʱ�䣺2017-7-24 ����4:21:17   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoomtypeServiceImpl implements IRoomtypeService {

	IRoomtypeDao roomtypeDao=null;
	
	/**(�� Javadoc)
	 * <p>Title: savaRoomtype</p>
	 * <p>Description(����): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#savaRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void savaRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		roomtypeDao.savaRoomtype(roomtype);
	}

	/**(�� Javadoc)
	 * <p>Title: updateRoomtype</p>
	 * <p>Description(����): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#updateRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void updateRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		roomtypeDao.updateRoomtype(roomtype);
	}

	/**(�� Javadoc)
	 * <p>Title: delRoomtype</p>
	 * <p>Description(����): </p>
	 * @param roomtype
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#delRoomtype(cn.bdqn.HomeSys.entity.Roomtype)
	 */

	@Override
	public void delRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		roomtypeDao.delRoomtype(roomtype);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomtypeById</p>
	 * <p>Description(����): </p>
	 * @param roomtypeId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#getRoomtypeById(java.lang.Integer)
	 */

	@Override
	public Roomtype getRoomtypeById(Integer roomtypeId) {
		// TODO Auto-generated method stub
		return roomtypeDao.getRoomtypeById(roomtypeId);
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomtypeList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#getRoomtypeList()
	 */

	@Override
	public List<Roomtype> getRoomtypeList() {
		// TODO Auto-generated method stub
		return roomtypeDao.getRoomtypeList();
	}

	public IRoomtypeDao getRoomtypeDao() {
		return roomtypeDao;
	}

	public void setRoomtypeDao(IRoomtypeDao roomtypeDao) {
		this.roomtypeDao = roomtypeDao;
	}

	/**(�� Javadoc)
	 * <p>Title: getRoomtypeList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IRoomtypeService#getRoomtypeList()
	 */

	@Override
	public List<Roomtype> getRoomtypeList(int first,int size) {
		// TODO Auto-generated method stub
		return roomtypeDao.getRoomtypeList(first,size);
	}

	@Override
	public int getRoomtypeCount() {
		// TODO Auto-generated method stub
		return roomtypeDao.getRoomtypeCount();
	}
	
	@Override
	public List<Roomtype> getAllRoomType() {
		// TODO Auto-generated method stub
		return roomtypeDao.getAllRoomType();
	}
	
}
