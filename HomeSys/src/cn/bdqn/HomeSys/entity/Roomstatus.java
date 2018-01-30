package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Roomstatus   
* ��������   ����״̬
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:53:00   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:53:00   
* �޸ı�ע��   
* @version    
*
 */
public class Roomstatus implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomStatusId :���ֶε���˼�����
	*/
	private Integer roomStatusId;
	/**
	* @Fields roomStatusName :���ֶε���˼������
	*/
	private String roomStatusName;
	/**
	* @Fields rooms :���ֶε���˼������
	*/
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roomstatus() {
	}

	/** minimal constructor */
	public Roomstatus(Integer roomStatusId, String roomStatusName) {
		this.roomStatusId = roomStatusId;
		this.roomStatusName = roomStatusName;
	}

	/** full constructor */
	public Roomstatus(Integer roomStatusId, String roomStatusName, Set rooms) {
		this.roomStatusId = roomStatusId;
		this.roomStatusName = roomStatusName;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getRoomStatusId() {
		return this.roomStatusId;
	}

	public void setRoomStatusId(Integer roomStatusId) {
		this.roomStatusId = roomStatusId;
	}

	public String getRoomStatusName() {
		return this.roomStatusName;
	}

	public void setRoomStatusName(String roomStatusName) {
		this.roomStatusName = roomStatusName;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}