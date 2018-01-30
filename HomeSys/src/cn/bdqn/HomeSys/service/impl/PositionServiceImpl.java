 /**  
 * @Title: PositionServiceImpl.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO该方法的主要作用：
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 下午10:22:13
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPositionDao;
import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.service.IPositionService;

 /**   
 * 项目名称：HomeSys   
 * 类名称：PositionServiceImpl   
 * 类描述：   
 * 创建人：穆雄雄
 * 创建时间：2017-7-24 下午10:22:13   
 * 修改人：穆雄雄
 * 修改时间：2017-7-24 下午10:22:13   
 * 修改备注：   
 * @version    
 */
public class PositionServiceImpl implements IPositionService {
	
	private IPositionDao positionDao;

	/**(非 Javadoc)
	 * <p>Title: savePosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#savePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void savePosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.savePosition(position);
	}

	/**(非 Javadoc)
	 * <p>Title: delPosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#delPosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void delPosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.delPosition(position);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#updatePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void updatePosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.updatePosition(position);
	}

	/**(非 Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPositionService#queryPosition()
	 */

	@Override
	public List<Position> queryPosition() {
		// TODO Auto-generated method stub
		return positionDao.queryPosition();
	}

	/**(非 Javadoc)
	 * <p>Title: queryPositionById</p>
	 * <p>Description(描述): </p>
	 * @param positionId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPositionService#queryPositionById(java.lang.Integer)
	 */

	@Override
	public Position queryPositionById(Integer positionId) {
		// TODO Auto-generated method stub
		return positionDao.queryPositionById(positionId);
	}

	

	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return positionDao.getPositionCount();
	}
	
	/**(非 Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPositionService#queryPosition()
	 */

	@Override
	public List<Position> queryPosition(int first, int size) {
		// TODO Auto-generated method stub
		return positionDao.queryPosition(first,size);
	}
	
	@Override
	public List<Position> queryAllPosition() {
		// TODO Auto-generated method stub
		return positionDao.queryAllPosition();
	}
	
	public IPositionDao getPositionDao() {
		return positionDao;
	}

	public void setPositionDao(IPositionDao positionDao) {
		this.positionDao = positionDao;
	}
}
