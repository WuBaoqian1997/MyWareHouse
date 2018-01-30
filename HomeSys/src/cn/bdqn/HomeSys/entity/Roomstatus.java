package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Roomstatus   
* 类描述：   房间状态
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:53:00   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:53:00   
* 修改备注：   
* @version    
*
 */
public class Roomstatus implements java.io.Serializable {

	// Fields

	/**
	* @Fields roomStatusId :该字段的意思：编号
	*/
	private Integer roomStatusId;
	/**
	* @Fields roomStatusName :该字段的意思：名称
	*/
	private String roomStatusName;
	/**
	* @Fields rooms :该字段的意思：房间
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