package com.revature.service;

import com.revature.dao.SystemDAO;
import com.revature.dao.UserDAO;
import com.revature.pojo.Customer;
import com.revature.pojo.User;
import com.revature.pojo.UserPolicy;

public class UserLoginService {

	public void registerCustomer(String username, String password) {
		Customer newUser = new Customer();
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setUserPolicy(UserPolicy.CUSTOMER);
		UserDAO.addCustomer(username, newUser);
	}

	public void registerEmployee(String username, String password, String systemPassword) {
		if (systemPassword.contains(SystemDAO.getSystemPassword())) {
			Employee newUser = new Employee();
			newUser.setUsername(username);
			newUser.setPassword(password);
			newUser.setUserPolicy(UserPolicy.EMPLOYEE);
			UserDAO.addEmployee(username, newUser);
		}
	}

}
