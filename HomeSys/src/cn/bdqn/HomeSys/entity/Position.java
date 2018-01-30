package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Position   
* ��������   λ�ñ�
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:49:02   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:49:02   
* �޸ı�ע��   
* @version    
*
 */
public class Position implements java.io.Serializable {

	// Fields

	/**
	* @Fields positionId :���ֶε���˼�����
	*/
	private Integer positionId;
	/**
	* @Fields positionName :���ֶε���˼������
	*/
	private String positionName;
	/**
	* @Fields rooms :���ֶε���˼������
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