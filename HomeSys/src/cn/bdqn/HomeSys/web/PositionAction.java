package cn.bdqn.HomeSys.web;
import java.util.List;

import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.service.IPositionService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * ��Ŀ���ƣ�HomeSys   
 * �����ƣ�PositionAction   
 * ��������   
 * �����ˣ�������
 * ����ʱ�䣺2017-7-25 ����10:06:23   
 * �޸��ˣ�������
 * �޸�ʱ�䣺2017-7-25 ����10:06:23   
 * �޸ı�ע��   
 * @version
 */
public class PositionAction extends ActionSupport {
	private IPositionService positionService;							// ¥���ҵ���߼���
	private List<Position> pList;										// ����¥����Ϣ�ļ���
	private Position position;											// ¥���ʵ����
	private int number = 0;												// Ҫ��ʾ�ڼ�ҳ
	private int total = 0; 												// ��ҳ��
	private int prev = 0; 												// ��һҳ
	private int next = 0; 												// ��һҳ
	private static final int pageSize = 6; 								// ÿҳ��ʾ6������
	private int id;
	
	/**
	 * 
	 * @Title: queryAllPosition
	 * @Description: �÷�������Ҫ���ã���ҳ��ѯȫ����¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String queryAllPosition(){
		ActionContext ac = ActionContext.getContext();
		// ������ҳ
		if(number == 0)
			number = 1;
		int start = 0;				// �ӵڼ�����ʼ
		int end = 0;				// �ӵڼ�������
		start = (number - 1) * pageSize;
		end = number * pageSize;
		pList = positionService.queryPosition(start, pageSize);	// ��ȡȫ������
		ac.put("pList",pList);
		int count = positionService.getPositionCount();			// ��ȡ�ܼ�¼��
		total = (count - (count % pageSize))/pageSize; 			// ������ҳ��
		if(count % pageSize != 0){
			total++;
		}
		// ����õ���һҳ����һҳ
		if(number <= 1){
			prev = 1;
			next = number + 1;
		}else if(number >= total){
			prev = number - 1;
			next = total;
		}else{
			prev = number - 1;
			next = number + 1;
		}
		return SUCCESS;
	}
	/**
	 * 
	 * @Title: savePosition
	 * @Description: �÷�������Ҫ���ã�����¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String savePosition(){
		position.setPositionId(((Long)System.currentTimeMillis()).intValue());
		positionService.savePosition(position);
		return "AddSuccess";
	}
	/**
	 * 
	 * @Title: delPosition
	 * @Description: �÷�������Ҫ���ã�ɾ��¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String delPosition(){
		Position position2 = positionService.queryPositionById(id);
		positionService.delPosition(position2);
		return "DelSuccess";
	}

	public IPositionService getPositionService() {
		return positionService;
	}

	public void setPositionService(IPositionService positionService) {
		this.positionService = positionService;
	}

	public List<Position> getpList() {
		return pList;
	}

	public void setpList(List<Position> pList) {
		this.pList = pList;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public static int getPagesize() {
		return pageSize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
