package com.revature.service;

import com.revature.dao.UserDAO;

public class UserRemovalService {
	UserAuthenticationService userAuthService =  new UserAuthenticationService();
	
	public void removeUser(String username, String password, String customer) {
		if(userAuthService.authenticateEmployee(username, password)) {
			UserDAO.getCustomers().remove(customer);
			//TODO: Log user deletion
			System.out.println("User Deleted");
		}
			
	}
}
