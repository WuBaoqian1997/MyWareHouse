package cn.bdqn.HomeSys.entity;

import java.util.HashSet;
import java.util.Set;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：Accommodation   
* 类描述：   住宿类型表
* 创建人：Mu Xiongxiong  
* 创建时间：2017-7-24 上午11:39:48   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 上午11:39:48   
* 修改备注：   
* @version    
*
 */

public class Accommodation implements java.io.Serializable {

	// Fields

	/**
	* @Fields accommodationId :该字段的意思：住宿类型ID
	*/
	private Integer accommodationId;    
	/**
	* @Fields accommodationType :该字段的意思：类型名称
	*/
	private String accommodationType;
	/**
	* @Fields prices :该字段的意思：价格
	*/
	private Set prices = new HashSet(0);
	/**
	* @Fields orderses :该字段的意思：订单
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