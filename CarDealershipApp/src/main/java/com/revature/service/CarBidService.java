package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.pojo.Car;

public class CarBidService {
	//User doesn't need auth because they're already past the login screen
	public void customerOffer(String carVin, Double offer) {
		if (LotDAO.getLot().containsKey(carVin)) {
			Car car = LotDAO.getLot().get(carVin);
//			car.setOffers(username, offer);
		}
	}
}
