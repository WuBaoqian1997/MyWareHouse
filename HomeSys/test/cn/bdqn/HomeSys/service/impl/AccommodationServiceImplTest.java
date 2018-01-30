 /**  
* @Title: AccommodationServiceImplTest.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午1:36:26
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.Init;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.service.IAccommodationService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：AccommodationServiceImplTest   
 * 类描述：  测试住宿类型 
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午1:36:26   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午1:36:26   
 * 修改备注：   
 * @version    
 *    
 */
public class AccommodationServiceImplTest {

	private IAccommodationService accommodationService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		accommodationService = (IAccommodationService)ctx.getBean("accommodationService");
	} 
	
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：添加住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testSaveAccommodation() {
		Accommodation accommodation = new Accommodation();
		accommodation.setAccommodationId(((Long)System.currentTimeMillis()).intValue());  //编号
		accommodation.setAccommodationType("团购");
		int rel = 0;
		try {
			accommodationService.saveAccommodation(accommodation);
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
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：修改住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testUpdateAccommodation() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		accommodation.setAccommodationType("团购");
		int rel = 0;
		try {
			accommodationService.updateAccommodation(accommodation);
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
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：删除住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testDelAccommodation() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		int rel = 0;
		try {
			accommodationService.delAccommodation(accommodation);
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
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：根据id查询
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetAccommodationById() {
		Accommodation accommodation = accommodationService.getAccommodationById(1931489704);
		System.out.println(accommodation.getAccommodationType());
	}
	
	/**
	 * 
	* @Title: testSaveAccommodation
	* @Description: 该方法的主要作用：查询全部的住宿类型
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	@Test
	public void testgetAccommodations() {
		List<Accommodation> accommodationList  = accommodationService.getAccommodationList();
		for (Accommodation accommodation : accommodationList) {
			System.out.println("编号"+accommodation.getAccommodationId());
			System.out.println("类型"+accommodation.getAccommodationType());
		}
	}
	
	
	
	
	public IAccommodationService getAccommodationService() {
		return accommodationService;
	}

	public void setAccommodationService(IAccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}
	
	

}
