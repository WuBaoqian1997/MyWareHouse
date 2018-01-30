 /**  
* @Title: ShiftServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����11:04:37
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
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�ShiftServiceImpl   
 * ��������   
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����11:04:37   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����11:04:37   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class ShiftServiceImpl implements IShiftService {

	private IShiftDao shiftDao;
	
	/**(�� Javadoc)
	 * <p>Title: saveShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#saveShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void saveShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.saveShift(shift);
	}

	/**(�� Javadoc)
	 * <p>Title: updateShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#updateShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void updateShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.updateShift(shift);
	}

	/**(�� Javadoc)
	 * <p>Title: delShift</p>
	 * <p>Description(����): </p>
	 * @param shift
	 * @see cn.bdqn.HomeSys.service.IShiftService#delShift(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public void delShift(Shift shift) {
		// TODO Auto-generated method stub
		shiftDao.delShift(shift);
	}

	/**(�� Javadoc)
	 * <p>Title: getShiftById</p>
	 * <p>Description(����): </p>
	 * @param shiftid
	 * @return
	 * @see cn.bdqn.HomeSys.service.IShiftService#getShiftById(cn.bdqn.HomeSys.entity.Shift)
	 */

	@Override
	public Shift getShiftById(Integer shiftid) {
		// TODO Auto-generated method stub
		return shiftDao.getShiftById(shiftid);
	}

	/**(�� Javadoc)
	 * <p>Title: getShiftsList</p>
	 * <p>Description(����): </p>
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
