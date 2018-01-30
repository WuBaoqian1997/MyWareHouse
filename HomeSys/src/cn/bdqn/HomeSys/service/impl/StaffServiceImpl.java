 /**  
* @Title: StaffServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:25:11
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IStaffDao;
import cn.bdqn.HomeSys.entity.Shift;
import cn.bdqn.HomeSys.entity.Staff;
import cn.bdqn.HomeSys.service.IStaffService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�StaffServiceImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:25:11   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:25:11   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class StaffServiceImpl implements IStaffService {

	private IStaffDao staffDao;
	/**
	 * (�� Javadoc)
	* <p>Title: saveStaff</p>
	* <p>Description(����):��� </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#saveStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.saveStaff(staff);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: updateStaff</p>
	* <p>Description(����):�޸� </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#updateStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.updateStaff(staff);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: delStaff</p>
	* <p>Description(����):ɾ�� </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#delStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void delStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.delStaff(staff);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getStaffById</p>
	* <p>Description(����):����id��ѯ </p>
	* @param staffid
	* @return
	* @see cn.bdqn.HomeSys.service.IStaffService#getStaffById(java.lang.Integer)
	 */
	@Override
	public Staff getStaffById(Integer staffid) {
		// TODO Auto-generated method stub
		return staffDao.getStaffById(staffid);
	}

	/**
	 * (�� Javadoc)
	* <p>Title: getStaffList</p>
	* <p>Description(����):��ѯȫ�� </p>
	* @return
	* @see cn.bdqn.HomeSys.service.IStaffService#getStaffList()
	 */
	@Override
	public List<Staff> getStaffList() {
		// TODO Auto-generated method stub
		return staffDao.getStaffList();
	}

	public IStaffDao getStaffDao() {
		return staffDao;
	}

	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public Staff getStaffByName(String staffName) {
				return staffDao.getStaffByName(staffName);
	}
	

	
	
}
