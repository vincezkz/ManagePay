package com.zkz.services;

import java.util.List;

import com.zkz.dao.*;
import com.zkz.model.User;
import com.Enum;
import com.sun.org.apache.bcel.internal.generic.DALOAD;
public class UserService implements UserServiceInterface{
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public List<User> GetUsers()
	{
		return dao.FindALL();
	}
	
	public com.Enum VerifyUser(User user)
	{
		 Boolean result=false;
		 String username=user.getUsername();
		
		 if(((UserDao)dao).UserIsExist(user)==false)
		 {
			 return Enum.USERISNOEXIST;
		 }
		 else if(((UserDao)dao).VerfiyPassword(user)==false)
		 {
			 return Enum.PASSWORDISWRONG;
		 }
		 else
		 {
			 return Enum.VERFIYSUCCESS;
		 }
	}
	
	public User GetOneUser(User user)
	{
		return ((UserDao)dao).GetOneUser(user);
	}
	
}
