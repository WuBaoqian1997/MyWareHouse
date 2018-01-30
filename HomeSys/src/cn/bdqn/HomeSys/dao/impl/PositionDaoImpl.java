 /**  
 * @Title: PositionDaoImpl.java
 * @Package cn.bdqn.HomeSys.dao.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:05:54
 * @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IPositionDao;
import cn.bdqn.HomeSys.entity.Position;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PositionDaoImpl   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:05:54   
 * �޸��ˣ�������  
 * �޸�ʱ�䣺2017-7-24 ����10:05:54   
 * �޸ı�ע��   
 * @version    
 */
public class PositionDaoImpl extends HibernateDaoSupport implements IPositionDao {

	/**(�� Javadoc)
	 * <p>Title: savePosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#savePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void savePosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(position);
	}

	/**(�� Javadoc)
	 * <p>Title: delPosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#delPosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void delPosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(position);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePosition</p>
	 * <p>Description(����): </p>
	 * @param position
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#updatePosition(cn.bdqn.HomeSys.entity.Position)
	 */

	@Override
	public void updatePosition(Position position) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(position);
	}

	/**(�� Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPositionDao#queryPosition()
	 */

	@Override
	public List<Position> queryPosition() {
		// TODO Auto-generated method stub
		String hql = "from Position";
		return this.getSession().createQuery(hql).list();
	}

	/**(�� Javadoc)
	 * <p>Title: queryPositionById</p>
	 * <p>Description(����): </p>
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
	
	/**(�� Javadoc)
	 * <p>Title: queryPosition</p>
	 * <p>Description(����): </p>
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
	 * (�� Javadoc)
	* <p>Title: queryAllPosition</p>
	* <p>Description(����):��ѯȫ��¥�� </p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IPositionDao#queryAllPosition()
	 */
	@Override
	public List<Position> queryAllPosition() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Position").list();
	}
}
