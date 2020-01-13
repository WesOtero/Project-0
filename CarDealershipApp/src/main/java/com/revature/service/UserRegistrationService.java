package com.revature.service;

import com.revature.dao.SystemDAO;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;
import com.revature.pojo.UserDB;
import com.revature.pojo.UserPolicy;

public class UserRegistrationService {
	public void registerCustomer(String username, String password) {
		if (UserDB.getCustomers().containsKey(username)) {
			System.out.println("User " + username + " is already in the database. Try another username.");
		} else {
			Customer newUser = new Customer();
			newUser.setUsername(username);
			newUser.setPassword(password);
			newUser.setUserPolicy(UserPolicy.CUSTOMER);
			UserDB.addCustomer(username, newUser);
			// TODO: Log user transactions
			System.out.println("Created");
		}
	}

	public void registerEmployee(String username, String password, String systemPassword) {
		if(UserDB.getEmployees().containsKey(username)) {
			System.out.println("User " + username + " is already in the database. Try another username.");
		}
		else if (systemPassword.contains(SystemDAO.getSystemPassword())) {
			Employee newUser = new Employee();
			newUser.setUsername(username);
			newUser.setPassword(password);
			newUser.setUserPolicy(UserPolicy.EMPLOYEE);
			UserDB.addEmployee(username, newUser);
			// TODO: Log user transactions
			System.out.println("Created");
		}
	}
}
