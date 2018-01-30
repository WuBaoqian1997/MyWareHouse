 /**  
 * @Title: PriceDaoImpl.java
 * @Package cn.bdqn.HomeSys.dao.impl
 * @Description: TODO该方法的主要作用：
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 下午10:13:41
 * @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IPriceDao;
import cn.bdqn.HomeSys.entity.Price;

 /**   
 * 项目名称：HomeSys   
 * 类名称：PriceDaoImpl   
 * 类描述：   
 * 创建人：穆雄雄
 * 创建时间：2017-7-24 下午10:13:41   
 * 修改人：穆雄雄
 * 修改时间：2017-7-24 下午10:13:41   
 * 修改备注：   
 * @version    
 */
public class PriceDaoImpl extends HibernateDaoSupport implements IPriceDao {

	/**(非 Javadoc)
	 * <p>Title: savePrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#savePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void savePrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(price);
	}

	/**(非 Javadoc)
	 * <p>Title: delPrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#delPrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void delPrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(price);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#updatePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void updatePrice(Price price) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(price);
	}

	/**(非 Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#queryPrice()
	 */

	@Override
	public List<Price> queryPrice() {
		// TODO Auto-generated method stub
		String hql = "from Price";
		return this.getSession().createQuery(hql).list();
	}

	/**(非 Javadoc)
	 * <p>Title: queryPriceById</p>
	 * <p>Description(描述): </p>
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
	/**(非 Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.dao.IPriceDao#queryPrice()
	 */

	@Override
	public List<Price> queryPrice(int first, int size) {
		DetachedCriteria dc = DetachedCriteria.forClass(Price.class);
		
		return this.getHibernateTemplate().findByCriteria(dc,first,size);
	}
}
