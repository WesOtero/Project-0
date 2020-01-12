package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.pojo.Car;

public class CarBidService {
	
	public void customerOffer(String username, String password, String carVin, Double offer) {
		if(LotDAO.getLot().containsKey(carVin)) {
			Car car = LotDAO.getLot().get(carVin);
			car.setOffers(username, offer);
		}
		
	}
}
