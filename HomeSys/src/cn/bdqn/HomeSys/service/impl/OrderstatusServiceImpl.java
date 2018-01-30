 /**  
* @Title: OrderstatusServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����3:57:40
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IOrderstatusDao;
import cn.bdqn.HomeSys.entity.Orderstatus;
import cn.bdqn.HomeSys.service.IOrderstatusService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�OrderstatusServiceImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����3:57:40   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����3:57:40   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class OrderstatusServiceImpl implements IOrderstatusService {

	private IOrderstatusDao orderstatusDao;
	
	/**(�� Javadoc)
	 * <p>Title: saveOrderstatus</p>
	 * <p>Description(����): </p>
	 * @param orderstatus
	 * @see cn.bdqn.HomeSys.service.IOrderstatusService#saveOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */

	@Override
	public void saveOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.saveOrderstatus(orderstatus);
	}


	/**
	 * (�� Javadoc)
	* <p>Title: updateOrderstatus</p>
	* <p>Description(����): �޸�</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#updateOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void updateOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.updateOrderstatus(orderstatus);
	}



	/**
	 * (�� Javadoc)
	* <p>Title: delOrderstatus</p>
	* <p>Description(����):ɾ�� </p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.service.IOrderstatusService#delOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void delOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		orderstatusDao.delOrderstatus(orderstatus);
	}



	/**
	 * (�� Javadoc)
	* <p>Title: getOradeOrderstatuById</p>
	* <p>Description(����):����id��ѯ </p>
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
	 * (�� Javadoc)
	* <p>Title: getOrderstatuList</p>
	* <p>Description(����):��ѯȫ�� </p>
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
