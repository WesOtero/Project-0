package com.revature.service;

import com.revature.dao.UserDAO;
import com.revature.pojo.Car;
import com.revature.pojo.Customer;

public class CustomerPaymentService {
	public void viewCarsAndPaymentInfo(String customer) {
		Customer user = UserDAO.getCustomer(customer);
		System.out.println("Vehicles Owned:");
		for (Car car : user.getCarsOwned()) {
			System.out.println("|-Vehicle: " + car.getYear() + ", " + car.getMake() + ", " + car.getModel() + ": \n" + "|-Original Price: " + car.getPrice() +"\n");
		}
	}
}
