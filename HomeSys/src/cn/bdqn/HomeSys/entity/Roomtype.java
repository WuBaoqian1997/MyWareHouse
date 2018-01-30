package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Roomtype   
* ��������   ��������
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:53:39   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:53:39   
* �޸ı�ע��   
* @version    
*
 */
public class Roomtype implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomTypeId :���ֶε���˼�����
	*/
	private Integer roomTypeId;
	/**
	* @Fields roomTypeName :���ֶε���˼������
	*/
	private String roomTypeName;
	/**
	* @Fields bedType :���ֶε���˼��	����
	*/
	private Integer bedType;
	/**
	* @Fields acreage :���ֶε���˼�����
	*/
	private Double acreage;
	/**
	* @Fields rooms :���ֶε���˼������
	*/
	
	private Set rooms = new HashSet(0);

	private Price price;
	
	// Constructors

	/** default constructor */
	public Roomtype() {
	}

	/** minimal constructor */
	public Roomtype(Integer roomTypeId, String roomTypeName) {
		this.roomTypeId = roomTypeId;
		this.roomTypeName = roomTypeName;
	}

	/** full constructor */
	public Roomtype(Integer roomTypeId, String roomTypeName, Integer bedType,
			Double acreage, Set rooms) {
		this.roomTypeId = roomTypeId;
		this.roomTypeName = roomTypeName;
		this.bedType = bedType;
		this.acreage = acreage;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRoomTypeId() {
		return this.roomTypeId;
	}

	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return this.roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public Integer getBedType() {
		return this.bedType;
	}

	public void setBedType(Integer bedType) {
		this.bedType = bedType;
	}

	public Double getAcreage() {
		return this.acreage;
	}

	public void setAcreage(Double acreage) {
		this.acreage = acreage;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

}