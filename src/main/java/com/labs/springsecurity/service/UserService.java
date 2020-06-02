package com.labs.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.labs.springsecurity.entity.User;
import com.labs.springsecurity.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface, UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		return userRepository.findByLogin(login);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
