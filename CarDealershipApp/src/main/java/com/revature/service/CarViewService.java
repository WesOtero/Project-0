package com.revature.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.revature.dao.LotDAO;
import com.revature.pojo.Car;

public class CarViewService {
	HashMap<String, Car> cars = LotDAO.getLot();
	public void viewCars() {
		Iterator iterator = cars.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Car> pair = (Map.Entry<String, Car>)iterator.next();
			System.out.println(pair.getValue().toString());
			
		}
	}
}
