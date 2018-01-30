package cn.bdqn.HomeSys.web;
import java.util.List;

import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IPriceService;
import cn.bdqn.HomeSys.service.IRoomService;
import cn.bdqn.HomeSys.service.IRoomtypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RoomPriceAction extends ActionSupport {
	private IRoomService roomService;
	private IRoomtypeService roomtypeService;
	private IPriceService priceService;
	private Room room;
	private Room room1;
	private Roomtype roomtype;
	private Price price;
	private List<Room> rList;
	private List<Roomtype> rtList;
	private int number = 0;												// Ҫ��ʾ�ڼ�ҳ
	private int total = 0; 												// ��ҳ��
	private int prev = 0; 												// ��һҳ
	private int next = 0; 												// ��һҳ
	private static final int pageSize = 6; 								// ÿҳ��ʾ6������
	private int id;
	private Integer roomid;
	private Integer tid;												//�������͵�id
	
	/**
	 * 
	 * @Title: queryAllRoom
	 * @Description: �÷�������Ҫ���ã���ҳ��ѯ���еķ�������
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
		rList = roomService.getRoomList(start, pageSize);		// ��ȡȫ������
		ac.put("rList",rList);
		rtList = roomtypeService.getAllRoomType();
		ac.put("tList",rtList);
		int count = roomService.getRoomCount();					// ��ȡ�ܼ�¼��
		total = (count - (count % pageSize))/pageSize; 			// ������ҳ��
		if(count % pageSize != 0){
			total++;
		}
		// ����õ���һҳ����һҳ
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
	 * @Title: getLoad
	 * @Description: �÷�������Ҫ���ã�ˢ�ȵ�ǰҳ��
	 * @param   �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	public String getLoad()
	{
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: delRoom
	 * @Description: �÷�������Ҫ���ã�ɾ��������Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String delRoom(){
		Room room2 = roomService.getRoomById(id);
		roomService.delRoom(room2);
		return "DelSuccess";
	}
	
	/**
	 * 
	 * @Title: saveRoom
	 * @Description: �÷�������Ҫ���ã����뷿����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String saveRoom(){
		room.setRoomId(((Long)System.currentTimeMillis()).intValue());
		roomService.saveRoom(room);
		return "AddSuccess";
	}
	
	/**
	 * 
	 * @Title: getById
	 * @Description: �÷�������Ҫ���ã�ͨ��id���в�ѯ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String getById(){
		//room = roomService.getRoomById(id);
		//price = priceService.queryPriceById(id);
		roomtype = roomtypeService.getRoomtypeById(tid);  //���ݷ������͵�id��ѯ��Ϣ
		price = roomtype.getPrice();
		room  = roomService.getRoomById(roomid);
		return "GetSuccess";
	}
	
	/**
	 * 
	 * @Title: updateRoomInfo
	 * @Description: �÷�������Ҫ���ã����·���۸�
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String updateRoomInfo(){
		/*Roomtype roomtype = new Roomtype();
		roomtype.setRoomTypeId(((Long)System.currentTimeMillis()).intValue());
		room1.setRoomtype(roomtype);*/
		//roomtypeService.updateRoomtype(roomtype);
		//roomService.updateRoom(room1);
		priceService.updatePrice(price);
		return "UpdateSuccess";
	}
	
	public IRoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}
	
	public IRoomtypeService getRoomtypeService() {
		return roomtypeService;
	}

	public void setRoomtypeService(IRoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}

	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public List<Room> getrList() {
		return rList;
	}
	public void setrList(List<Room> rList) {
		this.rList = rList;
	}
	public List<Roomtype> getRtList() {
		return rtList;
	}
	public void setRtList(List<Roomtype> rtList) {
		this.rtList = rtList;
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
	public static int getPagesize() {
		return pageSize;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public IPriceService getPriceService() {
		return priceService;
	}

	public void setPriceService(IPriceService priceService) {
		this.priceService = priceService;
	}

	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	public Room getRoom1() {
		return room1;
	}

	public void setRoom1(Room room1) {
		this.room1 = room1;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
}
