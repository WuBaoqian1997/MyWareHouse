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
* ��Ŀ���ƣ�HomeSys   
* �����ƣ�LoginAction   
* ��������   ��¼Action
* �����ˣ��䱣ǫ
* ����ʱ�䣺2017-7-25 ����12:01:24   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-7-25 ����12:01:24   
* �޸ı�ע��   
* @version    
*
 */
public class LoginAction extends ActionSupport {
	Staff staff;										//Ա��ʵ����
	IStaffService staffService ;						//Ա��ҵ����ӿ�
	String msg;											//��ʾ��Ϣ
	
	/**
	 * 
	* @Title: Login
	* @Description: �÷�������Ҫ���ã���¼
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String Login() {
	    Staff newStaff  = staffService.getStaffByName(staff.getStaffName());
	    if(!newStaff.getStaffName().equals(staff.getStaffName())){
	    	msg = "�û�������";
	    	return INPUT;
	    }
	    if(!newStaff.getPwd().equals(staff.getPwd())){
	    	msg = "�������";
	    	return INPUT;
	    }
	    Map session = ActionContext.getContext().getSession();
	    session.put("user",newStaff);//�û���Ϣ������Session����
		return SUCCESS;
	}

	
	/**
	 * 
	* @Title: exit
	* @Description: �÷�������Ҫ���ã��˳������Session
	* @param  @return �趨�ļ�  
	* @return  �������ͣ�String   
	* @throws
	 */
	public String exit()
	{
		//���session 
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
