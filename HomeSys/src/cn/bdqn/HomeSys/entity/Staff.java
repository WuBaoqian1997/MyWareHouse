package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Staff   
* 类描述：   员工表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:56:05   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:56:05   
* 修改备注：   
* @version    
*
 */
public class Staff implements java.io.Serializable {

	// Fields

	/**
	* @Fields staffId :该字段的意思：编号
	*/
	private Integer staffId;
	/**
	* @Fields shift :该字段的意思：班次
	*/
	private Shift shift;
	/**
	* @Fields role :该字段的意思：角色
	*/
	private Role role;
	/**
	* @Fields staffName :该字段的意思：姓名
	*/
	private String staffName;
	/**
	* @Fields pwd :该字段的意思：密码
	*/
	private String pwd;
	/**
	* @Fields phone :该字段的意思：电话
	*/
	private String phone;
	/**
	* @Fields headPortrait :该字段的意思：头像
	*/
	private String headPortrait;
	/**
	* @Fields email :该字段的意思：邮箱
	*/
	private String email;
	/**
	* @Fields address :该字段的意思：地址
	*/
	private String address;
	/**
	* @Fields orderses :该字段的意思：订单
	*/
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(Integer staffId, Shift shift, Role role, String staffName,
			String pwd) {
		this.staffId = staffId;
		this.shift = shift;
		this.role = role;
		this.staffName = staffName;
		this.pwd = pwd;
	}


	// Property accessors

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Shift getShift() {
		return this.shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getHeadPortrait() {
		return this.headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Staff(Integer staffId, Shift shift, Role role, String staffName,
			String pwd, String phone, String headPortrait, String email,
			String address, Set orderses) {
		super();
		this.staffId = staffId;
		this.shift = shift;
		this.role = role;
		this.staffName = staffName;
		this.pwd = pwd;
		this.phone = phone;
		this.headPortrait = headPortrait;
		this.email = email;
		this.address = address;
		this.orderses = orderses;
	}

}