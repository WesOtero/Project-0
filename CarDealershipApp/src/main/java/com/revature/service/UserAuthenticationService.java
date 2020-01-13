package com.revature.service;

import com.revature.pojo.UserDB;

public class UserAuthenticationService {

	// Customer Login
	public boolean authenticateCustomer(String username, String password) {
		if (UserDB.getCustomers().containsKey(username) && UserDB.getCustomer(username).getPassword().equals(password)) {
			System.out.println("You're now Logged in");
			// TODO: Log success
			return true;

		} else if (!UserDB.getCustomers().containsKey(username)) {
			// TODO: Login User not found
			System.out.println("User does not exisits");
			return false;
		} else {
			System.out.println("Failed to login");
			// TODO: Log login failure
			return false;
		}
	}

	// Employee Login
	public boolean authenticateEmployee(String username, String password) {
		if (UserDB.getEmployees().containsKey(username) && UserDB.getEmployee(username).getPassword().equals(password)) {
			System.out.println("You're now Logged in");
			// TODO: Log success
			return true;
		} else {
			System.out.println("Failed to login");
			// TODO: Log login failure
			return false;
		}
	}
}
