package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.ICustomerDao;
import cn.bdqn.HomeSys.dao.impl.CustomerDaoImpl;
import cn.bdqn.HomeSys.entity.Customer;
import cn.bdqn.HomeSys.service.ICustomerService;
/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：CustomerServiceImpl   
* 类描述：   客户表service层实现类
* 创建人：武保谦
* 创建时间：2017-7-24 下午4:30:56   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-24 下午4:30:56   
* 修改备注：   
* @version    
*
 */
public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerDao customerDao = new CustomerDaoImpl();
	
	/**
	 * (非 Javadoc)
	* <p>Title: saveCustomer</p>
	* <p>Description(描述): 添加客户</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#saveCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: updateCustomer</p>
	* <p>Description(描述): 修改客户</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#updateCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delCustomer</p>
	* <p>Description(描述): 删除客户</p>
	* @param customer
	* @see cn.bdqn.HomeSys.service.ICustomerService#delCustomer(cn.bdqn.HomeSys.entity.Customer)
	 */
	@Override
	public void delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.delCustomer(customer);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getCustomerByID</p>
	* <p>Description(描述): 根据ID获取客户信息</p>
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
	 * (非 Javadoc)
	* <p>Title: getCustomerList</p>
	* <p>Description(描述):获取所以客户信息 </p>
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
