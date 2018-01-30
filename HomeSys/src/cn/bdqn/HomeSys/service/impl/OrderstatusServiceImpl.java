 /**  
* @Title: OrderstatusServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午3:57:40
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrderstatusDao;
import cn.bdqn.HomeSys.entity.Orderstatus;
import cn.bdqn.HomeSys.service.IOrderstatusService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：OrderstatusServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午3:57:40   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午3:57:40   
 * 修改备注：   
 * @version    
 *    
 */
public class OrderstatusServiceImpl implements IOrderstatusService {

	private IOrderstatusDao orderstatusDao;
	
	/**(非 Javadoc)
	 * <p>Title: saveOrderstatus</p>
	 * <p>Description(描述): </p>
	 * @param orderstatus
	 * @see cn.bdqn.HomeSys.service.IOrderstatusService#saveOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */

	@Override
	public void saveOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.saveOrderstatus(orderstatus);
	}


	/**
	 * (非 Javadoc)
	* <p>Title: updateOrderstatus</p>
	* <p>Description(描述): 修改</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#updateOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void updateOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.updateOrderstatus(orderstatus);
	}



	/**
	 * (非 Javadoc)
	* <p>Title: delOrderstatus</p>
	* <p>Description(描述):删除 </p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#delOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void delOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.delOrderstatus(orderstatus);
	}



	/**
	 * (非 Javadoc)
	* <p>Title: getOradeOrderstatuById</p>
	* <p>Description(描述):根据id查询 </p>
	* @param orderStatusId
	* @return
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#getOradeOrderstatuById(java.lang.Integer)
	 */
	@Override
	public Orderstatus getOradeOrderstatuById(Integer orderStatusId) {
		// TODO Auto-generated method stub
		return orderstatusDao.getOradeOrderstatuById(orderStatusId);
	}



	/**
	 * (非 Javadoc)
	* <p>Title: getOrderstatuList</p>
	* <p>Description(描述):查询全部 </p>
	* @return
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#getOrderstatuList()
	 */
	@Override
	public List<Orderstatus> getOrderstatuList() {
		// TODO Auto-generated method stub
		return orderstatusDao.getOrderstatuList();
	}
	
	
	public IOrderstatusDao getOrderstatusDao() {
		return orderstatusDao;
	}

	public void setOrderstatusDao(IOrderstatusDao orderstatusDao) {
		this.orderstatusDao = orderstatusDao;
	}

	
	

}
