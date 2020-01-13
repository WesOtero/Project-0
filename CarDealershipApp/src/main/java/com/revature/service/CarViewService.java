package com.revature.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.revature.pojo.Car;
import com.revature.pojo.CarDB;

public class CarViewService {
	HashMap<String, Car> cars = CarDB.getLot();
	public void viewCars() {
		Iterator iterator = cars.entrySet().iterator();
		System.out.println("--Vin Number------Make------------Model-----------Year------------Offers--------");
		while(iterator.hasNext()) {
			Map.Entry<String, Car> pair = (Map.Entry<String, Car>)iterator.next();
			System.out.println(pair.getValue().getCarRecord());
			
		}
	}
}
