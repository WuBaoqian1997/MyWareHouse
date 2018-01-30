package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Roomtype   
* 类描述：   房间类型
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:53:39   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:53:39   
* 修改备注：   
* @version    
*
 */
public class Roomtype implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomTypeId :该字段的意思：编号
	*/
	private Integer roomTypeId;
	/**
	* @Fields roomTypeName :该字段的意思：名称
	*/
	private String roomTypeName;
	/**
	* @Fields bedType :该字段的意思：	床数
	*/
	private Integer bedType;
	/**
	* @Fields acreage :该字段的意思：面积
	*/
	private Double acreage;
	/**
	* @Fields rooms :该字段的意思：房间
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