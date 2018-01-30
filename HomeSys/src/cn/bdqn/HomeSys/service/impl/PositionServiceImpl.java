 /**  
 * @Title: PositionServiceImpl.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:22:13
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPositionDao;
import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.service.IPositionService;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PositionServiceImpl   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:22:13   
 * �޸��ˣ�������
 * �޸�ʱ�䣺2017-7-24 ����10:22:13   
 * �޸ı�ע��   
 * @version    
 */
public class PositionServiceImpl implements IPositionService {
	
	private IPositionDao positionDao;

	/**(�� Javadoc)
	 * <p>Title: savePosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#savePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void savePosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.savePosition(position);
	}

	/**(�� Javadoc)
	 * <p>Title: delPosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#delPosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void delPosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.delPosition(position);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.service.IPositionService#updatePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void updatePosition(Position position) {
		// TODO Auto-generated method stub
		positionDao.updatePosition(position);
	}

	/**(�� Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPositionService#queryPosition()
	 */

	@Override
	public List<Position> queryPosition() {
		// TODO Auto-generated method stub
		return positionDao.queryPosition();
	}

	/**(�� Javadoc)
	 * <p>Title: queryPositionById</p>
	 * <p>Description(����): </p>
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
	
	/**(�� Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(����): </p>
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
