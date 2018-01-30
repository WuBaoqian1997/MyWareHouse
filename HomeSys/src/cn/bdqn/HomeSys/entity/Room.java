package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Room   
* 类描述：   房间
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:51:30   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:51:30   
* 修改备注：   
* @version    
*
 */
public class Room implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomId :该字段的意思：编号
	*/
	private Integer roomId;
	/**
	* @Fields roomtype :该字段的意思：房间类型
	*/
	private Roomtype roomtype;
	/**
	* @Fields roomstatus :该字段的意思：房间状态
	*/
	private Roomstatus roomstatus;
	/**
	* @Fields price :该字段的意思：价格
	*/
	//private Price price;
	/**
	* @Fields position :该字段的意思：房间位置
	*/
	private Position position;
	/**
	* @Fields isEffective :该字段的意思：是否有效 默认为0有效 1 无效
	*/
	private Boolean isEffective;
	/**
	* @Fields characteristic :该字段的意思：房间特性
	*/
	private String characteristic;
	/**
	* @Fields remarks :该字段的意思：备注
	*/
	private String remarks;
	
	private Integer tag;
	
	/**
	* @Fields orderses :该字段的意思：订单
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