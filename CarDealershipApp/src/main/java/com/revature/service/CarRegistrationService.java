package com.revature.service;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;
import com.revature.pojo.Car;

public class CarRegistrationService {
	// Works as log as you are an employee
	public void addCar(String vinNumber, String make, String model, String year, Double price) {
		Car newCar = new Car();
		if (!LotDAO.getLot().containsKey(vinNumber)) {
			newCar.setVinNumber(vinNumber);
			newCar.setMake(make);
			newCar.setModel(model);
			newCar.setYear(year);
			newCar.setPrice(price);
			//newCar.setOffer();
			LotDAO.addCar(vinNumber, newCar);
			// TODO: Log car created
			System.out.println("Vehicle created");
		} else {
			// TODO: Log car already exists
			System.out.println("Vehicle already exists");
		}

	}
}
