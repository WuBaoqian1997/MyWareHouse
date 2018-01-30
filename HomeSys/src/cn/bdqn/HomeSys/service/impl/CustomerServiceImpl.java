package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.ICustomerDao;
import cn.bdqn.HomeSys.dao.impl.CustomerDaoImpl;
import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.service.ICustomerService;
/**
 * 
*    
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�CustomerServiceImpl   
* ��������   �ͻ���service��ʵ����
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-24 ����4:30:56   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-24 ����4:30:56   
* �޸ı�ע��   
* @version    
*
 */
public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerDao customerDao = new CustomerDaoImpl();
	
	/**
	 * (�� Javadoc)
	* <p>Title: saveCustomer</p>
	* <p>Description(����): ��ӿͻ�</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#saveCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: updateCustomer</p>
	* <p>Description(����): �޸Ŀͻ�</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#updateCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delCustomer</p>
	* <p>Description(����): ɾ���ͻ�</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#delCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.delCustomer(customer);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getCustomerByID</p>
	* <p>Description(����): ����ID��ȡ�ͻ���Ϣ</p>
	* @param customerID
	* @return
	* @see cn.bdqn.HomeSys.service.ICustomerService#getCustomerByID(java.lang.Integer)
	 */
	@Override
	public Customer getCustomerByID(Integer customerID) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByID(customerID);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getCustomerList</p>
	* <p>Description(����):��ȡ���Կͻ���Ϣ </p>
	* @return
	* @see cn.bdqn.HomeSys.service.ICustomerService#getCustomerList()
	 */
	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerList();
	}

	public ICustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	
}
