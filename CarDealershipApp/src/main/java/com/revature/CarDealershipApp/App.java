package com.revature.CarDealershipApp;

import java.util.Scanner;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;
import com.revature.service.UserRegistrationService;

/**
 * Hello world!
 *
 */
public class App {
	
	static User user = new User();
	
	public static void main(String[] args) {
//		UserLoginService userLoginService = new UserLoginService();
//		userLoginService.registerEmployee("rando", "rando", "root");
//		UserRegistrationService userRegistrationService = new UserRegistrationService();
//		userRegistrationService.registerCustomer("John", "Smoth");
//		userRegistrationService.registerEmployee("Jane", "Smith", "root");
//		userRegistrationService.registerCustomer("John", "Smoth");
//		userRegistrationService.registerEmployee("Jane", "Smith", "root");
//		System.out.println(UserDAO.getCustomers());
//		System.out.println(UserDAO.getEmployees());

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
