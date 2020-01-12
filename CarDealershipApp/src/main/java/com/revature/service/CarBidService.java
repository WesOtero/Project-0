package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.pojo.Car;

public class CarBidService {
	//User doesn't need auth because they're already past the login screen
	public void addOffer(String vinNumber, String customer, Double offer) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.setOffers(customer, offer);
		}
	}
	
	//Only available in the employee menu
	public void removeOffer(String customer, String vinNumber) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.getOffers().remove(customer);
		}
	}
	
	//Grabs the offers assosiated with a car and a customer
	public Double getCarOffer(String carVin, String customer) {
		return LotDAO.getCar(carVin).getOffers().get(customer);
	}
	
	
}
