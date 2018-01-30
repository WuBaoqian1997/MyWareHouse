 /**  
* @Title: IAccommodationDao.java
* @Package cn.bdqn.HomeSys.dao
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 上午11:59:26
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Accommodation;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：IAccommodationDao   
 * 类描述：   住宿类型
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 上午11:59:26   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 上午11:59:26   
 * 修改备注：   
 * @version    
 *    
 */
public interface IAccommodationDao {
	
	/**
	 * 
	* @Title: saveAccommodation
	* @Description: 该方法的主要作用：添加住宿类型
	* @param  @param accommodation 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void saveAccommodation(Accommodation accommodation);
	
	/**
	 * 
	* @Title: updateAccommodation
	* @Description: 该方法的主要作用：修改住宿类型
	* @param  @param accommodation 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void updateAccommodation(Accommodation accommodation);
	
	/**
	 * 
	* @Title: delAccommodation
	* @Description: 该方法的主要作用：删除住宿类型
	* @param  @param accommodation 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	void delAccommodation(Accommodation accommodation);
	
	
	/**
	 * 
	* @Title: getAccommodationById
	* @Description: 该方法的主要作用：根据编号获取住宿类型
	* @param  @param accommodationId
	* @param  @return 设定文件  
	* @return  返回类型：Accommodation   
	* @throws
	 */
	Accommodation getAccommodationById(Integer accommodationId);
	
	/**
	 * 
	* @Title: getAccommodationList
	* @Description: 该方法的主要作用：获取所有的住宿类型
	* @param  @return 设定文件  
	* @return  返回类型：List<Accommodation>   
	* @throws
	 */
	List<Accommodation> getAccommodationList();

}
