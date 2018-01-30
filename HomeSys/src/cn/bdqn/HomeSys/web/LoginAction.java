package cn.bdqn.HomeSys.web;

import java.util.Map;

import cn.bdqn.HomeSys.entity.Staff;
import cn.bdqn.HomeSys.service.IShiftService;
import cn.bdqn.HomeSys.service.IStaffService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
*    
* 项目名称：HomeSys   
* 类名称：LoginAction   
* 类描述：   登录Action
* 创建人：武保谦
* 创建时间：2017-7-25 下午12:01:24   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-7-25 下午12:01:24   
* 修改备注：   
* @version    
*
 */
public class LoginAction extends ActionSupport {
	Staff staff;										//员工实体类
	IStaffService staffService ;						//员工业务类接口
	String msg;											//提示信息
	
	/**
	 * 
	* @Title: Login
	* @Description: 该方法的主要作用：登录
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String Login() {
	    Staff newStaff  = staffService.getStaffByName(staff.getStaffName());
	    if(!newStaff.getStaffName().equals(staff.getStaffName())){
	    	msg = "用户名错误";
	    	return INPUT;
	    }
	    if(!newStaff.getPwd().equals(staff.getPwd())){
	    	msg = "密码错误";
	    	return INPUT;
	    }
	    Map session = ActionContext.getContext().getSession();
	    session.put("user",newStaff);//用户信息保存在Session里面
		return SUCCESS;
	}

	
	/**
	 * 
	* @Title: exit
	* @Description: 该方法的主要作用：退出，清空Session
	* @param  @return 设定文件  
	* @return  返回类型：String   
	* @throws
	 */
	public String exit()
	{
		//清空session 
		ActionContext.getContext().getSession().clear();	
		return SUCCESS;
	}
	
	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public IStaffService getStaffService() {
		return staffService;
	}


	public void setStaffService(IStaffService staffService) {
		this.staffService = staffService;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
