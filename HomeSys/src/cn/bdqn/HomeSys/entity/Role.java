package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Role   
* 类描述：   角色
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:50:54   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:50:54   
* 修改备注：   
* @version    
*
 */
public class Role implements java.io.Serializable {

	// Fields

	/**
	* @Fields roleId :该字段的意思：编号
	*/
	private Integer roleId;
	/**
	* @Fields roleName :该字段的意思：名称
	*/
	private String roleName;
	/**
	* @Fields staffs :该字段的意思：员工
	*/
	private Set staffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(Integer roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	/** full constructor */
	public Role(Integer roleId, String roleName, Set staffs) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.staffs = staffs;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}

}