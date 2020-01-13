package com.revature.service;

import com.revature.pojo.UserDB;

public class UserRemovalService {
	UserAuthenticationService userAuthService = new UserAuthenticationService();

	public void removeUser(String username, String password, String customer) {
		if (userAuthService.authenticateEmployee(username, password)) {
			UserDB.getCustomers().remove(customer);
			// TODO: Log user deletion
			System.out.println("User Deleted");
		}

	}
}
