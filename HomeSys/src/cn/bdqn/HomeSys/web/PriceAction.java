package cn.bdqn.HomeSys.web;

import java.util.List;

import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.service.IPriceService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PriceAction extends ActionSupport {
	private IPriceService PriceService;							// ¥���ҵ���߼���
	private List<Price> priceList;										// ����¥����Ϣ�ļ���
	private Price price;											// ¥���ʵ����
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
	public String queryAllPrice(){
		ActionContext ac = ActionContext.getContext();
		// ������ҳ
		if(number == 0)
			number = 1;
		int start = 0;				// �ӵڼ�����ʼ
		int end = 0;				// �ӵڼ�������
		start = (number - 1) * pageSize;
		end = number * pageSize;
			
		priceList = PriceService.queryPrice(start, pageSize);		// ��ȡȫ������
		ac.put("priceList",priceList);
		int count = PriceService.getPositionCount();			// ��ȡ�ܼ�¼��
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
	 * @Title: delPosition
	 * @Description: �÷�������Ҫ���ã�ɾ��¥����Ϣ
	 * @param  @return �趨�ļ�  
	 * @return  �������ͣ�String   
	 * @throws
	 */
	public String delPrice(){
		Price price = PriceService.queryPriceById(id);
		PriceService.delPrice(price);
		return "DelSuccess";
	}
	
	//get set ����

	public IPriceService getPriceService() {
		return PriceService;
	}

	public void setPriceService(IPriceService priceService) {
		PriceService = priceService;
	}





	public List<Price> getPriceList() {
		return priceList;
	}




	public void setPriceList(List<Price> priceList) {
		this.priceList = priceList;
	}




	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		price = price;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getPagesize() {
		return pageSize;
	}
	
}
