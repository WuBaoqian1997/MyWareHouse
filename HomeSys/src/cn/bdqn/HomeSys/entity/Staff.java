package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Staff   
* ��������   Ա����
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:56:05   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:56:05   
* �޸ı�ע��   
* @version    
*
 */
public class Staff implements java.io.Serializable {

	// Fields

	/**
	* @Fields staffId :���ֶε���˼�����
	*/
	private Integer staffId;
	/**
	* @Fields shift :���ֶε���˼�����
	*/
	private Shift shift;
	/**
	* @Fields role :���ֶε���˼����ɫ
	*/
	private Role role;
	/**
	* @Fields staffName :���ֶε���˼������
	*/
	private String staffName;
	/**
	* @Fields pwd :���ֶε���˼������
	*/
	private String pwd;
	/**
	* @Fields phone :���ֶε���˼���绰
	*/
	private String phone;
	/**
	* @Fields headPortrait :���ֶε���˼��ͷ��
	*/
	private String headPortrait;
	/**
	* @Fields email :���ֶε���˼������
	*/
	private String email;
	/**
	* @Fields address :���ֶε���˼����ַ
	*/
	private String address;
	/**
	* @Fields orderses :���ֶε���˼������
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