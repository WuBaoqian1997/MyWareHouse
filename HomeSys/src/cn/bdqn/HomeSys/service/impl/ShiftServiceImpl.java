 /**  
* @Title: ShiftServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午11:04:37
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import org.hibernate.Session;

import cn.bdqn.HomeSys.dao.IShiftDao;
import cn.bdqn.HomeSys.entity.Shift;
import cn.bdqn.HomeSys.service.IShiftService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：ShiftServiceImpl   
 * 类描述：   
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午11:04:37   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午11:04:37   
 * 修改备注：   
 * @version    
 *    
 */
public class ShiftServiceImpl implements IShiftService {

	private IShiftDao shiftDao;
	
	/**(非 Javadoc)
	 * <p>Title: saveShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#saveShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void saveShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.saveShift(shift);
	}

	/**(非 Javadoc)
	 * <p>Title: updateShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#updateShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void updateShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.updateShift(shift);
	}

	/**(非 Javadoc)
	 * <p>Title: delShift</p>
	 * <p>Description(描述): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#delShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void delShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.delShift(shift);
	}

	/**(非 Javadoc)
	 * <p>Title: getShiftById</p>
	 * <p>Description(描述): </p>
	 * @param shiftid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IShiftService#getShiftById(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public Shift getShiftById(Integer shiftid) {
		// TODO Auto-generated method stub
		return shiftDao.getShiftById(shiftid);
	}

	/**(非 Javadoc)
	 * <p>Title: getShiftsList</p>
	 * <p>Description(描述): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IShiftService#getShiftsList()
	 */

	@Override
	public List<Shift> getShiftsList() {
		// TODO Auto-generated method stub
				
		return shiftDao.getShiftsList();
	}

	
	
	
	public IShiftDao getShiftDao() {
		return shiftDao;
	}

	public void setShiftDao(IShiftDao shiftDao) {
		this.shiftDao = shiftDao;
	}

}
