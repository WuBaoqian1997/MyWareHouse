 /**  
* @Title: Ordersitem.java
* @Package cn.bdqn.HomeSys.entity
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 ����10:37:41
* @version V1.0  
*/
package cn.bdqn.HomeSys.entity;

import java.io.Serializable;
import java.util.Date;


 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�Ordersitem   
 * ��������   ��Ŀ��ϸ��
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-30 ����10:37:41   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-30 ����10:37:41   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class Ordersitem implements Serializable {
	/**
	* @Fields itemid :���ֶε���˼�����
	*/
	private Integer itemid;
	/**
	* @Fields itemname :���ֶε���˼����Ŀ����
	*/
	private String itemname;
	/**
	* @Fields itemstatus :���ֶε���˼��״̬
	*/
	private String itemstatus;
	/**
	* @Fields orders :���ֶε���˼������
	*/
	private Orders orders;
	
	/**
	* @Fields xiaofei :���ֶε���˼������
	*/
	private Double xiaofei;
	/**
	* @Fields yue :���ֶε���˼�� ����
	*/
	private Double fukuan;
	
	/**
	* @Fields createtime :���ֶε���˼������ʱ��
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
