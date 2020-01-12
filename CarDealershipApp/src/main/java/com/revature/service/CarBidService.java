package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.pojo.Car;

public class CarBidService {
	//User doesn't need auth because they're already past the login screen
	public void addOffer(String vinNumber, String username, Double offer) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.setOffers(username, offer);
		}
	}
	
	public void removeOffer(String custUsername, String vinNumber) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.getOffers().remove(custUsername);
		}
	}
}
