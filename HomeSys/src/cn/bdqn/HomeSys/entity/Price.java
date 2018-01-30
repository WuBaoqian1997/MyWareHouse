package cn.bdqn.HomeSys.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Price   
* 类描述：   房价表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:49:33   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:49:33   
* 修改备注：   
* @version    
*
 */
public class Price implements java.io.Serializable {

	// Fields

	/**
	* @Fields priceId :该字段的意思：编号
	*/
	private Integer priceId;
	/**
	* @Fields accommodation :该字段的意思：住宿类型ID
	*/
	private Accommodation accommodation;
	/**
	* @Fields startTime :该字段的意思：开始时间
	*/
	private Date startTime;
	/**
	* @Fields endTime :该字段的意思：结束时间
	*/
	private Date endTime;
	/**
	* @Fields routinePrice :该字段的意思：常规价
	*/
	private Double routinePrice;
	/**
	* @Fields weekendPrice :该字段的意思：周末价
	*/
	private Double weekendPrice;
	/**
	* @Fields rooms :该字段的意思：房间
	*/
	private Set rooms = new HashSet(0);
	private Set roomType  = new HashSet(0);
	// Constructors




	// Property accessors

	public Integer getPriceId() {
		return this.priceId;
	}

	public Price() {
		super();
	}


	public Price(Integer priceId, Accommodation accommodation, Date startTime,
			Date endTime, Double routinePrice, Double weekendPrice, Set rooms,
			Set roomType) {
		super();
		this.priceId = priceId;
		this.accommodation = accommodation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.routinePrice = routinePrice;
		this.weekendPrice = weekendPrice;
		this.rooms = rooms;
		this.roomType = roomType;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	public Accommodation getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}


	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Double getRoutinePrice() {
		return this.routinePrice;
	}

	public void setRoutinePrice(Double routinePrice) {
		this.routinePrice = routinePrice;
	}

	public Double getWeekendPrice() {
		return this.weekendPrice;
	}

	public void setWeekendPrice(Double weekendPrice) {
		this.weekendPrice = weekendPrice;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Set getRoomType() {
		return roomType;
	}

	public void setRoomType(Set roomType) {
		this.roomType = roomType;
	}

}