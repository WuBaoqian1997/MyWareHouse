 /**  
* @Title: Ordersitem.java
* @Package cn.bdqn.HomeSys.entity
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 下午10:37:41
* @version V1.0  
*/
package cn.bdqn.HomeSys.entity;

import java.io.Serializable;
import java.util.Date;


 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：Ordersitem   
 * 类描述：   项目明细表
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-30 下午10:37:41   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-30 下午10:37:41   
 * 修改备注：   
 * @version    
 *    
 */
public class Ordersitem implements Serializable {
	/**
	* @Fields itemid :该字段的意思：编号
	*/
	private Integer itemid;
	/**
	* @Fields itemname :该字段的意思：项目名称
	*/
	private String itemname;
	/**
	* @Fields itemstatus :该字段的意思：状态
	*/
	private String itemstatus;
	/**
	* @Fields orders :该字段的意思：订单
	*/
	private Orders orders;
	
	/**
	* @Fields xiaofei :该字段的意思：消费
	*/
	private Double xiaofei;
	/**
	* @Fields yue :该字段的意思： 付款
	*/
	private Double fukuan;
	
	/**
	* @Fields createtime :该字段的意思：操作时间
	*/
	private Date createtime;
	
	
	
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemstatus() {
		return itemstatus;
	}
	public void setItemstatus(String itemstatus) {
		this.itemstatus = itemstatus;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Double getXiaofei() {
		return xiaofei;
	}
	public void setXiaofei(Double xiaofei) {
		this.xiaofei = xiaofei;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Double getFukuan() {
		return fukuan;
	}
	public void setFukuan(Double fukuan) {
		this.fukuan = fukuan;
	}
	

	
	
	
}
