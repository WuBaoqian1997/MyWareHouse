 /**  
* @Title: RoleServiceTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����5:11:16
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.entity.Role;
import cn.bdqn.HomeSys.service.IAccommodationService;
import cn.bdqn.HomeSys.service.IRoleService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�RoleServiceTest   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����5:11:16   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����5:11:16   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class RoleServiceTest {
	private IRoleService roleService;
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		roleService = (IRoleService)ctx.getBean("roleService");
	} 
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: �÷�������Ҫ���ã���ӽ�ɫ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testSaveRole() {
		Role role = new Role();
		role.setRoleId(((Long)System.currentTimeMillis()).intValue());  //���
		role.setRoleName("�ٺ�");
		int rel = 0;
		try {
			roleService.saveRole(role);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}
	/**
	 * 
	* @Title: testUpdateRole
	* @Description: �÷�������Ҫ���ã��޸Ľ�ɫ����
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testUpdateRole() {
		Role role = roleService.getRoleById(1);
		role.setRoleName("�ٺ�");
		int rel = 0;
		try {
			roleService.updateRole(role);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	/**
	 * 
	* @Title: testDelAccommodation
	* @Description: �÷�������Ҫ���ã�ɾ��ɫ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testDelRole() {
		Role role = roleService.getRoleById(1);
		int rel = 0;
		try {
			roleService.delRole(role);
			rel=1;
		} catch (Exception e) {
			// TODO �쳣ִ�п飡
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
	}
	/**
	 * 
	* @Title: testgetAccommodationById
	* @Description: �÷�������Ҫ���ã�����ID��ѯ��ɫ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetRoleById() {
		Role role = roleService.getRoleById(1);
		System.out.println(role.getRoleName());
	}
	/**
	 * 
	* @Title: testgetRole
	* @Description: �÷�������Ҫ���ã���ѯ���н�ɫ
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	@Test
	public void testgetRole() {
		List<Role> roleList  = roleService.getRoleList();
		for (Role role : roleList) {
			System.out.println("���"+role.getRoleId());
			System.out.println("����"+role.getRoleName());
		}
	}
	
	public IRoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	
	
}
