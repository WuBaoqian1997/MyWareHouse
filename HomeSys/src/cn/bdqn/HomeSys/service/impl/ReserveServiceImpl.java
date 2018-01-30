package cn.bdqn.HomeSys.service.impl;

import cn.bdqn.HomeSys.dao.IReserveDao;
import cn.bdqn.HomeSys.entity.Reserve;
import cn.bdqn.HomeSys.service.IReserveService;

public class ReserveServiceImpl implements IReserveService {
	
	IReserveDao reserveDao;
	
	@Override
	public void saveReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		reserveDao.saveReserve(reserve);
	}

	public IReserveDao getReserveDao() {
		return reserveDao;
	}

	public void setReserveDao(IReserveDao reserveDao) {
		this.reserveDao = reserveDao;
	}

}
