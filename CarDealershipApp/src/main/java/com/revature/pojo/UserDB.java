package com.revature.pojo;

import java.io.Serializable;
import java.util.HashMap;

import com.revature.dao.UserDAO;

public class UserDB {
	private static HashMap<String, Customer> customers = new HashMap<>();
	private static HashMap<String, Employee> employees = new HashMap<>();
	
//	@Override
//	public void saveData(HashMap<String> m) {
//		
//		String filename;
//		
//		if (m.getCaption() != null) {
//			filename = m.getCaption() + ".dat";
//		} else {
//			filename = "mysteryMap.dat";
//		}
//		
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		
//		try {
//			fos = new FileOutputStream(filename);
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(m);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (oos != null) {
//				try {
//					oos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if (fos != null) {
//				try {
//					fos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	}
	
	//Customer methods
	public static HashMap<String, Customer> getCustomers() {
		return customers;
	}
	
	public static Customer getCustomer(String username) {
		return customers.get(username);
	}

	public static void addCustomer(String username, Customer newUser) {
		UserDB.customers.put(username, newUser);
	}

	//Employee Methods
	public static HashMap<String, Employee> getEmployees() {
		return employees;
	}
	
	public static Employee getEmployee(String username) {
		return employees.get(username);
	}


	public static void addEmployee(String username, Employee newUser) {
		UserDAO userDAO = new UserDAO();
		UserDB.employees.put(username, newUser);
		userDAO.createEmployeeDB(employees);
		
	}

	public static void setCustomers(HashMap<String, Customer> customers) {
		UserDB.customers = customers;
	}

	public static void setEmployees(HashMap<String, Employee> employees) {
		UserDB.employees = employees;
	}
	
	

}
