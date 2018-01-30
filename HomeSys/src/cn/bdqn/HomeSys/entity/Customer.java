package cn.bdqn.HomeSys.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * +
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Customer   
* ��������   �ͻ���Ϣ��
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:44:17   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:44:17   
* �޸ı�ע��   
* @version    
*
 */
public class Customer implements java.io.Serializable {

	// Fields

	/**
	* @Fields customerId :���ֶε���˼���ͻ���Ϣ���
	*/
	private Integer customerId;
	/**
	* @Fields customerName :���ֶε���˼���ͻ�����
	*/
	private String customerName;
	/**
	* @Fields idnumber :���ֶε���˼�����֤��
	*/
	private String idnumber;
	/**
	* @Fields balance :���ֶε���˼�����
	*/
	private Double balance;
	
	/**
	* @Fields payment :���ֶε���˼��֧����ʽ
	*/
	private Payment payment;
	
	/**
	* @Fields deposit :���ֶε���˼��Ѻ����
	*/
	private Double deposit;
	/**
	* @Fields accountsPayable :���ֶε���˼�����ѽ��
	*/
	private Double accountsPayable;
	
	/**
	* @Fields phone :���ֶε���˼���绰����
	*/
	private String phone;
	
	//���շ���
	/**
	* @Fields houseing :���ֶε���˼�����շ���
	*/
	private Double houseing;
	
	

	/**
	* @Fields starttime :���ֶε���˼����סʱ��
	*/
	private Date starttime;
	
	
	/**
	* @Fields endtime :���ֶε���˼:���ʱ��
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