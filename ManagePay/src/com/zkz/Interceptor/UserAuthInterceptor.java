package com.zkz.Interceptor;

import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionInvocation; 
import com.opensymphony.xwork2.interceptor.Interceptor; 
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zkz.model.User;

public class UserAuthInterceptor implements Interceptor{
	@Override  
    public void destroy() {  
        // TODO Auto-generated method stub  
        System.out.println("----destroy()----");  
    }  
  
    @Override  
    public void init() {  
        // TODO Auto-generated method stub  
        System.out.println("-----Init()-------");  
    }  
    @Override 
    public  String intercept(ActionInvocation invocation) throws Exception {  
         
    	Object user=ServletActionContext.getRequest().getSession().getAttribute("userbean");
         
        if(user!=null)
        {
        	System.out.print("user session is null");
        	return invocation.invoke();
        }
        else
        {
        	System.out.print("user session is not null ,redirect login page");
        	return Action.LOGIN;
        }
    }

	 
}
