 /**  
* @Title: RoomAction.java
* @Package cn.bdqn.HomeSys.web
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-26 上午11:23:20
* @version V1.0  
*/
package cn.bdqn.HomeSys.web;

import java.util.List;

import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IPositionService;
import cn.bdqn.HomeSys.service.IRoomService;
import cn.bdqn.HomeSys.service.IRoomstatusService;
import cn.bdqn.HomeSys.service.IRoomtypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：RoomAction   
 * 类描述：   房间的Action
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-26 上午11:23:20   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-26 上午11:23:20   
 * 修改备注：   
 * @version    
 *    
 */
public class RoomAction extends ActionSupport {
	private Room room;                                       //房间的对象
	private IRoomService roomService;                        //房间的业务逻辑层
	private IPositionService positionService;                //楼层的业务逻辑层
	private List<Room> roomsList;     						 //房间的集合		
	private List<Position> positionList;                     //楼层的集合
	private IRoomstatusService roomstatusService;  			 //房间状态的业务逻辑层
	private List<Room> pRoomList;										// 包含楼层信息的集合
	
	private IRoomtypeService roomtypeService;
	private IRoomService RoomService;// 楼层的业务逻辑层1
	
	private int number = 0;												// 要显示第几页
	private int total = 0; 												// 总页数
	private int prev = 0; 												// 上一页
	private int next = 0; 												// 下一页
	private static final int pageSize = 6; 								// 每页显示6条数据
	private int id;
	private Integer tid;
	private Integer roomid;
	
	
	
	
	/**
	 * 
	 * @Title: savePosition
	 * @Description: 该方法的主要作用：增加房屋信息
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */

	public String savaRoom(){
		Roomstatus roomStatus = roomstatusService.getRoomstatusById(5);
		room.setIsEffective(true);
		room.setRemarks("mingtian");
		room.setRoomstatus(roomStatus);
		
		roomService.saveRoom(room);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: getById
	 * @Description: 该方法的主要作用：通过id进行查询
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String getByRoomId(){
		room = roomService.getRoomById(id);
		return "GetSuccess";
	}
	
	public String updateRoom(){
		
		roomService.updateRoom(room);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: delPosition
	 * @Description: 该方法的主要作用：删除楼层信息
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String delPosition(){
		Room room = roomService.getRoomById(id);
		roomService.delRoom(room);
		return "DelSuccess";
	}
	
	/**
	 * 
	 * @Title: queryAllPosition
	 * @Description: 该方法的主要作用：分页查询全部的楼层信息
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String queryAllRoom(){
		ActionContext ac = ActionContext.getContext();
		// 计算首页
		if(number == 0)
			number = 1;
		int start = 0;				// 从第几条开始
		int end = 0;				// 从第几条结束
		start = (number - 1) * pageSize;
		end = number * pageSize;
		//pList = RoomService.queryPosition(start, pageSize);	// 获取全部数据
		pRoomList = roomService.getRoomList(start, pageSize);
		ac.put("pRoomList",pRoomList);
		//添加房屋 楼层
		List<Position> pList = positionService.queryAllPosition();
		ac.put("pList", pList);
		List<Roomtype> rList  =roomtypeService.getRoomtypeList();
		ac.put("rList",rList);
		int count = roomService.getPositionCount();			// 获取总记录数
		total = (count - (count % pageSize))/pageSize; 			// 计算总页数
		if(count % pageSize != 0){
			total++;
		}
		//计算得到上一页和下一页
		if(number <= 1){
			prev = 1;
			next = number + 1;
		}else if(number >= total){
			prev = number - 1;
			next = total;
		}else{
			prev = number - 1;
			next = number + 1;
		}
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updZhijing
	* @Description: 该方法的主要作用：置净
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String updZhijing(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus = null;
		if(newRoom.getRoomstatus().getRoomStatusName().equals("住脏")){
			roomstatus = roomstatusService.getRoomstatusByName("住净");
		}
		if(newRoom.getRoomstatus().getRoomStatusName().equals("空脏")){
			roomstatus = roomstatusService.getRoomstatusByName("空净");
		}
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updWeixui
	* @Description: 该方法的主要作用：维修
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String updWeixui(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus  = roomstatusService.getRoomstatusByName("维修");
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updZhizang
	* @Description: 该方法的主要作用：置脏
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String updZhizang(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus = null;
		if(newRoom.getRoomstatus().getRoomStatusName().equals("住净")){
			roomstatus = roomstatusService.getRoomstatusByName("住脏");
		}
		if(newRoom.getRoomstatus().getRoomStatusName().equals("空净")){
			roomstatus = roomstatusService.getRoomstatusByName("空脏");
		}
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: getRoomList
	* @Description: 该方法的主要作用：查询所有的房间信息
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String getRoomList()
	{
		
		roomsList = roomService.getRoomList();
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updWeixui
	* @Description: 该方法的主要作用：结束维修
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String updJieShuWeixui(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus  = roomstatusService.getRoomstatusByName("空脏");
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	
	public Room getRoom() {
		return room;
	}
	
	
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public IRoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}

	public IPositionService getPositionService() {
		return positionService;
	}

	public void setPositionService(IPositionService positionService) {
		this.positionService = positionService;
	}

	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}


	public List<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}




	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}




	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}















	public IRoomtypeService getRoomtypeService() {
		return roomtypeService;
	}















	public void setRoomtypeService(IRoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}















	public int getNumber() {
		return number;
	}















	public void setNumber(int number) {
		this.number = number;
	}















	public int getTotal() {
		return total;
	}















	public void setTotal(int total) {
		this.total = total;
	}















	public int getPrev() {
		return prev;
	}















	public void setPrev(int prev) {
		this.prev = prev;
	}















	public int getNext() {
		return next;
	}















	public void setNext(int next) {
		this.next = next;
	}















	public int getId() {
		return id;
	}















	public void setId(int id) {
		this.id = id;
	}















	public Integer getTid() {
		return tid;
	}















	public void setTid(Integer tid) {
		this.tid = tid;
	}















	public Integer getRoomid() {
		return roomid;
	}















	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}















	public static int getPagesize() {
		return pageSize;
	}

	public List<Room> getpRoomList() {
		return pRoomList;
	}

	public void setpRoomList(List<Room> pRoomList) {
		this.pRoomList = pRoomList;
	}


	

}
