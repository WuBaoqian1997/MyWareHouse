 /**  
* @Title: StaffServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:25:11
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
 * 项目名称：HomeSys   
 * 类名称：StaffServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:25:11   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:25:11   
 * 修改备注：   
 * @version    
 *    
 */
public class StaffServiceImpl implements IStaffService {

	private IStaffDao staffDao;
	/**
	 * (非 Javadoc)
	* <p>Title: saveStaff</p>
	* <p>Description(描述):添加 </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#saveStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.saveStaff(staff);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: updateStaff</p>
	* <p>Description(描述):修改 </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#updateStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.updateStaff(staff);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: delStaff</p>
	* <p>Description(描述):删除 </p>
	* @param staff
	* @see cn.bdqn.HomeSys.service.IStaffService#delStaff(cn.bdqn.HomeSys.entity.Staff)
	 */
	@Override
	public void delStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffDao.delStaff(staff);
	}

	/**
	 * (非 Javadoc)
	* <p>Title: getStaffById</p>
	* <p>Description(描述):根据id查询 </p>
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
	 * (非 Javadoc)
	* <p>Title: getStaffList</p>
	* <p>Description(描述):查询全部 </p>
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
