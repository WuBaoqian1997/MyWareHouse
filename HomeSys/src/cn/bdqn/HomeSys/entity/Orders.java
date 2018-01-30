package cn.bdqn.HomeSys.entity;

import java.sql.Timestamp;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Orders   
* 类描述：   订单表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:45:14   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:45:14   
* 修改备注：   
* @version    
*
 */
public class Orders implements java.io.Serializable {

	// Fields

	/**
	* @Fields orderId :该字段的意思：编号
	*/
	private Integer orderId;
	/**
	* @Fields staff :该字段的意思：员工
	*/
	private Staff staff;
	/**
	* @Fields customer :该字段的意思：客户
	*/
	private Customer customer;
	/**
	* @Fields orderstatus :该字段的意思：订单状态
	*/
	private Orderstatus orderstatus;
	/**
	* @Fields room :该字段的意思：房间
	*/
	private Room room;
	
	/**
	* @Fields accommodation :该字段的意思：住宿类型
	*/
	private Accommodation accommodation;
	/**
	* @Fields startTime :该字段的意思：入住时间
	*/
	private Timestamp startTime;
	/**
	* @Fields endTime :该字段的意思：离店日期
	*/
	private Timestamp endTime;
	/**
	* @Fields days :该字段的意思：入住天数
	*/
	private Integer days;
	/**
	* @Fields deposit :该字段的意思：押金金额
	*/
	private Double deposit;
	/**
	* @Fields accountsPayable :该字段的意思：消费金额
	*/
	private Double accountsPayable;
	/**
	* @Fields remarks :该字段的意思：	备注 
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