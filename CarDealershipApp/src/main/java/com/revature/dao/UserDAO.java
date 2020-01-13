package com.revature.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;

public class UserDAO {
	// Each customer balance is kept in this data object
	public void createEmployeeDB(HashMap<String, Employee> employees) {
		try (FileOutputStream fos = new FileOutputStream("UserBase.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(employees);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, Employee> readEmployees() {
		HashMap<String, Employee> employees = null;
		try (FileInputStream fis = new FileInputStream("UserBase.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			employees = (HashMap<String, Employee>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public void createCustomerDB(HashMap<String, Employee> customers) {
		try (FileOutputStream fos = new FileOutputStream("UserBase.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(customers);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, Customer> readCustomer() {
		HashMap<String, Customer> customers = null;
		try (FileInputStream fis = new FileInputStream("UserBase.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			customers = (HashMap<String, Customer>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return customers;
	}
}
