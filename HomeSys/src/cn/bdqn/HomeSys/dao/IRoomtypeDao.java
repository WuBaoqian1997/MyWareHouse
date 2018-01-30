package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Roomtype;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：IRoomtypeDao   
* 类描述：   
* 创建人：Sun Zhong Tian  
* 创建时间：2017-7-24 下午3:51:19   
* 修改人：Sun Zhong Tian  
* 修改时间：2017-7-24 下午3:51:19   
* 修改备注：   
* @version    
*
 */
public interface IRoomtypeDao {
	
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
	List<Roomtype> getRoomtypeList(int first,int size);
	
	/**
	 * 
	 * @Title: getRoomtypeCount
	 * @Description: 该方法的主要作用：查询房型的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	int getRoomtypeCount();
	
	/**
	 * 
	 * @Title: getAllRoomType
	 * @Description: 该方法的主要作用：查询全部
	 * @param  @return 设定文件  
	 * @return  返回类型：List<Roomtype>   
	 * @throws
	 */
	List<Roomtype> getAllRoomType();
	
	
	
	
}
