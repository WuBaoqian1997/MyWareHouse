package cn.bdqn.HomeSys.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * +
*    
* 项目名称：HomeSys   
* 类名称：Customer   
* 类描述：   客户信息表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:44:17   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:44:17   
* 修改备注：   
* @version    
*
 */
public class Customer implements java.io.Serializable {

	// Fields

	/**
	* @Fields customerId :该字段的意思：客户信息编号
	*/
	private Integer customerId;
	/**
	* @Fields customerName :该字段的意思：客户名称
	*/
	private String customerName;
	/**
	* @Fields idnumber :该字段的意思：身份证号
	*/
	private String idnumber;
	/**
	* @Fields balance :该字段的意思：余额
	*/
	private Double balance;
	
	/**
	* @Fields payment :该字段的意思：支付方式
	*/
	private Payment payment;
	
	/**
	* @Fields deposit :该字段的意思：押金金额
	*/
	private Double deposit;
	/**
	* @Fields accountsPayable :该字段的意思：消费金额
	*/
	private Double accountsPayable;
	
	/**
	* @Fields phone :该字段的意思：电话号码
	*/
	private String phone;
	
	//今日房价
	/**
	* @Fields houseing :该字段的意思：当日房价
	*/
	private Double houseing;
	
	

	/**
	* @Fields starttime :该字段的意思：入住时间
	*/
	private Date starttime;
	
	
	/**
	* @Fields endtime :该字段的意思:离店时间
	*/
	private Date endtime;
	
	private Set orderses = new HashSet(0);

	private Set rooms = new HashSet(0);
	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerId, String customerName, String idnumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.idnumber = idnumber;
	}

	/** full constructor */
	public Customer(Integer customerId, String customerName, String idnumber,
			Double balance, Set orderses) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.idnumber = idnumber;
		this.balance = balance;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getAccountsPayable() {
		return accountsPayable;
	}

	public void setAccountsPayable(Double accountsPayable) {
		this.accountsPayable = accountsPayable;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Set getRooms() {
		return rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}



	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Double getHouseing() {
		return houseing;
	}

	public void setHouseing(Double houseing) {
		this.houseing = houseing;
	}

}