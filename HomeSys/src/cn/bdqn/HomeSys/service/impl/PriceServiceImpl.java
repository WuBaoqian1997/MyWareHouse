 /**  
 * @Title: PriceServiceImpl.java
 * @Package cn.bdqn.HomeSys.service.impl
 * @Description: TODO�÷�������Ҫ���ã�
 * @author A18ccms A18ccms_gmail_com  
 * @date 2017-7-24 ����10:24:23
 * @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IPriceDao;
import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.service.IPriceService;

 /**   
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PriceServiceImpl   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-24 ����10:24:23   
 * �޸��ˣ�������
 * �޸�ʱ�䣺2017-7-24 ����10:24:23   
 * �޸ı�ע��   
 * @version    
 */
public class PriceServiceImpl implements IPriceService {

	private IPriceDao priceDao;
	
	/**(�� Javadoc)
	 * <p>Title: savePrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#savePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void savePrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.savePrice(price);
	}

	/**(�� Javadoc)
	 * <p>Title: delPrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#delPrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void delPrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.delPrice(price);
	}

	/**(�� Javadoc)
	 * <p>Title: updatePrice</p>
	 * <p>Description(����): </p>
	 * @param price
	 * @see cn.bdqn.HomeSys.service.IPriceService#updatePrice(cn.bdqn.HomeSys.entity.Price)
	 */

	@Override
	public void updatePrice(Price price) {
		// TODO Auto-generated method stub
		priceDao.updatePrice(price);
	}

	/**(�� Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPriceService#queryPrice()
	 */

	@Override
	public List<Price> queryPrice() {
		// TODO Auto-generated method stub
		return priceDao.queryPrice();
	}

	/**(�� Javadoc)
	 * <p>Title: queryPriceById</p>
	 * <p>Description(����): </p>
	 * @param priceId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IPriceService#queryPriceById(java.lang.Integer)
	 */

	@Override
	public Price queryPriceById(Integer priceId) {
		// TODO Auto-generated method stub
		return priceDao.queryPriceById(priceId);
	}

	
	/**(�� Javadoc)
	 * <p>Title: queryPrice</p>
	 * <p>Description(����): </p>
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
