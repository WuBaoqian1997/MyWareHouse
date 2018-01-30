package cn.bdqn.HomeSys.web;
import java.util.List;

import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.IRoomtypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RoomTypeAction extends ActionSupport {
	private IRoomtypeService roomtypeService;
	private Roomtype roomtype;
	private List<Roomtype> tList;
	private int id;
	private int number = 0;												// Ҫ��ʾ�ڼ�ҳ
	private int total = 0; 												// ��ҳ��
	private int prev = 0; 												// ��һҳ
	private int next = 0; 												// ��һҳ
	private static final int pageSize = 6; 								// ÿҳ��ʾ6������
	
	/**
	 * 
	 * @Title: queryAllRoomType
	 * @Description: �÷�������Ҫ���ã���ҳ��ѯ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String queryAllRoomType(){
		ActionContext ac = ActionContext.getContext();
		// ������ҳ
		if(number == 0)
			number = 1;
		int start = 0;				// �ӵڼ�����ʼ
		int end = 0;				// �ӵڼ�������
		start = (number - 1) * pageSize;
		end = number * pageSize;
		tList = roomtypeService.getRoomtypeList(start, pageSize);	// ��ȡȫ������
		ac.put("tList",tList);
		int count = roomtypeService.getRoomtypeCount();			// ��ȡ�ܼ�¼��
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
	 * @Title: delType
	 * @Description: �÷�������Ҫ���ã�ɾ������
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String delType(){
		Roomtype type2 = roomtypeService.getRoomtypeById(id);
		roomtypeService.delRoomtype(type2);
		return "DelSuccess";
	}
	/**
	 * 
	 * @Title: saveType
	 * @Description: �÷�������Ҫ���ã����뷿��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String saveType(){
		roomtype.setRoomTypeId(((Long)System.currentTimeMillis()).intValue());
		roomtypeService.savaRoomtype(roomtype);
		return "AddSuccess";
	}

	public IRoomtypeService getRoomtypeService() {
		return roomtypeService;
	}

	public void setRoomtypeService(IRoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public List<Roomtype> gettList() {
		return tList;
	}

	public void settList(List<Roomtype> tList) {
		this.tList = tList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static int getPagesize() {
		return pageSize;
	}
}