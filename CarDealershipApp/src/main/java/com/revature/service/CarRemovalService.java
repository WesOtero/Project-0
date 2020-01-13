package com.revature.service;

import com.revature.pojo.CarDB;

public class CarRemovalService {
	UserAuthenticationService userAuthServ = new UserAuthenticationService();

	public void removeCar(String carVin) {
		//TODO: Log Event
		CarDB.getLot().remove(carVin);

	}
}
