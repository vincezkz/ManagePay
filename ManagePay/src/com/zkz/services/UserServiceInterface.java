package com.zkz.services;

import java.util.List;

import com.zkz.model.User;

public interface UserServiceInterface {
	public List<User> GetUsers();

	public com.Enum VerifyUser(User user);
	
	public User GetOneUser(User user);
}
