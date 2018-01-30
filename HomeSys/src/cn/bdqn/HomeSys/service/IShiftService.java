 /**  
* @Title: IShiftService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:03:47
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Shift;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IShiftService   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:03:47   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:03:47   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IShiftService {
	
	/**
	 * 
	* @Title: saveShift
	* @Description: �÷�������Ҫ���ã����
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveShift(Shift shift);
	
	/**
	 * 
	* @Title: updateShift
	* @Description: �÷�������Ҫ���ã��޸�
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateShift(Shift shift);
	
	/**
	 * 
	* @Title: delShift
	* @Description: �÷�������Ҫ���ã�ɾ��
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delShift(Shift shift);
	
	/**
	 * 
	* @Title: getShiftById
	* @Description: �÷�������Ҫ���ã�����id��ѯ
	* @param  @param shift �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	Shift getShiftById(Integer shiftid);
	
	/**
	 * 
	* @Title: getShiftsList
	* @Description: �÷�������Ҫ���ã���ѯȫ���İ��
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Shift>   
	* @throws
	 */
	List<Shift> getShiftsList();

}
