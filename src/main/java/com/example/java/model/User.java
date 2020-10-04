package com.example.java.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Users")
public class User {
	
	
	private ObjectId id;
	
	private String name;
	
	private String userName;
	
	private String userType;
	
	private String password;

	


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", userType=" + userType + ", password="
				+ password + "]";
	}

	public User(ObjectId id, String name, String userName, String userType, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.userType = userType;
		this.password = password;
	}

	
}
