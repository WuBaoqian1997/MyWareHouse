 /**  
* @Title: IRoomstatusService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午6:48:14
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomstatus;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IRoomstatusService   
 * 类描述：   
 * 创建人：Sun Zhong Tian
 * 创建时间：2017-7-24 下午6:48:14   
 * 修改人：Sun Zhong Tian
 * 修改时间：2017-7-24 下午6:48:14   
 * 修改备注：   
 * @version    
 *    
 */
public interface IRoomstatusService {
	/**
	 * 
	* @Title: savaRoomstatus
	* @Description: 该方法的主要作用：添加房间
	* @param  @param roomstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void savaRoomstatus(Roomstatus roomstatus);
	
	
	/**
	 * 
	* @Title: updeteRoomstatus
	* @Description: 该方法的主要作用：修改
	* @param  @param roomstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updeteRoomstatus(Roomstatus roomstatus);
	
	/**
	 * 
	* @Title: delRoomstatus
	* @Description: 该方法的主要作用：删除
	* @param  @param roomstatus 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delRoomstatus(Roomstatus roomstatus);
	
	/**
	 * 
	* @Title: getRoomstatusById
	* @Description: 该方法的主要作用：根据id查询
	* @param  @param roomstatusId
	* @param  @return 设定文件  
	* @return  返回类型：Roomstatus   
	* @throws
	 */
	Roomstatus getRoomstatusById(Integer roomstatusId);
	
	/**
	 * 
	* @Title: getRoomstatusList
	* @Description: 该方法的主要作用：查询
	* @param  @return 设定文件  
	* @return  返回类型：List<Roomstatus>   
	* @throws
	 */
	List<Roomstatus>getRoomstatusList();
	
	/**
	 * 
	* @Title: getRoomstatusById
	* @Description: 该方法的主要作用：根据Name查询
	* @param  @param roomstatusName 
	* @param  @return 设定文件  
	* @return  返回类型：Roomstatus   
	* @throws
	 */
	Roomstatus getRoomstatusByName(String roomstatusName);
}
