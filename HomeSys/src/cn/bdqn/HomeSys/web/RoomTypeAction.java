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
	private int number = 0;												// 要显示第几页
	private int total = 0; 												// 总页数
	private int prev = 0; 												// 上一页
	private int next = 0; 												// 下一页
	private static final int pageSize = 6; 								// 每页显示6条数据
	
	/**
	 * 
	 * @Title: queryAllRoomType
	 * @Description: 该方法的主要作用：分页查询
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String queryAllRoomType(){
		ActionContext ac = ActionContext.getContext();
		// 计算首页
		if(number == 0)
			number = 1;
		int start = 0;				// 从第几条开始
		int end = 0;				// 从第几条结束
		start = (number - 1) * pageSize;
		end = number * pageSize;
		tList = roomtypeService.getRoomtypeList(start, pageSize);	// 获取全部数据
		ac.put("tList",tList);
		int count = roomtypeService.getRoomtypeCount();			// 获取总记录数
		total = (count - (count % pageSize))/pageSize; 			// 计算总页数
		if(count % pageSize != 0){
			total++;
		}
		// 计算得到上一页和下一页
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
	 * @Description: 该方法的主要作用：删除房型
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
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
	 * @Description: 该方法的主要作用：插入房型
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
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