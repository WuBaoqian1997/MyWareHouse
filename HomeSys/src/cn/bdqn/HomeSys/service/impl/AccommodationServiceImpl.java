 /**  
* @Title: AccommodationServiceImpl.java
* @Package cn.bdqn.HomeSys.service.impl
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-7-24 下午12:24:46
* @version V1.0  
*/
package cn.bdqn.HomeSys.service.impl;

import java.util.List;

import cn.bdqn.HomeSys.dao.IAccommodationDao;
import cn.bdqn.HomeSys.entity.Accommodation;
import cn.bdqn.HomeSys.service.IAccommodationService;

 /**   
 *    
 * 项目名称：HomeSys   
 * 类名称：AccommodationServiceImpl   
 * 类描述：   住宿类型业务逻辑层实现类
 * 创建人：Mu Xiongxiong  
 * 创建时间：2017-7-24 下午12:24:46   
 * 修改人：Mu Xiongxiong   
 * 修改时间：2017-7-24 下午12:24:46   
 * 修改备注：   
 * @version    
 *    
 */
public class AccommodationServiceImpl implements IAccommodationService {

	/**(非 Javadoc)
	 * <p>Title: saveAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#saveAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	IAccommodationDao accommodationDao = null;
	
	@Override
	public void saveAccommodation(Accommodation accommodation) {
		accommodationDao.saveAccommodation(accommodation);
	}

	/**(非 Javadoc)
	 * <p>Title: updateAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#updateAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void updateAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		accommodationDao.updateAccommodation(accommodation);
	}

	/**(非 Javadoc)
	 * <p>Title: delAccommodation</p>
	 * <p>Description(描述): </p>
	 * @param accommodation
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#delAccommodation(cn.bdqn.HomeSys.entity.Accommodation)
	 */

	@Override
	public void delAccommodation(Accommodation accommodation) {
		// TODO Auto-generated method stub
		accommodationDao.delAccommodation(accommodation);
	}

	/**(非 Javadoc)
	 * <p>Title: getAccommodationById</p>
	 * <p>Description(描述): </p>
	 * @param accommodationId
	 * @return
	 * @see cn.bdqn.HomeSys.service.IAccommodationService#getAccommodationById(java.lang.Integer)
	 */

	@Override
	public Accommodation getAccommodationById(Integer accommodationId) {
		// TODO Auto-generated method stub
		return accommodationDao.getAccommodationById(accommodationId);
	}

	/**(非 Javadoc)
	 * <p>Title: getAccommodationList</p>
	 * <p>Description(描述): </p>
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
