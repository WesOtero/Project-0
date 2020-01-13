package com.revature.service;

import com.revature.pojo.Car;
import com.revature.pojo.CarDB;

public class CarRegistrationService {
	// Works as log as you are an employee
	public void addCar(String vinNumber, String make, String model, String year, Double price) {
		Car newCar = new Car();
		if (!CarDB.getLot().containsKey(vinNumber)) {
			newCar.setVinNumber(vinNumber);
			newCar.setMake(make);
			newCar.setModel(model);
			newCar.setYear(year);
			newCar.setPrice(price);
			CarDB.addCar(vinNumber, newCar);
			// TODO: Log car created
			System.out.println("Vehicle created");
		} else {
			// TODO: Log car already exists
			System.out.println("Vehicle already exists");
		}

	}
}
