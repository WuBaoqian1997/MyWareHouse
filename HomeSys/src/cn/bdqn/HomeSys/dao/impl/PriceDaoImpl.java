 /**  
 * @Title: PriceDaoImpl.java
 * @Package cn.bdqn.HomeSys.dao.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:13:41
 * @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IPriceDao;
import cn.bdqn.HomeSys.entity.Price;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PriceDaoImpl   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:13:41   
 * �޸��ˣ�������
 * �޸�ʱ�䣺2017-7-24 ����10:13:41   
 * �޸ı�ע��   
 * @version    
 */
public class PriceDaoImpl extends HibernateDaoSupport implements IPriceDao {

	/**(�� Javadoc)
	 * <p>Title: savePrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#savePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void savePrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(price);
	}

	/**(�� Javadoc)
	 * <p>Title: delPrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#delPrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void delPrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(price);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#updatePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void updatePrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(price);
	}

	/**(�� Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#queryPrice()
	 */

	@Override
	public List<Price> queryPrice() {
		// TODO Auto-generated method stub
		String hql = "from Price";
		return this.getSession().createQuery(hql).list();
	}

	/**(�� Javadoc)
	 * <p>Title: queryPriceById</p>
	 * <p>Description(����): </p>
	 * @param priceId
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#queryPriceById(java.lang.Integer)
	 */

	@Override
	public Price queryPriceById(Integer priceId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Price.class, priceId);
	}


	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return ((Number)this.getHibernateTemplate().find("select count(*) from Price").listIterator().next()).intValue();
	}
	/**(�� Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#queryPrice()
	 */

	@Override
	public List<Price> queryPrice(int first, int size) {
		DetachedCriteria dc = DetachedCriteria.forClass(Price.class);
		
		return this.getHibernateTemplate().findByCriteria(dc,first,size);
	}
}
