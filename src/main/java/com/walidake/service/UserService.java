package com.walidake.service;

import java.util.List;

import com.walidake.model.User;

public interface UserService {

	//增加用户
	public void addUser(User user);
	
	//查找所有用户
	public List<User> findUser();
	
}
