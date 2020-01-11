package com.revature.pojo;

public class Car {
	private String vinNumber;
	private String make;
	private String model;
	private String year;
	private boolean usedCondition;
	private Double price;

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

}
