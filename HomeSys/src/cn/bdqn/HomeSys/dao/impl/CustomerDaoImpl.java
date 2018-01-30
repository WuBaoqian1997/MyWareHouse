package cn.bdqn.HomeSys.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.ICustomerDao;
import cn.bdqn.HomeSys.entity.Customer;

/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�CustomerDaoImpl   
* ��������   �ͻ���Dao��ʵ����
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:25:10   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:25:10   
* �޸ı�ע��   
* @version    
*
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {

	/**
	 * (�� Javadoc)
	* <p>Title: saveCustomer</p>
	* <p>Description(����):��ӿͻ� </p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#saveCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
		Session session = this.getSession();
		session.flush();//�������
	}

	/**
	 * (�� Javadoc)
	* <p>Title: updateCustomer</p>
	* <p>Description(����): �޸Ŀͻ�</p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#updateCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(customer);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delCustomer</p>
	* <p>Description(����): ɾ���ͻ� </p>
	* @param customer
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#delCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(customer);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getCustomerByID</p>
	* <p>Description(����): ����ID��ȡ�ͻ�</p>
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
	 * (�� Javadoc)
	* <p>Title: getCustomerList</p>
	* <p>Description(����): ��ȡ���Կͻ�</p>
	* @return
	* @see cn.bdqn.HomeSys.dao.ICustomerDao#getCustomerList()
	 */
	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return this.getSession().createQuery("from Customer").list();
	}

}
