package com.revature.service;

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
		//No authentication required, this will be handled in a more specialized way
		//The system should not need to auth to remove cars after purchase
		LotDAO.getLot().get(carVin).getOffers().clear();
		
	}
	
	CarBidService carBidService = new CarBidService();

	public Double calculateMonthlyPayment(String customerUsername, String carVin) {
		// Customer customer = UserDAO.getCustomer(customerUsername);
		Double offer = carBidService.getCarOffer(carVin, customerUsername);
		// Returns a 2 year loan on the vehicle
		return offer / 24;

	}
	public void viewCarsAndPaymentInfo(String customer) {
		Customer user = UserDAO.getCustomer(customer);
		System.out.println("Vehicles Owned:");
		for (Car car : user.getCarsOwned()) {
			System.out.println("|-Vehicle: " + car.getYear() + ", " + car.getMake() + ", " + car.getModel() + ": \n" + "|-Original Price: " + car.getPrice() +"\n");
		}
	}
	
	public void makePayment(String customer, Double payment) {
		Customer user = UserDAO.getCustomer(customer);
		user.setTotalBalance(user.getTotalBalance() - user.getMonthlyPayment());
	}
	
	
}
