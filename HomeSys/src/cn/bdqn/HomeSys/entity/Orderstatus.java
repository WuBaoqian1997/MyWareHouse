package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Orderstatus   
* 类描述：   订单状态
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:47:57   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:47:57   
* 修改备注：   
* @version    
*
 */
public class Orderstatus implements java.io.Serializable {

	// Fields

	/**
	* @Fields orderStatusId :该字段的意思：编号
	*/
	private Integer orderStatusId;
	/**
	* @Fields orderStatusName :该字段的意思：名称
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