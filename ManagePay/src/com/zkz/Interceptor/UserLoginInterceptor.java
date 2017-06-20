package com.zkz.Interceptor;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionInvocation; 
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zkz.model.User;

public class UserLoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		//Object user=ServletActionContext.getRequest().getSession().getAttribute("userBean");
		Map<String ,Object> map=ActionContext.getContext().getSession();
		Object user=map.get("userBean");
        if(user!=null)
        {
        	System.out.print("user session is not null");
        	return invocation.invoke();
        }
        else
        {
        	System.out.print("user session is  null ,redirect login page");
        	return Action.LOGIN;
        }
	}

}
