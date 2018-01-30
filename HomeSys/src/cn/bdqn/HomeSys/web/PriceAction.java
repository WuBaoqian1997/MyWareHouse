package cn.bdqn.HomeSys.web;

import java.util.List;

import cn.bdqn.HomeSys.entity.Position;
import cn.bdqn.HomeSys.entity.Price;
import cn.bdqn.HomeSys.service.IPriceService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PriceAction extends ActionSupport {
	private IPriceService PriceService;							// 楼层的业务逻辑层
	private List<Price> priceList;										// 包含楼层信息的集合
	private Price price;											// 楼层的实体类
	private int number = 0;												// 要显示第几页
	private int total = 0; 												// 总页数
	private int prev = 0; 												// 上一页
	private int next = 0; 												// 下一页
	private static final int pageSize = 6; 								// 每页显示6条数据
	private int id;
	
	/**
	 * 
	 * @Title: queryAllPosition
	 * @Description: 该方法的主要作用：分页查询全部的楼层信息
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String queryAllPrice(){
		ActionContext ac = ActionContext.getContext();
		// 计算首页
		if(number == 0)
			number = 1;
		int start = 0;				// 从第几条开始
		int end = 0;				// 从第几条结束
		start = (number - 1) * pageSize;
		end = number * pageSize;
			
		priceList = PriceService.queryPrice(start, pageSize);		// 获取全部数据
		ac.put("priceList",priceList);
		int count = PriceService.getPositionCount();			// 获取总记录数
		total = (count - (count % pageSize))/pageSize; 			// 计算总页数
		if(count % pageSize != 0){
			total++;
		}
		// 计算得到上一页和下一页
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
	 * @Description: 该方法的主要作用：删除楼层信息
	 * @param  @return 设定文件  
	 * @return  返回类型：String   
	 * @throws
	 */
	public String delPrice(){
		Price price = PriceService.queryPriceById(id);
		PriceService.delPrice(price);
		return "DelSuccess";
	}
	
	//get set 方法

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
