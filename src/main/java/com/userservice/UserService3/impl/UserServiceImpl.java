package com.userservice.UserService3.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.lcwd.user.service.services.impl.UserServiceImpl;

import com.userservice.UserService3.exceptions.ResourceNotFoundException;
import com.userservice.UserService3.repositories.UserRepository;
import com.userservice.UserService3.entities.User;
import com.userservice.UserService3.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User saveUser(User user) {
		//generate unique user id
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}

	@Override
	public User getUser(String userId) {
	
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server: "+userId));
		
	}

}

