 /**  
* @Title: IAccommodationService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����12:23:40
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Accommodation;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IAccommodationService   
 * ��������   ס�����͵�ҵ���޼���
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����12:23:40   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����12:23:40   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IAccommodationService {

	/**
	 * 
	* @Title: saveAccommodation
	* @Description: �÷�������Ҫ���ã����ס������
	* @param  @param accommodation �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void saveAccommodation(Accommodation accommodation);
	
	/**
	 * 
	* @Title: updateAccommodation
	* @Description: �÷�������Ҫ���ã��޸�ס������
	* @param  @param accommodation �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateAccommodation(Accommodation accommodation);
	
	/**
	 * 
	* @Title: delAccommodation
	* @Description: �÷�������Ҫ���ã�ɾ��ס������
	* @param  @param accommodation �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delAccommodation(Accommodation accommodation);
	
	
	/**
	 * 
	* @Title: getAccommodationById
	* @Description: �÷�������Ҫ���ã����ݱ�Ż�ȡס������
	* @param  @param accommodationId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Accommodation   
	* @throws
	 */
	Accommodation getAccommodationById(Integer accommodationId);
	
	/**
	 * 
	* @Title: getAccommodationList
	* @Description: �÷�������Ҫ���ã���ȡ���е�ס������
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Accommodation>   
	* @throws
	 */
	List<Accommodation> getAccommodationList();

}
