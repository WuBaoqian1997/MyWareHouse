package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Position;

/**
 * 
 * 项目名称：HomeSys   
 * 类名称：IPositionDao   
 * 类描述：   
 * 创建人：穆雄雄 
 * 创建时间：2017-7-24 下午9:54:25   
 * 修改人：穆雄雄  
 * 修改时间：2017-7-24 下午9:54:25   
 * 修改备注：   
 * @version
 */
public interface IPositionDao {
	/**
	 * 
	 * @Title: savePosition
	 * @Description: 该方法的主要作用：插入位置信息
	 * @param  @param position 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void savePosition(Position position);
	/**
	 * 
	 * @Title: delPosition
	 * @Description: 该方法的主要作用：删除位置信息
	 * @param  @param position 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void delPosition(Position position);
	/**
	 * 
	 * @Title: updatePosition
	 * @Description: 该方法的主要作用：更新位置信息
	 * @param  @param position 设定文件  
	 * @return  返回类型：void   
	 * @throws
	 */
	void updatePosition(Position position);
	/**
	 * 
	 * @Title: queryPosition
	 * @Description: 该方法的主要作用：查询全部位置信息
	 * @param  @return 设定文件  
	 * @return  返回类型：List<Position>   
	 * @throws
	 */
	List<Position> queryPosition();
	/**
	 * 
	 * @Title: queryPositionById
	 * @Description: 该方法的主要作用：通过id查询位置信息
	 * @param  @param positionId
	 * @param  @return 设定文件  
	 * @return  返回类型：Position   
	 * @throws
	 */
	Position queryPositionById(Integer positionId);
	
	/**
	 * 
	 * @Title: queryPosition
	 * @Description: 该方法的主要作用：查询全部位置信息
	 * @param  @return 设定文件  
	 * @return  返回类型：List<Position>   
	 * @throws
	 */
	List<Position> queryPosition(int first, int size);
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: 该方法的主要作用：查询楼层的总记录数
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	int getPositionCount();
	
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: 该方法的主要作用：查询全部楼层
	 * @param  @return 设定文件  
	 * @return  返回类型：int   
	 * @throws
	 */
	List<Position>  queryAllPosition();
}
