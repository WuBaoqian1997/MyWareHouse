package cn.bdqn.HomeSys.dao;

import java.util.List;

import cn.bdqn.HomeSys.entity.Position;

/**
 * 
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�IPositionDao   
 * ��������   
 * �����ˣ������� 
 * ����ʱ�䣺2017-7-24 ����9:54:25   
 * �޸��ˣ�������  
 * �޸�ʱ�䣺2017-7-24 ����9:54:25   
 * �޸ı�ע��   
 * @version
 */
public interface IPositionDao {
	/**
	 * 
	 * @Title: savePosition
	 * @Description: �÷�������Ҫ���ã�����λ����Ϣ
	 * @param  @param position �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void savePosition(Position position);
	/**
	 * 
	 * @Title: delPosition
	 * @Description: �÷�������Ҫ���ã�ɾ��λ����Ϣ
	 * @param  @param position �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void delPosition(Position position);
	/**
	 * 
	 * @Title: updatePosition
	 * @Description: �÷�������Ҫ���ã�����λ����Ϣ
	 * @param  @param position �趨�ļ�  
	 * @return  �������ͣ�void   
	 * @throws
	 */
	void updatePosition(Position position);
	/**
	 * 
	 * @Title: queryPosition
	 * @Description: �÷�������Ҫ���ã���ѯȫ��λ����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�List<Position>   
	 * @throws
	 */
	List<Position> queryPosition();
	/**
	 * 
	 * @Title: queryPositionById
	 * @Description: �÷�������Ҫ���ã�ͨ��id��ѯλ����Ϣ
	 * @param  @param positionId
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�Position   
	 * @throws
	 */
	Position queryPositionById(Integer positionId);
	
	/**
	 * 
	 * @Title: queryPosition
	 * @Description: �÷�������Ҫ���ã���ѯȫ��λ����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�List<Position>   
	 * @throws
	 */
	List<Position> queryPosition(int first, int size);
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: �÷�������Ҫ���ã���ѯ¥����ܼ�¼��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	int getPositionCount();
	
	/**
	 * 
	 * @Title: getPositionCount
	 * @Description: �÷�������Ҫ���ã���ѯȫ��¥��
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�int   
	 * @throws
	 */
	List<Position>  queryAllPosition();
}
