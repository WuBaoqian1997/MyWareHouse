package cn.bdqn.HomeSys.web;

import java.util.List;

import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.entity.Reserve;
import cn.bdqn.HomeSys.entity.Room;
import cn.bdqn.HomeSys.entity.Roomstatus;
import cn.bdqn.HomeSys.entity.Roomtype;
import cn.bdqn.HomeSys.service.ICustomerService;
import cn.bdqn.HomeSys.service.IReserveService;
import cn.bdqn.HomeSys.service.IRoomService;
import cn.bdqn.HomeSys.service.IRoomstatusService;
import cn.bdqn.HomeSys.service.IRoomtypeService;

import com.opensymphony.xwork2.ActionSupport;

public class ReserveAction extends ActionSupport {
	private List<Room> roomList;												//房间的对象
	private IRoomService roomService;											//房间表的业务逻辑层
	private List<Roomtype> roomtypeList;										//房间类型
	private IRoomtypeService roomtypeService;									//房间类型service
	private Reserve reserve;            										//预定表					 
	private IReserveService reserveService;										//预定表的业务逻辑层
	private IRoomstatusService roomstatusService;								//房间状态
	private Customer customer;													//客户信息
	private ICustomerService customerService; 									//客户信息的业务
	
	/**
	 * 
	* @Title: getRoomAndRoomType
	* @Description: 该方法的主要作用：获取所有的房间类型和房间号
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String getRoomAndRoomType(){
		roomtypeList = roomtypeService.getRoomtypeList();
		roomList = roomService.getRoomByType(roomtypeList.get(0));
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: saveReserve
	* @Description: 该方法的主要作用：新建预定
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String saveReserve(){
		Reserve newReserve = new Reserve();
		newReserve = reserve;
		Integer number =(int) (System.currentTimeMillis());
		newReserve.setId(number);
		Room room = roomService.getRoomById(reserve.getRoom().getRoomId());
		Roomstatus roomstatus= roomstatusService.getRoomstatusByName("预定");
		room.setRoomstatus(roomstatus);
		roomService.updateRoom(room);		
		newReserve.setRoomtype(
		roomtypeService.getRoomtypeById(reserve.getRoomtype().getRoomTypeId())) ; 
		newReserve.setRoom(room);
		reserveService.saveReserve(newReserve);
		//新建一个客户
		customer = new Customer();
		customer.setCustomerId(((Long)System.currentTimeMillis()).intValue());
		customer.setCustomerName(reserve.getName());//客户名称
		customer.setPhone(reserve.getPhone());
		customerService.saveCustomer(customer);//增加一个客户
		return SUCCESS;
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
	public Reserve getReserve() {
		return reserve;
	}
	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}
	public IReserveService getReserveService() {
		return reserveService;
	}
	public void setReserveService(IReserveService reserveService) {
		this.reserveService = reserveService;
	}
	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public List<Roomtype> getRoomtypeList() {
		return roomtypeList;
	}

	public void setRoomtypeList(List<Roomtype> roomtypeList) {
		this.roomtypeList = roomtypeList;
	}

	public IRoomstatusService getRoomstatusService() {
		return roomstatusService;
	}

	public void setRoomstatusService(IRoomstatusService roomstatusService) {
		this.roomstatusService = roomstatusService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ICustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

}
