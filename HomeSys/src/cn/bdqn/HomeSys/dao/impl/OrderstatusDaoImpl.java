 /**  
* @Title: OrderstatusDaoImpl.java
* @Package cn.bdqn.HomeSys.dao.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����3:55:46
* @version V1.0  
*/
package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IOrderstatusDao;
import cn.bdqn.HomeSys.entity.Orderstatus;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�OrderstatusDaoImpl   
 * ��������   ����״̬���ʵ����
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����3:55:46   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����3:55:46   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class OrderstatusDaoImpl extends HibernateDaoSupport implements
		IOrderstatusDao {

	/**(�� Javadoc)
	 * <p>Title: saveOrderstatus</p>
	 * <p>Description(����): ��Ӷ���״̬</p>
	 * @param orderstatus
	 * @see cn.bdqn.HomeSys.dao.IOrderstatusDao#saveOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */

	@Override
	public void saveOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(orderstatus);
	}

	
	/**
	 * (�� Javadoc)
	* <p>Title: updateOrderstatus</p>
	* <p>Description(����): �޸Ķ���״̬</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#updateOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void updateOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(orderstatus);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delOrderstatus</p>
	* <p>Description(����): ɾ������״̬</p>
	* @param orderstatus
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#delOrderstatus(cn.bdqn.HomeSys.entity.Orderstatus)
	 */
	@Override
	public void delOrderstatus(Orderstatus orderstatus) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orderstatus);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOradeOrderstatuById</p>
	* <p>Description(����):����id��ѯ����״̬ </p>
	* @param orderStatusId
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#getOradeOrderstatuById(java.lang.Integer)
	 */
	@Override
	public Orderstatus getOradeOrderstatuById(Integer orderStatusId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orderstatus.class, orderStatusId);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getOrderstatuList</p>
	* <p>Description(����):��ѯȫ���Ķ���״̬ </p>
	* @return
	* @see cn.bdqn.HomeSys.dao.IOrderstatusDao#getOrderstatuList()
	 */
	@Override
	public List<Orderstatus> getOrderstatuList() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		return session.createQuery("from Orderstatus").list();
	}

}
