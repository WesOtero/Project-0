package com.revature.dao;

import java.util.HashMap;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;

public class UserDAO {
	private static HashMap<String, Customer> customers = new HashMap<String, Customer>();
	private static HashMap<String, Employee> employees = new HashMap<String, Employee>();
	
	//Customer methods
	public static HashMap<String, Customer> getCustomers() {
		return customers;
	}
	
	public static Customer getCustomer(String username) {
		return customers.get(username);
	}

	public static void addCustomer(String username, Customer newUser) {
		UserDAO.customers.put(username, newUser);
	}

	//Employee Methods
	public static HashMap<String, Employee> getEmployees() {
		return employees;
	}
	
	public static Employee getEmployee(String username) {
		return employees.get(username);
	}


	public static void addEmployee(String username, Employee newUser) {
		UserDAO.employees.put(username, newUser);
		
	}

}
