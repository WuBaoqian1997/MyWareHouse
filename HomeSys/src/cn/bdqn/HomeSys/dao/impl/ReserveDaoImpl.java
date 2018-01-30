package cn.bdqn.HomeSys.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.HomeSys.dao.IReserveDao;
import cn.bdqn.HomeSys.entity.Reserve;

public class ReserveDaoImpl extends HibernateDaoSupport  implements IReserveDao {

	@Override
	public void saveReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(reserve);
	}

}
