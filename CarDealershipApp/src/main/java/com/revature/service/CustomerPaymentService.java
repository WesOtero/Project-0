package com.revature.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.revature.pojo.Car;
import com.revature.pojo.CarDB;
import com.revature.pojo.Customer;
import com.revature.pojo.UserDB;

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
		CarDB.getLot().get(carVin).getOffers().clear();

	}

	public Double calculateMonthlyPayment(String customerUsername, String carVin) {
		Car car = CarDB.getCar(carVin);
		car.setRemainingPayments(24);
		CarBidService carBidService = new CarBidService();
		// Customer customer = UserDB.getCustomer(customerUsername);
		Double offer = carBidService.getCarOffer(carVin, customerUsername);

		// Returns a 2 year loan on the vehicle
		return offer / 24;

	}

	public void viewCarsAndPaymentInfo(String customer) {
		Customer user = UserDB.getCustomer(customer);
		System.out.println("Vehicles Owned by: " + customer + "\t Total Balance Due: $" + user.getMonthlyPayment());
		for (Car car : user.getCarsOwned()) {
			System.out.println("|-Vehicle: " + car.getYear() + ", " + car.getMake() + ", " + car.getModel() + ": \n"
					+ "|-Original Price: " + car.getPrice() + "Monthly Installments: $" + car.getPrice() / 24
					+ "Remaining payments:" + car.getRemainingPayments() + "\n");
		}
	}

	public void makePayment(String customer) {
//	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//	   LocalDateTime now = LocalDateTime.now();  
//	   System.out.println(dtf.format(now));
		try {
			boolean commitPayment = false;
			TimeUnit.SECONDS.sleep(1);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			Customer user = UserDB.getCustomer(customer);
			// Update Balance
//			if (user.getCarsOwned().size() < 2) {
//				user.setTotalBalance(user.getTotalBalance() - user.getMonthlyPayment());
//				user.getCarsOwned().get(0).setRemainingPayments(user.getCarsOwned().get(0).getRemainingPayments() - 1);
//			} else if(user.getTotalBalance() == payment) {
//				user.setTotalBalance(user.getTotalBalance() - user.getMonthlyPayment());
//			}

			user.setTotalBalance(user.getTotalBalance() - user.getMonthlyPayment());
			user.addPayment(formatter.format(now), user.getMonthlyPayment());
			for (int i = 0; i < user.getCarsOwned().size(); i++) {
				user.getCarsOwned().get(i).setRemainingPayments(user.getCarsOwned().get(i).getRemainingPayments() - 1);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void customerPaymentHistory(String customer) {
		// TODO: Users should be able to see their payments
		Customer user = UserDB.getCustomer(customer);
		Iterator iterator = user.getPaymentHistory().entrySet().iterator();
		System.out.println("Payment History:");
		while (iterator.hasNext()) {
			Map.Entry<String, Double> pair = (Map.Entry<String, Double>) iterator.next();
			System.out.println(pair);

		}
	}

	public void employeePaymentView() {
		// TODO: Employees should be able to see all of the payments
		HashMap<String, Customer> payments = UserDB.getCustomers();

		Iterator iterator = payments.entrySet().iterator();
		System.out.println("User Payment History:");
		while (iterator.hasNext()) {
			Map.Entry<String, Customer> pair = (Map.Entry<String, Customer>) iterator.next();
			System.out.println(pair.getValue().getUsername());
			System.out.println(pair.getValue().getPaymentHistory());

		}

	}
}
