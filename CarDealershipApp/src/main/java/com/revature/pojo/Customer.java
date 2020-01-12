package com.revature.pojo;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends User {
	private Double totalBalance;
	private Double monthlyPayment;
	private ArrayList<Car> carsOwned = new ArrayList<>();
//	ArrayList<Double> payments = new ArrayList<>();
	private HashMap<String, Double> paymentHistory = new HashMap<>();
	
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

	public HashMap<String, Double> getPaymentHistory() {
		return paymentHistory;
	}

	public void addPayment(String date, Double payment) {
		this.paymentHistory.put(date, payment);
	}
	
	
}
