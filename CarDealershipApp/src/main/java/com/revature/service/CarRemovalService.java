package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;

public class CarRemovalService {
	UserAuthenticationService userAuthServ = new UserAuthenticationService();

	public void removeCar(String username, String password, String carVin) {
		if (userAuthServ.authenticateEmployee(username, password)
				&& UserDAO.getCustomer(username).getPassword().contains(password)) {
			LotDAO.getLot().remove(carVin);
		} else {
			// TODO: log removal failure
			System.out.println("Could not authenticate user ");
		}
	}
}
