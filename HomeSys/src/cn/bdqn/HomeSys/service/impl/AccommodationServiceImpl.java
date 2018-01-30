 /**  
* @Title: AccommodationServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 ����12:24:46
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IAccommodationDao;
import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.service.IAccommodationService;

 /**   
 *    
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�AccommodationServiceImpl   
 * ��������   ס������ҵ���߼���ʵ����
 * �����ˣ�Mu Xiongxiong  
 * ����ʱ�䣺2017-7-24 ����12:24:46   
 * �޸��ˣ�Mu Xiongxiong   
 * �޸�ʱ�䣺2017-7-24 ����12:24:46   
 * �޸ı�ע��   
 * @version    
 *    
 */
public class AccommodationServiceImpl implements IAccommodationService {

	/**(�� Javadoc)
	 * <p>Title: saveAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#saveAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	IAccommodationDao accommodationDao = null;
	
	@Override
	public void saveAccommodation(Accommodation accommodation) {
		accommodationDao.saveAccommodation(accommodation);
	}

	/**(�� Javadoc)
	 * <p>Title: updateAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#updateAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void updateAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		accommodationDao.updateAccommodation(accommodation);
	}

	/**(�� Javadoc)
	 * <p>Title: delAccommodation</p>
	 * <p>Description(����): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#delAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void delAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		accommodationDao.delAccommodation(accommodation);
	}

	/**(�� Javadoc)
	 * <p>Title: getAccommodationById</p>
	 * <p>Description(����): </p>
	 * @param accommodationId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#getAccommodationById(java.lang.Integer)
	 */

	@Override
	public Accommodation getAccommodationById(Integer accommodationId) {
		// TODO Auto-generated method stub
		return accommodationDao.getAccommodationById(accommodationId);
	}

	/**(�� Javadoc)
	 * <p>Title: getAccommodationList</p>
	 * <p>Description(����): </p>
	 * @return
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#getAccommodationList()
	 */

	@Override
	public List<Accommodation> getAccommodationList() {
		// TODO Auto-generated method stub
		return accommodationDao.getAccommodationList();
	}

	
	
	
	public IAccommodationDao getAccommodationDao() {
		return accommodationDao;
	}

	public void setAccommodationDao(IAccommodationDao accommodationDao) {
		this.accommodationDao = accommodationDao;
	}

}
