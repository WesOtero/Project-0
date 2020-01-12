package com.revature.dao;

import java.util.HashMap;

import com.revature.pojo.Car;

public class LotDAO {
	private static HashMap<String, Car> lot = new HashMap<String, Car>();

	public static HashMap<String, Car> getLot() {
		return lot;
	}

	public static Car getCar(String carVin) {
		return lot.get(carVin);
	}

	public static void addCar(String vin, Car car) {
		lot.put(vin, car);
	}

}
