 /**  
* @Title: IRoomDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:27:39
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IRoomDao   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午4:27:39   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午4:27:39   
 * 修改备注：   
 * @version    
 *    
 */
public interface IRoomDao {
/**
 * 
* @Title: saveRoom
* @Description: 该方法的主要作用：添加房间
* @param  @param room 设定文件  
* @return  返回类型：void   
* @throws
 */
	void saveRoom(Room room);
	/**
	 * 
	* @Title: updateRoom
	* @Description: 该方法的主要作用：修改房间
	* @param  @param room 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateRoom(Room room);
	/**
	 * 
	* @Title: delRoom
	* @Description: 该方法的主要作用：更改房间编号
	* @param  @param room 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delRoom(Room room);
	/**
	 * 
	* @Title: getRoomById
	* @Description: 该方法的主要作用：删除房间
	* @param  @param roomId
	* @param  @return 设定文件  
	* @return  返回类型：Room   
	* @throws
	 */
	Room getRoomById(Integer roomId);
	/**
	 * 
	* @Title: getRoomList
	* @Description: 该方法的主要作用：根据编号获得房间号
	* @param  @return 设定文件  
	* @return  返回类型：List<Room>   
	* @throws
	 */
	List<Room> getRoomList();
	
	/**
	 * 
	* @Title: getRoomList
	* @Description: 该方法的主要作用：根据楼层查询房间信息
	* @param  @param floor
	* @param  @return 设定文件  
	* @return  返回类型：List<Room>   
	* @throws
	 */
	List<Room> getRoomList(Integer floor);
	
	/**
	 * 
	* @Title: getRoomByStatus
	* @Description: 该方法的主要作用：根据房间状态名称查询房间信息
	* @param  @param roomtype
	* @param  @return 设定文件  
	* @return  返回类型：List<Room>   
	* @throws
	 */
	List<Room> getRoomByStatus(Roomstatus roomstatus);
	
	List<Room> getRoomList(int first,int size);
	/**
	 * 
	 * @Title: getRoomCount
	 * @Description: 该方法的主要作用：查询房间的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	int getRoomCount();
	
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: 该方法的主要作用：查询楼层的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	int getPositionCount();
	
	/**
	 * 
	* @Title: getRoomByType
	* @Description: 该方法的主要作用：根据房间类型名称查询房间信息
	* @param  @param roomstatus
	* @param  @return 设定文件  
	* @return  返回类型：List<Room>   
	* @throws
	 */
	List<Room> getRoomByType(Roomtype roomtype);

	/**
	 * 
	* @Title: getRoomByRoomStatus
	* @Description: 该方法的主要作用：根据房间状态查询房间信息
	* @param  @param status
	* @param  @return 设定文件  
	* @return  返回类型：List<Room>   
	* @throws
	 */
	List<Room>getRoomByRoomStatus(String status);
	
}
