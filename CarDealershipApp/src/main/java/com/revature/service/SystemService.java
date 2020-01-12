package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;
import com.revature.pojo.Car;
import com.revature.pojo.Customer;
import com.revature.pojo.User;

public class SystemService {
	// TODO: Add payment calculator
	CarBidService carBidService = new CarBidService();

	public Double calculateMonthlyPayment(String customerUsername, String carVin) {
		// Customer customer = UserDAO.getCustomer(customerUsername);
		Double offer = carBidService.getCarOffer(carVin, customerUsername);
		// Returns a 2 year loan on the vehicle
		return offer / 24;

	}
	// TODO: Add remaining offers drop

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

}
