 /**  
* @Title: IStaffService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:24:30
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Staff;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IStaffService   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:24:30   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:24:30   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IStaffService {

	/*
	* @Title: saveShift
	* @Description: �÷�������Ҫ���ã����
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveStaff(Staff staff);
	
	/**
	 * 
	* @Title: updateShift
	* @Description: �÷�������Ҫ���ã��޸�
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateStaff(Staff staff);
	
	/**
	 * 
	* @Title: delShift
	* @Description: �÷�������Ҫ���ã�ɾ��
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delStaff(Staff staff);
	
	/**
	 * 
	* @Title: getShiftById
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	Staff getStaffById(Integer staffid);
	
	/**
	 * 
	* @Title: getShiftsList
	* @Description: �÷�������Ҫ���ã���ѯȫ����Ա��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Shift>   
	* @throws
	 */
	List<Staff> getStaffList();
	
	/**
	 * 
	* @Title: getStaffByName
	* @Description: �÷�������Ҫ���ã�����name��ѯ
	* @param  @param staffName
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Staff   
	* @throws
	 */
	Staff getStaffByName(String staffName);
	
}
