package com.example.java.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.java.model.User;

public interface Repository extends CrudRepository<User, Integer> {

	
	public User findByUserNameAndPassword(String userName,String password);
	
}
