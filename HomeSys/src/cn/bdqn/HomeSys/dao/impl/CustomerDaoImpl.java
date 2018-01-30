package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.ICustomerDao;
import cn.bdqn.HomeSys.entity.Customer;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：CustomerDaoImpl   
* 类描述：   客户表Dao层实现类
* 创建人：武保谦
* 创建时间：2017-7-24 下午4:25:10   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午4:25:10   
* 修改备注：   
* @version    
*
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {

	/**
	 * (非 Javadoc)
	* <p>Title: saveCustomer</p>
	* <p>Description(描述):添加客户 </p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#saveCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
		Session session = this.getSession();
		session.flush();//清除缓冲
	}

	/**
	 * (非 Javadoc)
	* <p>Title: updateCustomer</p>
	* <p>Description(描述): 修改客户</p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#updateCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(customer);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delCustomer</p>
	* <p>Description(描述): 删除客户 </p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#delCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(customer);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getCustomerByID</p>
	* <p>Description(描述): 根据ID获取客户</p>
	* @param customerID
	* @return
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#getCustomerByID(java.lang.Integer)
	 */
	@Override
	public Customer getCustomerByID(Integer customerID) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Customer.class, customerID);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getCustomerList</p>
	* <p>Description(描述): 获取所以客户</p>
	* @return
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#getCustomerList()
	 */
	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Customer").list();
	}

}
