 /**  
 * @Title: PriceServiceImpl.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO该方法的主要作用：
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 下午10:24:23
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPriceDao;
import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.service.IPriceService;

 /**   
 * 项目名称：HomeSys   
 * 类名称：PriceServiceImpl   
 * 类描述：   
 * 创建人：穆雄雄
 * 创建时间：2017-7-24 下午10:24:23   
 * 修改人：穆雄雄
 * 修改时间：2017-7-24 下午10:24:23   
 * 修改备注：   
 * @version    
 */
public class PriceServiceImpl implements IPriceService {

	private IPriceDao priceDao;
	
	/**(非 Javadoc)
	 * <p>Title: savePrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#savePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void savePrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.savePrice(price);
	}

	/**(非 Javadoc)
	 * <p>Title: delPrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#delPrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void delPrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.delPrice(price);
	}

	/**(非 Javadoc)
	 * <p>Title: updatePrice</p>
	 * <p>Description(描述): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#updatePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void updatePrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.updatePrice(price);
	}

	/**(非 Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPriceService#queryPrice()
	 */

	@Override
	public List<Price> queryPrice() {
		// TODO Auto-generated method stub
		return priceDao.queryPrice();
	}

	/**(非 Javadoc)
	 * <p>Title: queryPriceById</p>
	 * <p>Description(描述): </p>
	 * @param priceId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPriceService#queryPriceById(java.lang.Integer)
	 */

	@Override
	public Price queryPriceById(Integer priceId) {
		// TODO Auto-generated method stub
		return priceDao.queryPriceById(priceId);
	}

	
	/**(非 Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPriceService#queryPrice()
	 */

	@Override
	public List<Price> queryPrice(int first, int size) {
		// TODO Auto-generated method stub
		return priceDao.queryPrice(first,size);
	}

	@Override
	public int getPositionCount() {
		// TODO Auto-generated method stub
		return priceDao.getPositionCount();
	}
	
	public IPriceDao getPriceDao() {
		return priceDao;
	}

	public void setPriceDao(IPriceDao priceDao) {
		this.priceDao = priceDao;
	}
}
