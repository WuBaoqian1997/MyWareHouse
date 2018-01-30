 /**  
* @Title: OrdersitemServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-30 ����11:28:13
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrdersitemDao;
import cn.bdqn.HomeSys.entity.Ordersitem;
import cn.bdqn.HomeSys.service.IOrdersitemService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�OrdersitemServiceImpl   
 * ��������  ������ϸ��ʵ���� 
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-30 ����11:28:13   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-30 ����11:28:13   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class OrdersitemServiceImpl implements IOrdersitemService {

	private IOrdersitemDao ordersitemDao;
	
	
	/**(�� Javadoc)
	 * <p>Title: saveOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#saveOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void saveOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.saveOrdersItem(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: updateOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#updateOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void updateOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.updateOrdersItem(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: delOrdersItem</p>
	 * <p>Description(����): </p>
	 * @param ordersitem
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#delOrdersItem(cn.bdqn.HomeSys.entity.Ordersitem)
	 */

	@Override
	public void delOrdersItem(Ordersitem ordersitem) {
		// TODO Auto-generated method stub
		ordersitemDao.delOrdersItem(ordersitem);
	}

	/**(�� Javadoc)
	 * <p>Title: getOrdersitemsById</p>
	 * <p>Description(����): </p>
	 * @param itemid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IOrdersitemService#getOrdersitemsById(java.lang.Integer)
	 */

	@Override
	public Ordersitem getOrdersitemsById(Integer itemid) {
		// TODO Auto-generated method stub
		return ordersitemDao.getOrdersitemsById(itemid);
	}

	/**(�� Javadoc)
	 * <p>Title: getOrdersitems</p>
	 * <p>Description(����): </p>
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
