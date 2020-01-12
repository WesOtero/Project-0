package com.revature.service;

import com.revature.dao.UserDAO;

public class UserAuthenticationService {

	// Customer Login
	public boolean authenticateCustomer(String username, String password) {
		if (UserDAO.getCustomers().containsKey(username) && UserDAO.getCustomer(username).getPassword() == password) {
			System.out.println("You're now Logged in");
			//TODO: Log success
			return true;

		}
		// TODO: Log login failure
		return false;
	}

	// Employee Login
	public boolean authenticateEmployee(String username, String password) {
		if (UserDAO.getEmployees().containsKey(username) && UserDAO.getEmployee(username).getPassword() == password) {
			System.out.println("You're now Logged in");
			// TODO: Log success
			return true;
		}
		// TODO: Log login failure
		return false;
	}
}
