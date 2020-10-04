package com.example.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.java.Service.UserService;
import com.example.java.model.User;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String saveUser(User user) {
	
		//service.saveUser(user);
		
		return "home";
		
	}
	
	
	
	@RequestMapping("/userlogin")
	public String userLogin(@RequestParam("email") String email,@RequestParam("password") String password) {

		
		
	User user = service.loginUser(email, password);
	System.out.println(user.getUserType());
	
		
	if(user != null) {
		
		if(user.getUserType().equals("Admin") )
		{
			System.out.println("//////");
			return "adminHome";
		}
		else {
			
			System.out.println("?????????");
			return "empHome";
		}
		
		
	}
	else {
		
		return null;
		
		
	}
		
	
		
			
			
		}
	
	
	
}
