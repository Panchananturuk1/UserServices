package com.userservice.UserService3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.UserService3.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

	//custom method or query
	//write
	
}