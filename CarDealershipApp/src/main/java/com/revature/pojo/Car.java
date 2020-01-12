package com.revature.pojo;

import java.util.HashMap;

public class Car {
	private String vinNumber;
	private String make;
	private String model;
	private String year;
	private boolean usedCondition;
	//Users can make offers for the car, so each car has a HashSet of offers <"Username","Offer Amount">
	//It is persisted by the LotDAO, which contains all car objects
	private HashMap<String, Double> offers;

	public Car() {

	}

	public Car(String vinNumber, String make, String model, String year, boolean usedCondition) {
		super();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.usedCondition = usedCondition;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isUsedCondition() {
		return usedCondition;
	}

	public void setUsedCondition(boolean usedCondition) {
		this.usedCondition = usedCondition;
	}

	public HashMap<String, Double> getOffers() {
		return offers;
	}

	public void setOffers(HashMap<String, Double> offers) {
		this.offers = offers;
	}
	
	
}
