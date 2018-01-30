package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Position   
* 类描述：   位置表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:49:02   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:49:02   
* 修改备注：   
* @version    
*
 */
public class Position implements java.io.Serializable {

	// Fields

	/**
	* @Fields positionId :该字段的意思：编号
	*/
	private Integer positionId;
	/**
	* @Fields positionName :该字段的意思：名称
	*/
	private String positionName;
	/**
	* @Fields rooms :该字段的意思：房间
	*/
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** minimal constructor */
	public Position(Integer positionId, String positionName) {
		this.positionId = positionId;
		this.positionName = positionName;
	}

	/** full constructor */
	public Position(Integer positionId, String positionName, Set rooms) {
		this.positionId = positionId;
		this.positionName = positionName;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}