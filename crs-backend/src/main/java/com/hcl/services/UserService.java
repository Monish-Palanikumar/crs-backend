package com.hcl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.User;
import com.hcl.repos.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User getUser(String uname, String pwd) {
		return userRepository.getUser(uname, pwd);
	}

	public User getUsername(String uname) {
		return userRepository.getUsername(uname);
	}
}
