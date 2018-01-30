package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Shift   
* 类描述：   班次表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:54:31   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:54:31   
* 修改备注：   
* @version    
*
 */
public class Shift implements java.io.Serializable {

	// Fields

	/**
	* @Fields shiftId :该字段的意思：编号
	*/
	private Integer shiftId;
	/**
	* @Fields shiftName :该字段的意思：班次名称
	*/
	private String shiftName;
	/**
	* @Fields shiftStartTime :该字段的意思：班次开始时间
	*/
	private String shiftStartTime;
	/**
	* @Fields shiftEndTime :该字段的意思：班次结束时间
	*/
	private String shiftEndTime;
	/**
	* @Fields staffs :该字段的意思:员工
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