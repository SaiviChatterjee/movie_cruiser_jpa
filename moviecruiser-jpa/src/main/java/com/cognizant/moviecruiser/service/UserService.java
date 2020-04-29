package com.cognizant.moviecruiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.User;
import com.cognizant.moviecruiser.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
}
