package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Role   
* ��������   ��ɫ
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:50:54   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:50:54   
* �޸ı�ע��   
* @version    
*
 */
public class Role implements java.io.Serializable {

	// Fields

	/**
	* @Fields roleId :���ֶε���˼�����
	*/
	private Integer roleId;
	/**
	* @Fields roleName :���ֶε���˼������
	*/
	private String roleName;
	/**
	* @Fields staffs :���ֶε���˼��Ա��
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