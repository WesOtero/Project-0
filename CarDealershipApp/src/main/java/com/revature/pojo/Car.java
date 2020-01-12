package com.revature.pojo;

import java.util.HashMap;

public class Car {
	private String vinNumber;
	private String make;
	private String model;
	private String year;
	private Double price;
	//Displays if there are any current offers
	private boolean offer;
	// Users can make offers for the car, so each car has a HashSet of offers
	// <"Username","Offer Amount">
	// It is persisted by the LotDAO, which contains all car objects
	private HashMap<String, Double> offers = new HashMap<>();

	public Car() {

	}

	public Car(String vinNumber, String make, String model, String year, Double price, boolean offer) {
		super();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.offer = offer;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isThereOffers() {
		return offer;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public HashMap<String, Double> getOffers() {
		return this.offers;
	}

	public void setOffers(String username, Double offer) {
		this.offers.put(username, offer);
//		this.offers.put(username, offer);
//		this.offer = false;
	}

	@Override
	public String toString() {
		//to format the table add an amount of spaces that is equals to the longest possible value
		return "| " + this.vinNumber + "     \t| " + this.make + "       \t| " + this.model
				+ "      \t| " + this.year + "     \t| " + this.offer + "  \t|";
	}

}
