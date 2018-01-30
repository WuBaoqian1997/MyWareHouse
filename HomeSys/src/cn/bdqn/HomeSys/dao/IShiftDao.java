 /**  
* @Title: IShiftDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����10:53:22
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Shift;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IShiftDao   
 * ��������   ��α�
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����10:53:22   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����10:53:22   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IShiftDao {
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
