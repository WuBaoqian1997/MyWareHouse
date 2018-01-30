 /**  
* @Title: IRoleService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����4:41:51
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Role;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IRoleService   
 * ��������   ��ɫ��ҵ���߼���
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����4:41:51   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����4:41:51   
 * �޸ı�ע��   
 * @version    
 *    
 */
public interface IRoleService {
	
/**
 * 
* @Title: saveIRole
* @Description: �÷�������Ҫ���ã����ӽ�ɫ
* @param  @param accommodation �趨�ļ�  
* @return  �������ͣ�void   
* @throws
 */
	void saveRole(Role role);
	/**
	 * 
	* @Title: updateIRole
	* @Description: �÷�������Ҫ���ã��޸Ľ�ɫ
	* @param  @param role �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void updateRole(Role role);
	/**
	 * 
	* @Title: delIRole
	* @Description: �÷�������Ҫ���ã�ɾ����ɫ
	* @param  @param role �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	void delRole(Role role);
	/**
	 * 
	* @Title: getRoleById
	* @Description: �÷�������Ҫ���ã����ݱ�Ż�ý�ɫ
	* @param  @param roleId
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�Role   
	* @throws
	 */
	Role getRoleById(Integer roleId);
	/**
	 * 
	* @Title: getRoleList
	* @Description: �÷�������Ҫ���ã���ȡ���еĽ�ɫ
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�List<Role>   
	* @throws
	 */
	List<Role> getRoleList();
}
