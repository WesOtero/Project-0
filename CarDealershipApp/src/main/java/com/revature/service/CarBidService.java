package com.revature.service;

import java.util.Iterator;

import com.revature.dao.LotDAO;
import com.revature.dao.UserDAO;
import com.revature.pojo.Car;
import com.revature.pojo.Customer;

public class CarBidService {
	CarRemovalService carRemvServ = new CarRemovalService();
	//User doesn't need auth because they're already past the login screen
	public void addOffer(String vinNumber, String customer, Double offer) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.setOffers(customer, offer);
			car.setOffer(true);
		}
	}
	
	//Only available in the employee menu
	public void removeOffer(String customer, String vinNumber) {
		if (LotDAO.getLot().containsKey(vinNumber)) {
			Car car = LotDAO.getLot().get(vinNumber);
			car.getOffers().remove(customer);
		}
	}
	
	//Grabs the offers assosiated with a car and a customer
	public Double getCarOffer(String carVin, String customer) {
		return LotDAO.getCar(carVin).getOffers().get(customer);
	}
	
	//Allows the Employee to see the offers made before accepting any
	public void getCurentOffers(String vinNumber, String customer) {
		Iterator iterator = LotDAO.getLot().get(vinNumber).getOffers().entrySet().iterator();
		Car car = LotDAO.getLot().get(vinNumber);
		System.out.println("Offers for: " + car.getYear()+ ", " + car.getMake()+ ", " + car.getModel() + ", " + vinNumber);
		while(iterator.hasNext()) {
			System.out.println("|--User: " + iterator.next());
		}
		System.out.println("---------------------------------------");
	}
	
	public void acceptOffer(String customer, String carVin) {
		//TODO: Remove car from the lot, and assign it to a user
		Car car = LotDAO.getCar(carVin);
		Customer user = UserDAO.getCustomer(customer);
		car.setPrice(car.getOffers().get(customer));
		user.addCar(car);
		user.setTotalBalance(car.getPrice());
		carRemvServ.removeCar(carVin);
		System.out.println(user.getCarsOwned());
		
	}
	
	
}
