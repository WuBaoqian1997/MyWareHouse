 /**  
 * @Title: PositionDaoImpl.java
 * @Package cn.bdqn.HomeSys.dao.impl
 * @Description: TODO该方法的主要作用：
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 下午10:05:54
 * @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IPositionDao;
import cn.bdqn.HomeSys.entity.Position;

 /**   
 * 项目名称：HomeSys   
 * 类名称：PositionDaoImpl   
 * 类描述：   
 * 创建人：穆雄雄
 * 创建时间：2017-7-24 下午10:05:54   
 * 修改人：穆雄雄  
 * 修改时间：2017-7-24 下午10:05:54   
 * 修改备注：   
 * @version    
 */
public class PositionDaoImpl extends HibernateDaoSupport implements IPositionDao {

	/**(非 Javadoc)
	 * <p>Title: savePosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#savePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void savePosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(position);
	}

	/**(非 Javadoc)
	 * <p>Title: delPosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#delPosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void delPosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(position);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePosition</p>
	 * <p>Description(描述): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#updatePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void updatePosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(position);
	}

	/**(非 Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#queryPosition()
	 */

	@Override
	public List<Position> queryPosition() {
		// TODO Auto-generated method stub
		String hql = "from Position";
		return this.getSession().createQuery(hql).list();
	}

	/**(非 Javadoc)
	 * <p>Title: queryPositionById</p>
	 * <p>Description(描述): </p>
	 * @param positionId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#queryPositionById(java.lang.Integer)
	 */

	@Override
	public Position queryPositionById(Integer positionId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Position.class, positionId);
	}

	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Position").listIterator().next()).intValue();
	}
	
	/**(非 Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#queryPosition()
	 */

	@Override
	public List<Position> queryPosition(int first, int size) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(Position.class);
		return this.getHibernateTemplate().findByCriteria(dc, first, size);
	}
	
	/**
	 * (非 Javadoc)
	* <p>Title: queryAllPosition</p>
	* <p>Description(描述):查询全部楼层 </p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IPositionDao#queryAllPosition()
	 */
	@Override
	public List<Position> queryAllPosition() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Position").list();
	}
}
