package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�Accommodation   
* ��������   ס�����ͱ�
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-7-24 ����11:39:48   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����11:39:48   
* �޸ı�ע��   
* @version    
*
 */

public class Accommodation implements java.io.Serializable {

	// Fields

	/**
	* @Fields accommodationId :���ֶε���˼��ס������ID
	*/
	private Integer accommodationId;    
	/**
	* @Fields accommodationType :���ֶε���˼����������
	*/
	private String accommodationType;
	/**
	* @Fields prices :���ֶε���˼���۸�
	*/
	private Set prices = new HashSet(0);
	/**
	* @Fields orderses :���ֶε���˼������
	*/
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Accommodation() {
	}

	/** minimal constructor */
	public Accommodation(Integer accommodationId, String accommodationType) {
		this.accommodationId = accommodationId;
		this.accommodationType = accommodationType;
	}

	/** full constructor */
	public Accommodation(Integer accommodationId, String accommodationType,
			Set prices, Set orderses) {
		this.accommodationId = accommodationId;
		this.accommodationType = accommodationType;
		this.prices = prices;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getAccommodationId() {
		return this.accommodationId;
	}

	public void setAccommodationId(Integer accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getAccommodationType() {
		return this.accommodationType;
	}

	public void setAccommodationType(String accommodationType) {
		this.accommodationType = accommodationType;
	}

	public Set getPrices() {
		return this.prices;
	}

	public void setPrices(Set prices) {
		this.prices = prices;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}