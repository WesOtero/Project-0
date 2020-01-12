package com.revature.CarDealershipApp;

import java.util.Scanner;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;
import com.revature.service.UserAuthenticationService;
import com.revature.service.UserRegistrationService;
import com.revature.service.UserRemovalService;

/**
 * Hello world!
 *
 */
public class App {
	
	static User user = new User();
	
	public static void main(String[] args) {
		UserAuthenticationService userAuthServ = new UserAuthenticationService();
		UserRegistrationService userRegServ = new UserRegistrationService();
		UserRemovalService userRemvServ = new UserRemovalService();
		
//		userAuthServ.authenticateCustomer("Rando", "Person");
		userAuthServ.authenticateEmployee("Rando", "Person");
		
//		userRegServ.registerCustomer("Rando", "Person");
//		userRegServ.registerEmployee("Employee", "Employee", "root");
//		
//		userAuthServ.authenticateCustomer("Rando", "Person");
//		userAuthServ.authenticateEmployee("Employee", "Employee");
//		
//		userRemvServ.removeUser("Employee", "Employee", "Rando");
//		userAuthServ.authenticateCustomer("Rando", "Person");
//		
		System.out.println(UserDAO.getCustomers());
		System.out.println(UserDAO.getEmployees());

		menu();
	}

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		do {
			
			System.out.println("Welcome!");
			System.out.println("Please select one of our options:");

			System.out.println("1. Sign in");
			System.out.println("2. Create Account");

			userInput = scanner.nextLine();
			userInput = userInput.toUpperCase();
			//TODO:Check if user has signed in to then allow into menus
			
			
		} while (!userInput.contentEquals("EXIT"));
		
		scanner.close();
	}
}
