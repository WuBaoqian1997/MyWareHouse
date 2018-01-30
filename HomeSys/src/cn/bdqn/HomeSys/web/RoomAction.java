 /**  
* @Title: RoomAction.java
* @Package cn.bdqn.HomeSys.web
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-26 ����11:23:20
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoomAction   
 * ��������   �����Action
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-26 ����11:23:20   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-26 ����11:23:20   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoomAction extends ActionSupport {
	private Room room;                                       //����Ķ���
	private IRoomService roomService;                        //�����ҵ���߼���
	private IPositionService positionService;                //¥���ҵ���߼���
	private List<Room> roomsList;     						 //����ļ���		
	private List<Position> positionList;                     //¥��ļ���
	private IRoomstatusService roomstatusService;  			 //����״̬��ҵ���߼���
	private List<Room> pRoomList;										// ����¥����Ϣ�ļ���
	
	private IRoomtypeService roomtypeService;
	private IRoomService RoomService;// ¥���ҵ���߼���1
	
	private int number = 0;												// Ҫ��ʾ�ڼ�ҳ
	private int total = 0; 												// ��ҳ��
	private int prev = 0; 												// ��һҳ
	private int next = 0; 												// ��һҳ
	private static final int pageSize = 6; 								// ÿҳ��ʾ6������
	private int id;
	private Integer tid;
	private Integer roomid;
	
	
	
	
	/**
	 * 
	 * @Title: savePosition
	 * @Description: �÷�������Ҫ���ã����ӷ�����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
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
	 * @Description: �÷�������Ҫ���ã�ͨ��id���в�ѯ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
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
	 * @Description: �÷�������Ҫ���ã�ɾ��¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
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
	 * @Description: �÷�������Ҫ���ã���ҳ��ѯȫ����¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String queryAllRoom(){
		ActionContext ac = ActionContext.getContext();
		// ������ҳ
		if(number == 0)
			number = 1;
		int start = 0;				// �ӵڼ�����ʼ
		int end = 0;				// �ӵڼ�������
		start = (number - 1) * pageSize;
		end = number * pageSize;
		//pList = RoomService.queryPosition(start, pageSize);	// ��ȡȫ������
		pRoomList = roomService.getRoomList(start, pageSize);
		ac.put("pRoomList",pRoomList);
		//��ӷ��� ¥��
		List<Position> pList = positionService.queryAllPosition();
		ac.put("pList", pList);
		List<Roomtype> rList  =roomtypeService.getRoomtypeList();
		ac.put("rList",rList);
		int count = roomService.getPositionCount();			// ��ȡ�ܼ�¼��
		total = (count - (count % pageSize))/pageSize; 			// ������ҳ��
		if(count % pageSize != 0){
			total++;
		}
		//����õ���һҳ����һҳ
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
	* @Description: �÷�������Ҫ���ã��þ�
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String updZhijing(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus = null;
		if(newRoom.getRoomstatus().getRoomStatusName().equals("ס��")){
			roomstatus = roomstatusService.getRoomstatusByName("ס��");
		}
		if(newRoom.getRoomstatus().getRoomStatusName().equals("����")){
			roomstatus = roomstatusService.getRoomstatusByName("�վ�");
		}
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updWeixui
	* @Description: �÷�������Ҫ���ã�ά��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String updWeixui(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus  = roomstatusService.getRoomstatusByName("ά��");
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updZhizang
	* @Description: �÷�������Ҫ���ã�����
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String updZhizang(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus = null;
		if(newRoom.getRoomstatus().getRoomStatusName().equals("ס��")){
			roomstatus = roomstatusService.getRoomstatusByName("ס��");
		}
		if(newRoom.getRoomstatus().getRoomStatusName().equals("�վ�")){
			roomstatus = roomstatusService.getRoomstatusByName("����");
		}
		newRoom.setRoomstatus(roomstatus);
		roomService.updateRoom(newRoom);
		getRoomList();
		return SUCCESS;
	}
	
	
	/**
	 * 
	* @Title: getRoomList
	* @Description: �÷�������Ҫ���ã���ѯ���еķ�����Ϣ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã�����ά��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String updJieShuWeixui(){
		Room newRoom = roomService.getRoomById(room.getRoomId());
		Roomstatus roomstatus  = roomstatusService.getRoomstatusByName("����");
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
