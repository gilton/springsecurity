package com.labs.springsecurity.service;

import java.util.List;

import com.labs.springsecurity.entity.User;

public interface UserServiceInterface {
	
	List<User> findAll();
	
}
