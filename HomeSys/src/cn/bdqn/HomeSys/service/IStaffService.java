 /**  
* @Title: IStaffService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:24:30
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Staff;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IStaffService   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:24:30   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:24:30   
 * 修改备注：   
 * @version    
 *    
 */
public interface IStaffService {

	/*
	* @Title: saveShift
	* @Description: 该方法的主要作用：添加
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveStaff(Staff staff);
	
	/**
	 * 
	* @Title: updateShift
	* @Description: 该方法的主要作用：修改
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateStaff(Staff staff);
	
	/**
	 * 
	* @Title: delShift
	* @Description: 该方法的主要作用：删除
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delStaff(Staff staff);
	
	/**
	 * 
	* @Title: getShiftById
	* @Description: 该方法的主要作用：根据id查询
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	Staff getStaffById(Integer staffid);
	
	/**
	 * 
	* @Title: getShiftsList
	* @Description: 该方法的主要作用：查询全部的员工
	* @param  @return 设定文件  
	* @return  返回类型：List<Shift>   
	* @throws
	 */
	List<Staff> getStaffList();
	
	/**
	 * 
	* @Title: getStaffByName
	* @Description: 该方法的主要作用：根据name查询
	* @param  @param staffName
	* @param  @return 设定文件  
	* @return  返回类型：Staff   
	* @throws
	 */
	Staff getStaffByName(String staffName);
	
}
