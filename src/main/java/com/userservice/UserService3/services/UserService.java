package com.userservice.UserService3.services;

import java.util.List;

import com.userservice.UserService3.entities.User;

public interface UserService {
	
	//user operations
	
	
	//Create
	User saveUser(User user);
	
	//get all users
	List<User> getAllUsers();
	
	//get user by ID
	User getUser(String userId);
	

} 
