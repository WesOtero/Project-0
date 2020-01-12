package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;

public class CarRemovalService {
	UserAuthenticationService userAuthServ = new UserAuthenticationService();

	public void removeCar(String carVin) {
		//TODO: Log Event
		LotDAO.getLot().remove(carVin);

	}
}
