package com.revature.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Map;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;
import com.revature.pojo.Car;
import com.revature.pojo.Customer;

public class CustomerPaymentService {

	public void removeDropOffers(String carVin, String employee, String password) {
		// Grabs the offer on a car that is in the lot and deletes the customer entry
//		LotDAO.getLot().get(carVin).getOffers().re;
//		 LotDAO.getLot();
//		Iterator iterator = LotDAO.getLot().get(carVin).getOffers().entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Double> pair = (Map.Entry<String, Double>) iterator.next();
//			pair.
//
//		}
		// No authentication required, this will be handled in a more specialized way
		// The system should not need to auth to remove cars after purchase
		LotDAO.getLot().get(carVin).getOffers().clear();

	}

	public Double calculateMonthlyPayment(String customerUsername, String carVin) {

		CarBidService carBidService = new CarBidService();
		// Customer customer = UserDAO.getCustomer(customerUsername);
		Double offer = carBidService.getCarOffer(carVin, customerUsername);
		// Returns a 2 year loan on the vehicle
		return offer / 24;

	}

	public void viewCarsAndPaymentInfo(String customer) {
		Customer user = UserDAO.getCustomer(customer);
		System.out.println("Vehicles Owned by: " + customer + "\t Total Balance Due: $" + user.getMonthlyPayment());
		for (Car car : user.getCarsOwned()) {
			System.out.println("|-Vehicle: " + car.getYear() + ", " + car.getMake() + ", " + car.getModel() + ": \n"
					+ "|-Original Price: " + car.getPrice() + "Monthly Installments: $" + car.getPrice() / 24 + "\n");
		}
	}

	public void makePayment(String customer, Double payment) {
//	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//	   LocalDateTime now = LocalDateTime.now();  
//	   System.out.println(dtf.format(now));  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		Customer user = UserDAO.getCustomer(customer);
		//Update Balance
		user.setTotalBalance(user.getTotalBalance() - user.getMonthlyPayment());
		user.addPayment(formatter.format(now), payment);
		
	}

	public void customerPaymentHistory(String customer) {
		// TODO: Users should be able to see their payments
		Customer user = UserDAO.getCustomer(customer);
		Iterator iterator = user.getPaymentHistory().entrySet().iterator();
		System.out.println("Payment History:");
		while(iterator.hasNext()) {
			Map.Entry<String, Double> pair = (Map.Entry<String, Double>)iterator.next();
			System.out.println(pair);
			
		}
	}

	public void employeePaymentView() {
		// TODO: Employees should be able to see all of the payments
		
	}
}
