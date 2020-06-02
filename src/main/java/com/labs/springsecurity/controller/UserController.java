package com.labs.springsecurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labs.springsecurity.entity.User;
import com.labs.springsecurity.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	
	private UserService repository;
	
	@GetMapping("/user")
	public List<User> getAll(){
		return repository.findAll();
	}
	
}
