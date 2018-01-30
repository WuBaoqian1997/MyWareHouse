 /**  
* @Title: IRoomtypeService.java
* @Package cn.bdqn.HomeSys.service
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午4:19:55
* @version V1.0  
*/
package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomtype;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IRoomtypeService   
 * 类描述：   
 * 创建人：Sun Zhong Tian  
 * 创建时间：2017-7-24 下午4:19:55   
 * 修改人：Sun Zhong Tian    
 * 修改时间：2017-7-24 下午4:19:55   
 * 修改备注：   
 * @version    
 *    
 */
public interface IRoomtypeService {
	/**
	 * 
	* @Title: savaRoomtype
	* @Description: 该方法的主要作用：添加
	* @param  @param roomtype 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void savaRoomtype(Roomtype roomtype);

	/**
	 * 
	* @Title: updateRoomtype
	* @Description: 该方法的主要作用：修改
	* @param  @param roomtype 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateRoomtype(Roomtype roomtype);
	
	/**
	 * 
	* @Title: delRoomtype
	* @Description: 该方法的主要作用：删除
	* @param  @param roomtype 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delRoomtype(Roomtype roomtype);
	
	/**
	 * @return 
	 * 
	* @Title: getRoomtypeById
	* @Description: 该方法的主要作用：根据Id查询
	* @param  @param roomtypeId 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	Roomtype getRoomtypeById(Integer roomtypeId);
	
	/**
	 * 
	* @Title: getRoomtypeList
	* @Description: 该方法的主要作用：查询
	* @param  @return 设定文件  
	* @return  返回类型：List<Roomtype>   
	* @throws
	 */
	List<Roomtype> getRoomtypeList();
	
	/**
	 * 
	* @Title: getRoomtypeList
	* @Description: 该方法的主要作用：查询
	* @param  @return 设定文件  
	* @return  返回类型：List<Roomtype>   
	* @throws
	 */
	List<Roomtype> getRoomtypeList(int fist,int size);
	/**
	 * 
	 * @Title: getRoomtypeCount
	 * @Description: 该方法的主要作用：查询房型的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	int getRoomtypeCount();

	
	List<Roomtype> getAllRoomType();
}
