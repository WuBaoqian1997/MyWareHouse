package cn.bdqn.HomeSys.entity;

import java.sql.Timestamp;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Orders   
* ��������   ������
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:45:14   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:45:14   
* �޸ı�ע��   
* @version    
*
 */
public class Orders implements java.io.Serializable {

	// Fields

	/**
	* @Fields orderId :���ֶε���˼�����
	*/
	private Integer orderId;
	/**
	* @Fields staff :���ֶε���˼��Ա��
	*/
	private Staff staff;
	/**
	* @Fields customer :���ֶε���˼���ͻ�
	*/
	private Customer customer;
	/**
	* @Fields orderstatus :���ֶε���˼������״̬
	*/
	private Orderstatus orderstatus;
	/**
	* @Fields room :���ֶε���˼������
	*/
	private Room room;
	
	/**
	* @Fields accommodation :���ֶε���˼��ס������
	*/
	private Accommodation accommodation;
	/**
	* @Fields startTime :���ֶε���˼����סʱ��
	*/
	private Timestamp startTime;
	/**
	* @Fields endTime :���ֶε���˼���������
	*/
	private Timestamp endTime;
	/**
	* @Fields days :���ֶε���˼����ס����
	*/
	private Integer days;
	/**
	* @Fields deposit :���ֶε���˼��Ѻ����
	*/
	private Double deposit;
	/**
	* @Fields accountsPayable :���ֶε���˼�����ѽ��
	*/
	private Double accountsPayable;
	/**
	* @Fields remarks :���ֶε���˼��	��ע 
	*/
	private String remarks;

	// Constructors

	/** default constructor */
	public Orders() {
	}


	public Orders(Integer orderId, Staff staff, Customer customer,
			Orderstatus orderstatus, Room room, Accommodation accommodation,
			Timestamp startTime, Timestamp endTime, Integer days,
			Double deposit, Double accountsPayable, String remarks) {
		super();
		this.orderId = orderId;
		this.staff = staff;
		this.customer = customer;
		this.orderstatus = orderstatus;
		this.room = room;
		this.accommodation = accommodation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
		this.deposit = deposit;
		this.accountsPayable = accountsPayable;
		this.remarks = remarks;
	}


	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Orderstatus getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}


	public Accommodation getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getDeposit() {
		return this.deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getAccountsPayable() {
		return this.accountsPayable;
	}

	public void setAccountsPayable(Double accountsPayable) {
		this.accountsPayable = accountsPayable;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}