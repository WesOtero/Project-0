package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.User;
import com.revature.pojo.UserPolicy;

public class UserLoginService {
	private static List<User> users = new ArrayList<User>();
	private String systemPassword = "root";

	public void registerUser(String username, String password, UserPolicy userPolicy, String systemPassword) {
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setPassword(password);
		
		if (userPolicy == UserPolicy.CUSTOMER) {
			newUser.setUserPolicy(UserPolicy.CUSTOMER);
			users.add(newUser);
		} 
		else if (userPolicy == UserPolicy.EMPLOYEE && systemPassword == this.systemPassword) {
			newUser.setUserPolicy(UserPolicy.EMPLOYEE);
			users.add(newUser);
		}
		else {
			System.out.println("Could not create user, if error persists contact your administrator.");
			//TODO:Log system error
		}

	}

}
