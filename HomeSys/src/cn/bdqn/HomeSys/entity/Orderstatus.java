package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Orderstatus   
* ��������   ����״̬
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:47:57   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:47:57   
* �޸ı�ע��   
* @version    
*
 */
public class Orderstatus implements java.io.Serializable {

	// Fields

	/**
	* @Fields orderStatusId :���ֶε���˼�����
	*/
	private Integer orderStatusId;
	/**
	* @Fields orderStatusName :���ֶε���˼������
	*/
	private String orderStatusName;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderstatus() {
	}

	/** minimal constructor */
	public Orderstatus(Integer orderStatusId, String orderStatusName) {
		this.orderStatusId = orderStatusId;
		this.orderStatusName = orderStatusName;
	}

	/** full constructor */
	public Orderstatus(Integer orderStatusId, String orderStatusName,
			Set orderses) {
		this.orderStatusId = orderStatusId;
		this.orderStatusName = orderStatusName;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatusName() {
		return this.orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}