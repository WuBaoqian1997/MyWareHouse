package cn.bdqn.HomeSys.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Price   
* ��������   ���۱�
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:49:33   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:49:33   
* �޸ı�ע��   
* @version    
*
 */
public class Price implements java.io.Serializable {

	// Fields

	/**
	* @Fields priceId :���ֶε���˼�����
	*/
	private Integer priceId;
	/**
	* @Fields accommodation :���ֶε���˼��ס������ID
	*/
	private Accommodation accommodation;
	/**
	* @Fields startTime :���ֶε���˼����ʼʱ��
	*/
	private Date startTime;
	/**
	* @Fields endTime :���ֶε���˼������ʱ��
	*/
	private Date endTime;
	/**
	* @Fields routinePrice :���ֶε���˼�������
	*/
	private Double routinePrice;
	/**
	* @Fields weekendPrice :���ֶε���˼����ĩ��
	*/
	private Double weekendPrice;
	/**
	* @Fields rooms :���ֶε���˼������
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