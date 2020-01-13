package com.revature.pojo;

import java.io.Serializable;
import java.util.HashMap;

import com.revature.dao.CarDAO;

public class CarDB implements Serializable {
	private static HashMap<String, Car> lot = new HashMap<>();

	public static HashMap<String, Car> getLot() {
		return lot;
	}

	public static Car getCar(String carVin) {
		return lot.get(carVin);
	}

	public static void addCar(String vin, Car car) {
		CarDAO carDAO = new CarDAO();
		lot.put(vin, car);
		carDAO.createCarDB(lot);
		
	}

	public static void setLot(HashMap<String, Car> lot) {
		CarDB.lot = lot;
	}
	

}
