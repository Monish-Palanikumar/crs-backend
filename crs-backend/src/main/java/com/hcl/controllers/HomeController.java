package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.User;
import com.hcl.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	public String printSample() {
		return "Welcome to CRS";
	}

	@PostMapping("/login")
	public Integer getUser(@RequestBody User user) {
		String uname = user.getUname();
		String pwd = user.getPwd();
		User resultSet = userService.getUser(uname, pwd);
		if (resultSet == null) {
			return 0;
		} else {
			return resultSet.getRole();
		}
//		0->error, 1->owner, 2->customer
	}
}
