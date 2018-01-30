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
	private List<Room> roomList;												//����Ķ���
	private IRoomService roomService;											//������ҵ���߼���
	private List<Roomtype> roomtypeList;										//��������
	private IRoomtypeService roomtypeService;									//��������service
	private Reserve reserve;            										//Ԥ����					 
	private IReserveService reserveService;										//Ԥ�����ҵ���߼���
	private IRoomstatusService roomstatusService;								//����״̬
	private Customer customer;													//�ͻ���Ϣ
	private ICustomerService customerService; 									//�ͻ���Ϣ��ҵ��
	
	/**
	 * 
	* @Title: getRoomAndRoomType
	* @Description: �÷�������Ҫ���ã���ȡ���еķ������ͺͷ����
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
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
	* @Description: �÷�������Ҫ���ã��½�Ԥ��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String saveReserve(){
		Reserve newReserve = new Reserve();
		newReserve = reserve;
		Integer number =(int) (System.currentTimeMillis());
		newReserve.setId(number);
		Room room = roomService.getRoomById(reserve.getRoom().getRoomId());
		Roomstatus roomstatus= roomstatusService.getRoomstatusByName("Ԥ��");
		room.setRoomstatus(roomstatus);
		roomService.updateRoom(room);		
		newReserve.setRoomtype(
		roomtypeService.getRoomtypeById(reserve.getRoomtype().getRoomTypeId())) ; 
		newReserve.setRoom(room);
		reserveService.saveReserve(newReserve);
		//�½�һ���ͻ�
		customer = new Customer();
		customer.setCustomerId(((Long)System.currentTimeMillis()).intValue());
		customer.setCustomerName(reserve.getName());//�ͻ�����
		customer.setPhone(reserve.getPhone());
		customerService.saveCustomer(customer);//����һ���ͻ�
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
