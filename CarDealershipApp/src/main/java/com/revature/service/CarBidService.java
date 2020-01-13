package com.revature.service;

import java.util.Iterator;

import com.revature.pojo.Car;
import com.revature.pojo.CarDB;
import com.revature.pojo.Customer;
import com.revature.pojo.UserDB;

public class CarBidService {
	CustomerPaymentService customerPayServ = new CustomerPaymentService();
	CarRemovalService carRemvServ = new CarRemovalService();

	// User doesn't need auth because they're already past the login screen
	public void addOffer(String vinNumber, String customer, Double offer) {
		if (CarDB.getLot().containsKey(vinNumber)) {
			Car car = CarDB.getLot().get(vinNumber);
			car.setOffers(customer, offer);
			car.setOffer(true);
			System.out.println("Offer Placed on : " + vinNumber);
		}
	}

	// Only available in the employee menu
	public void removeOffer(String customer, String vinNumber) {
		if (CarDB.getLot().containsKey(vinNumber)) {
			Car car = CarDB.getLot().get(vinNumber);
			car.getOffers().remove(customer);
		}
	}

	// Grabs the offers assosiated with a car and a customer
	public Double getCarOffer(String carVin, String customer) {
		return CarDB.getCar(carVin).getOffers().get(customer);
	}

	// Allows the Employee to see the offers made before accepting any
	public void getCurentOffers(String vinNumber) {
		if (CarDB.getCar(vinNumber) != null) {
			Iterator iterator = CarDB.getLot().get(vinNumber).getOffers().entrySet().iterator();
			Car car = CarDB.getLot().get(vinNumber);
			System.out.println(
					"Offers for: " + car.getYear() + ", " + car.getMake() + ", " + car.getModel() + ", " + vinNumber);
			while (iterator.hasNext()) {
				System.out.println("|--User: " + iterator.next());
			}
			System.out.println("---------------------------------------");
		} else {
			System.out.println("Car not found");
		}
	}

	public void acceptOffer(String customer, String carVin) {
		// TODO: Remove car from the lot, and assign it to a user
		if (CarDB.getCar(carVin) != null) {
			CustomerPaymentService custPayServ = new CustomerPaymentService();
			Car car = CarDB.getCar(carVin);
			Customer user = UserDB.getCustomer(customer);
			car.setPrice(car.getOffers().get(customer));
			user.addCar(car);
			user.setTotalBalance(car.getPrice());
			user.setMonthlyPayment(user.getMonthlyPayment() + custPayServ.calculateMonthlyPayment(customer, carVin));
			carRemvServ.removeCar(carVin);
			System.out.println(user.getCarsOwned());
		} else {
			System.out.println("Car not found");
		}

	}

}
