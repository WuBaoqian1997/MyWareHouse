 /**  
* @Title: RoleServiceTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午5:11:16
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
 * 项目名称：HomeSys   
 * 类名称：RoleServiceTest   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午5:11:16   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午5:11:16   
 * 修改备注：   
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
	* @Description: 该方法的主要作用：添加角色
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveRole() {
		Role role = new Role();
		role.setRoleId(((Long)System.currentTimeMillis()).intValue());  //编号
		role.setRoleName("嘿嘿");
		int rel = 0;
		try {
			roleService.saveRole(role);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	/**
	 * 
	* @Title: testUpdateRole
	* @Description: 该方法的主要作用：修改角色名称
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateRole() {
		Role role = roleService.getRoleById(1);
		role.setRoleName("嘿嘿");
		int rel = 0;
		try {
			roleService.updateRole(role);
			rel=1;
		} catch (Exception e) {
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	/**
	 * 
	* @Title: testDelAccommodation
	* @Description: 该方法的主要作用：删角色
	* @param   设定文件  
	* @return  返回类型：void   
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
			// TODO 异常执行块！
			e.printStackTrace();
			rel=0;
		}		
		if(rel>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	/**
	 * 
	* @Title: testgetAccommodationById
	* @Description: 该方法的主要作用：根据ID查询角色
	* @param   设定文件  
	* @return  返回类型：void   
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
	* @Description: 该方法的主要作用：查询所有角色
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetRole() {
		List<Role> roleList  = roleService.getRoleList();
		for (Role role : roleList) {
			System.out.println("编号"+role.getRoleId());
			System.out.println("类型"+role.getRoleName());
		}
	}
	
	public IRoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	
	
}
