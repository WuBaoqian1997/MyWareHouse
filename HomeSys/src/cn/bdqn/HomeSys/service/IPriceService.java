package cn.bdqn.HomeSys.service;

import java.util.List;

import cn.bdqn.HomeSys.entity.Price;
/**
 * 
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IPriceService   
 * ���������۸���Ϣ��ҵ���߼���
 * �����ˣ������� 
 * ����ʱ�䣺2017-7-24 ����10:19:23   
 * �޸��ˣ�������   
 * �޸�ʱ�䣺2017-7-24 ����10:19:23   
 * �޸ı�ע��   
 * @version
 */
public interface IPriceService {
	/**
	 * 
	 * @Title: savePrice
	 * @Description: �÷�������Ҫ���ã�����۸���Ϣ
	 * @param  @param price �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void savePrice(Price price);
	/**
	 * 
	 * @Title: delPrice
	 * @Description: �÷�������Ҫ���ã�ɾ���۸���Ϣ
	 * @param  @param price �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void delPrice(Price price);
	/**
	 * 
	 * @Title: updatePrice
	 * @Description: �÷�������Ҫ���ã����¼۸���Ϣ
	 * @param  @param price �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void updatePrice(Price price);
	/**
	 * 
	 * @Title: queryPrice
	 * @Description: �÷�������Ҫ���ã���ѯ���м۸���Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�List<Price>   
	 * @throws
	 */
	List<Price> queryPrice();
	/**
	 * 
	 * @Title: queryPriceById
	 * @Description: �÷�������Ҫ���ã�ͨ��priceid��ѯ�۸���Ϣ
	 * @param  @param priceId
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�Price   
	 * @throws
	 */
	Price queryPriceById(Integer priceId);
	
	List<Price> queryPrice(int first, int size);
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: �÷�������Ҫ���ã���ѯ¥����ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws int first, int size
	 */
	int getPositionCount();
}
