package com.revature.pojo;

import java.util.ArrayList;

public class Customer extends User {
	private Double totalBalance;
	private Double monthlyPayment;
	ArrayList<Car> carsOwned = new ArrayList<>();
	ArrayList<Double> payments = new ArrayList<>();
	
	public Customer(){
		super();
		this.totalBalance = 0D;
		this.monthlyPayment = 0D;
	}

	public Double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public Double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(Double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public ArrayList<Car> getCarsOwned() {
		return carsOwned;
	}

	public void addCar(Car car) {
		this.carsOwned.add(car);
	}
	
	
}
