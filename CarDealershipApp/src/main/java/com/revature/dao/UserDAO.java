package com.revature.dao;

import java.util.HashMap;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;

public class UserDAO {
	private static HashMap<String, Customer> customers = new HashMap<String, Customer>();
	private static HashMap<String, Employee> employee = new HashMap<String, Employee>();

	public static HashMap<String, Customer> getCustomers() {
		return customers;
	}

	public static void addCustomer(String username, Customer newUser) {
		UserDAO.customers.put(username, newUser);
	}

	public static HashMap<String, Employee> getEmployee() {
		return employee;
	}


	public static void addEmployee(String username, Employee newUser) {
		UserDAO.employee.put(username, newUser);
		
	}

}
