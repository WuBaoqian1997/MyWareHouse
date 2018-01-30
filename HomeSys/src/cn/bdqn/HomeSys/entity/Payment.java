package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Payment   
* 类描述：   支付方式表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:48:35   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:48:35   
* 修改备注：   
* @version    
*
 */
public class Payment implements java.io.Serializable {

	// Fields

	/**
	* @Fields paymentId :该字段的意思：编号
	*/
	private Integer paymentId;
	/**
	* @Fields paymentMethod :该字段的意思：支付方式名称
	*/
	private String paymentMethod;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** minimal constructor */
	public Payment(Integer paymentId, String paymentMethod) {
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
	}

	/** full constructor */
	public Payment(Integer paymentId, String paymentMethod, Set orderses) {
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}