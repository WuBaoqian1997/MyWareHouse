package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Room   
* ��������   ����
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:51:30   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:51:30   
* �޸ı�ע��   
* @version    
*
 */
public class Room implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomId :���ֶε���˼�����
	*/
	private Integer roomId;
	/**
	* @Fields roomtype :���ֶε���˼����������
	*/
	private Roomtype roomtype;
	/**
	* @Fields roomstatus :���ֶε���˼������״̬
	*/
	private Roomstatus roomstatus;
	/**
	* @Fields price :���ֶε���˼���۸�
	*/
	//private Price price;
	/**
	* @Fields position :���ֶε���˼������λ��
	*/
	private Position position;
	/**
	* @Fields isEffective :���ֶε���˼���Ƿ���Ч Ĭ��Ϊ0��Ч 1 ��Ч
	*/
	private Boolean isEffective;
	/**
	* @Fields characteristic :���ֶε���˼����������
	*/
	private String characteristic;
	/**
	* @Fields remarks :���ֶε���˼����ע
	*/
	private String remarks;
	
	private Integer tag;
	
	/**
	* @Fields orderses :���ֶε���˼������
	*/
	private Set orderses = new HashSet(0);
	
	private Customer customer; 
	

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** minimal constructor */
	public Room(Integer roomId, Roomtype roomtype, Roomstatus roomstatus,
			 Position position, Boolean isEffective) {
		this.roomId = roomId;
		this.roomtype = roomtype;
		this.roomstatus = roomstatus;
		this.position = position;
		this.isEffective = isEffective;
	}

	/** full constructor */
	public Room(Integer roomId, Roomtype roomtype, Roomstatus roomstatus
			, Position position, Boolean isEffective,
			String characteristic, String remarks, Set orderses) {
		this.roomId = roomId;
		this.roomtype = roomtype;
		this.roomstatus = roomstatus;
		this.position = position;
		this.isEffective = isEffective;
		this.characteristic = characteristic;
		this.remarks = remarks;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Roomtype getRoomtype() {
		return this.roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public Roomstatus getRoomstatus() {
		return this.roomstatus;
	}

	public void setRoomstatus(Roomstatus roomstatus) {
		this.roomstatus = roomstatus;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Boolean getIsEffective() {
		return this.isEffective;
	}

	public void setIsEffective(Boolean isEffective) {
		this.isEffective = isEffective;
	}

	public String getCharacteristic() {
		return this.characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getTag() {
		return tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

}