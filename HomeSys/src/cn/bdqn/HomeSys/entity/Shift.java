package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Shift   
* ��������   ��α�
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:54:31   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:54:31   
* �޸ı�ע��   
* @version    
*
 */
public class Shift implements java.io.Serializable {

	// Fields

	/**
	* @Fields shiftId :���ֶε���˼�����
	*/
	private Integer shiftId;
	/**
	* @Fields shiftName :���ֶε���˼���������
	*/
	private String shiftName;
	/**
	* @Fields shiftStartTime :���ֶε���˼����ο�ʼʱ��
	*/
	private String shiftStartTime;
	/**
	* @Fields shiftEndTime :���ֶε���˼����ν���ʱ��
	*/
	private String shiftEndTime;
	/**
	* @Fields staffs :���ֶε���˼:Ա��
	*/
	private Set staffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Shift() {
	}

	/** minimal constructor */
	public Shift(Integer shiftId, String shiftName, String shiftStartTime,
			String shiftEndTime) {
		this.shiftId = shiftId;
		this.shiftName = shiftName;
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
	}

	/** full constructor */
	public Shift(Integer shiftId, String shiftName, String shiftStartTime,
			String shiftEndTime, Set staffs) {
		this.shiftId = shiftId;
		this.shiftName = shiftName;
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
		this.staffs = staffs;
	}

	// Property accessors

	public Integer getShiftId() {
		return this.shiftId;
	}

	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftName() {
		return this.shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getShiftStartTime() {
		return this.shiftStartTime;
	}

	public void setShiftStartTime(String shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}

	public String getShiftEndTime() {
		return this.shiftEndTime;
	}

	public void setShiftEndTime(String shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}

	public Set getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}

}