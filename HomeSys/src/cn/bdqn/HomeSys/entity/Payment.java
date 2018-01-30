package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Payment   
* ��������   ֧����ʽ��
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:48:35   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:48:35   
* �޸ı�ע��   
* @version    
*
 */
public class Payment implements java.io.Serializable {

	// Fields

	/**
	* @Fields paymentId :���ֶε���˼�����
	*/
	private Integer paymentId;
	/**
	* @Fields paymentMethod :���ֶε���˼��֧����ʽ����
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