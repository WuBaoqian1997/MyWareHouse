 /**  
* @Title: IShiftService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:03:47
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Shift;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IShiftService   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:03:47   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:03:47   
 * 修改备注：   
 * @version    
 *    
 */
public interface IShiftService {
	
	/**
	 * 
	* @Title: saveShift
	* @Description: 该方法的主要作用：添加
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveShift(Shift shift);
	
	/**
	 * 
	* @Title: updateShift
	* @Description: 该方法的主要作用：修改
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateShift(Shift shift);
	
	/**
	 * 
	* @Title: delShift
	* @Description: 该方法的主要作用：删除
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delShift(Shift shift);
	
	/**
	 * 
	* @Title: getShiftById
	* @Description: 该方法的主要作用：根据id查询
	* @param  @param shift 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	Shift getShiftById(Integer shiftid);
	
	/**
	 * 
	* @Title: getShiftsList
	* @Description: 该方法的主要作用：查询全部的班次
	* @param  @return 设定文件  
	* @return  返回类型：List<Shift>   
	* @throws
	 */
	List<Shift> getShiftsList();

}
