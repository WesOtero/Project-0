package com.revature.CarDealershipApp;

import java.util.Scanner;

import com.revature.pojo.User;
import com.revature.service.CarRegistrationService;
import com.revature.service.CarViewService;
import com.revature.service.UserAuthenticationService;
import com.revature.service.UserRegistrationService;
import com.revature.service.UserRemovalService;

/**
 * The Car Dealership app is a console-based application that facilitates the
 * purchasing of cars. An employee can add cars to the lot and manage offers for
 * those cars, while a customer can view the cars on the lot and make offers. We
 * want to see that you can meet deadlines and that you can code. You are
 * expected to complete the following requirements and give a 5 minute
 * presentation demonstrating your application.
 *
 */
public class App {

	static User user = new User();

	public static void main(String[] args) {
		// Starts all services
		UserAuthenticationService userAuthServ = new UserAuthenticationService();
		UserRegistrationService userRegServ = new UserRegistrationService();
		UserRemovalService userRemvServ = new UserRemovalService();
		CarRegistrationService carRegServ = new CarRegistrationService();
		CarViewService carViewServ = new CarViewService();
		carRegServ.addCar("vin1", "Nissan", "Altima", "2016", 13000D);
		carRegServ.addCar("vin2", "Nissan", "Altima", "2016", 13000D);
		carViewServ.viewCars();
		Boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String userInput;

		System.out.println("Welcome!");

		do {

			System.out.println("Please select one of our options:");

			System.out.println("1. Login \n2. Create Account \n3. Exit");

			userInput = scanner.nextLine();
			userInput = userInput.toUpperCase();

			switch (userInput) {
			case "1":
			case "LOGIN":
					signInMenu(userAuthServ, scanner);
				break;
			case "2":
			case "CREATE":
				break;
			case "3":
			case "EXIT":
				run = false;
				break;
			default:
				System.out.println("Invalid choice, try again...");
				break;
			}

		} while (run);
		System.out.println("Goodbye!");
		scanner.close();
	}

	public static void signInMenu(UserAuthenticationService userAuthServ, Scanner scanner) {
		String userInput;
		System.out.println("1. For Customer Login \n2. for Employee Login");
		
		userInput = scanner.nextLine();
		
		switch (userInput) {
		case "1":
				signInMenu(userAuthServ, scanner);
			break;
		case "2":
			break;
		default:
			System.out.println("Invalid choice, try again...");
			break;
		}
//		if(userAuthServ.authenticateCustomer(username, password))
	}
	
	public static void createCustomerMenu() {

	}

	public static void createEmployeeMenu() {

	}

	public static void deleteCarMenu() {

	}
}
