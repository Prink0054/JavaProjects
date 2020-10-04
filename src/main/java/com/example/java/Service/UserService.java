package com.example.java.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.Repository.Repository;
import com.example.java.model.User;

@Service
public class UserService {

	@Autowired
	Repository repository;

	public void saveUser(User user) {

		User user1 = new User();

		System.out.println("////////////////////1");
		user1.setName("rahul");
		user1.setUserName("turna.prink@gmail.com");
		user1.setUserType("Employee");
		user1.setPassword("welcome");

		repository.save(user1);
		System.out.println("////////////////////2");

	}

	public User loginUser(String username, String password) {

		User user1 = repository.findByUserNameAndPassword(username, password);

		//user1.getUserType() == "Admin"
		
		
		
		if (user1 != null ) {
			//thishmjjjhjm
			return user1;
		}

		return null;

	}

}
