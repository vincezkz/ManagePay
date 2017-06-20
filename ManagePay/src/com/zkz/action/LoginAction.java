package com.zkz.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zkz.model.Payment;
import com.zkz.model.User;
import com.zkz.services.PayServiceInterface;
import com.zkz.services.UserServiceInterface;
import com.zkz.vo.PaymentValue;
import com.zkz.vo.UserValue;

import java.util.Map;

import com.Enum;
public class LoginAction  extends ActionSupport{
	private UserServiceInterface service;
	private UserValue user;
	
	public void setUser(UserValue user)
	{
		this.user=user;
	}
	public UserValue getUser()
	{
		return user;
	}
	public void setService(UserServiceInterface service) {
		this.service = service;
	}
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String login() throws Exception {
		try {
			UserValue entity=getUser();
			User user=new User();
			user.setPassword(entity.getPassword());
			user.setUsername(entity.getUsername());
			Enum result= service.VerifyUser(user);
			if (result == Enum.USERISNOEXIST) {
				addFieldError("user.username", "username is noexist.");
				return INPUT;
			} else if(result==Enum.PASSWORDISWRONG) {
				addFieldError("user.password", "password is wrong.");
				return INPUT;
			}
			else
			{
				User a=service.GetOneUser(user);
				Map<String ,Object> map=ActionContext.getContext().getSession();
				map.put("userBean", a);
				return SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public void validateLogin() {
		if (user.getUsername() == "") {
			addFieldError("user.username", "username is required.");
		} else if (user.getPassword()=="") {
			addFieldError("user.password", "password is required.");
		}  
	}
}
