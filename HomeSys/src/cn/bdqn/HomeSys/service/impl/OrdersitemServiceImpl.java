 /**  
* @Title: OrdersitemServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 下午11:28:13
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrdersitemDao;
import cn.bdqn.HomeSys.entity.Ordersitem;
import cn.bdqn.HomeSys.service.IOrdersitemService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：OrdersitemServiceImpl   
 * 类描述：  订单明细的实现类 
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-30 下午11:28:13   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-30 下午11:28:13   
 * 修改备注：   
 * @version    
 *    
 */
public class OrdersitemServiceImpl implements IOrdersitemService {

	private IOrdersitemDao ordersitemDao;
	
	
	/**(非 Javadoc)
	 * <p>Title: saveOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#saveOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void saveOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.saveOrdersItem(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: updateOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#updateOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void updateOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.updateOrdersItem(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: delOrdersItem</p>
	 * <p>Description(描述): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#delOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void delOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.delOrdersItem(ordersitem);
	}

	/**(非 Javadoc)
	 * <p>Title: getOrdersitemsById</p>
	 * <p>Description(描述): </p>
	 * @param itemid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#getOrdersitemsById(java.lang.Integer)
	 */

	@Override
	public Ordersitem getOrdersitemsById(Integer itemid) {
		// TODO Auto-generated method stub
		return ordersitemDao.getOrdersitemsById(itemid);
	}

	/**(非 Javadoc)
	 * <p>Title: getOrdersitems</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#getOrdersitems()
	 */

	@Override
	public List<Ordersitem> getOrdersitems() {
		// TODO Auto-generated method stub
		return ordersitemDao.getOrdersitems();
	}

	
	
	public IOrdersitemDao getOrdersitemDao() {
		return ordersitemDao;
	}

	public void setOrdersitemDao(IOrdersitemDao ordersitemDao) {
		this.ordersitemDao = ordersitemDao;
	}

	@Override
	public List<Ordersitem> getOrdersitemsByOrdersId(Integer ordersid) {
		return ordersitemDao.getOrdersitemsByOrdersId(ordersid);
	}

}
