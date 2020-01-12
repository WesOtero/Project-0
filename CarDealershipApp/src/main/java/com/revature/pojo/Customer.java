package com.revature.pojo;

import java.util.ArrayList;

public class Customer extends User {
	private Double totalBalance;
	private Double apr;
	private Double monthlyPayment;
	ArrayList<Car> carsOwned = new ArrayList<>();
	ArrayList<Double> payments = new ArrayList<>();
	
	public Customer(){
		super();
	}

	public Double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public Double getApr() {
		return apr;
	}

	public void setApr(Double apr) {
		this.apr = apr;
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
