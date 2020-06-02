package com.labs.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labs.springsecurity.entity.User;
import com.labs.springsecurity.repository.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/user")
	public List<User> getAll(){
		return repository.findAll();
	}
	
}
