package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Price;

/**
 * 
 * 项目名称：HomeSys   
 * 类名称：IPriceDao   
 * 类描述：   
 * 创建人：穆雄雄 
 * 创建时间：2017-7-24 下午10:00:15   
 * 修改人：穆雄雄    
 * 修改时间：2017-7-24 下午10:00:15   
 * 修改备注：   
 * @version
 */
public interface IPriceDao {
	/**
	 * 
	 * @Title: savePrice
	 * @Description: 该方法的主要作用：插入价格信息
	 * @param  @param price 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void savePrice(Price price);
	/**
	 * 
	 * @Title: delPrice
	 * @Description: 该方法的主要作用：删除价格信息
	 * @param  @param price 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void delPrice(Price price);
	/**
	 * 
	 * @Title: updatePrice
	 * @Description: 该方法的主要作用：更新价格信息
	 * @param  @param price 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void updatePrice(Price price);
	/**
	 * 
	 * @Title: queryPrice
	 * @Description: 该方法的主要作用：查询所有价格信息
	 * @param  @return 设定文件  
	 * @return  返回类型：List<Price>   
	 * @throws
	 */
	List<Price> queryPrice();
	/**
	 * 
	 * @Title: queryPriceById
	 * @Description: 该方法的主要作用：通过priceid查询价格信息
	 * @param  @param priceId
	 * @param  @return 设定文件  
	 * @return  返回类型：Price   
	 * @throws
	 */
	Price queryPriceById(Integer priceId);
	
	/**
	 * 
	 * @Title: queryPrice
	 * @Description: 该方法的主要作用：查询所有价格信息
	 * @param  @return 设定文件  
	 * @return  返回类型：List<Price>   
	 * @throws
	 */
	List<Price> queryPrice(int first, int size);
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: 该方法的主要作用：查询楼层的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throwsint first, int size
	 */
	int getPositionCount();
}
