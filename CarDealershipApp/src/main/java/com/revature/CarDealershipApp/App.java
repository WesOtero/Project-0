package com.revature.CarDealershipApp;

import java.util.Scanner;

import com.revature.pojo.User;
import com.revature.service.CarBidService;
import com.revature.service.CarRegistrationService;
import com.revature.service.CarRemovalService;
import com.revature.service.CarViewService;
import com.revature.service.CustomerPaymentService;
import com.revature.service.UserAuthenticationService;
import com.revature.service.UserRegistrationService;

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
//		// Starts all services
//		UserAuthenticationService userAuthServ = new UserAuthenticationService();
//		UserRegistrationService userRegServ = new UserRegistrationService();
//		UserRemovalService userRemvServ = new UserRemovalService();
//		CarRegistrationService carRegServ = new CarRegistrationService();
//		CarViewService carViewServ = new CarViewService();
//		CarBidService carBidServ = new CarBidService();
//		CustomerPaymentService custPayServ = new CustomerPaymentService();
//		userRegServ.registerCustomer("w", "w");
//		userRegServ.registerCustomer("Krista", "Person");
//		carRegServ.addCar("vin1", "Nissan", "Rouge", "2013", 20000D, false);
//		carRegServ.addCar("vin2", "Nissan", "Altima", "2016", 13000D, false);
//		carViewServ.viewCars();
//		
//		carBidServ.addOffer("vin2", "Wesley", 12000D);
//		carBidServ.addOffer("vin1", "Wesley", 15000D);
//		carBidServ.addOffer("vin2", "Krista", 2000D);
//		carViewServ.viewCars();
//		carBidServ.getCarOffer("vin2", "Rando");
//		carBidServ.getCurentOffers("vin2", "Rando");
//		carBidServ.acceptOffer("Wesley", "vin2");
//		carBidServ.acceptOffer("Wesley", "vin1");
//		
//		custPayServ.viewCarsAndPaymentInfo("Wesley");
//		
//		custPayServ.makePayment("Wesley");
//		custPayServ.makePayment("Wesley");
//		custPayServ.customerPaymentHistory("Wesley");
//		
//		custPayServ.employeePaymentView();
//		
//		Boolean run = true;
//		Scanner scanner = new Scanner(System.in);
//		String userInput;
//		custPayServ.viewCarsAndPaymentInfo("Wesley");

		mainMenu();
	}

//Main Menu
	public static void mainMenu() {
		UserAuthenticationService userAuthServ = new UserAuthenticationService();
		Boolean run = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome!");
		do {
			String userInput;
			System.out.println("Please select one of our options:");

			System.out.println("1. Login \n2. Create Account \n3. Exit");

			userInput = scanner.nextLine();
			userInput = userInput.toUpperCase();

			switch (userInput.toUpperCase()) {
			case "1":
			case "LOGIN":
				signInMenu();
				break;

			case "2":
				registrationMenu();
				break;
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

		scanner.close();
		System.out.println("Goodbye!");
	}

//SignIn Menu
	public static void signInMenu() {
		UserAuthenticationService userAuth = new UserAuthenticationService();
		String username;
		String password;
		String userInput;
		Scanner scanner = new Scanner(System.in);

		// Prompt
		System.out.println("LOGIN MENU:");
		System.out.println("1. Customer Login: \n2. Employee Login: ");
		userInput = scanner.nextLine();

		switch (userInput) {
		case "1":
			// CUSTOMER LOGIN
			System.out.println("Username: ");
			userInput = scanner.nextLine();
			username = userInput;

			System.out.println("Password : ");
			userInput = scanner.nextLine();
			password = userInput;
			System.out.println(userAuth.authenticateCustomer(username, password));
			if (userAuth.authenticateCustomer(username, password)) {
				customerMenu(username);
			}

			break;

		case "2":
			// EMPLOYEE LOGIN
			System.out.println("Username: ");
			userInput = scanner.nextLine();
			username = userInput;

			System.out.println("Password : ");
			userInput = scanner.nextLine();
			password = userInput;
			if (userAuth.authenticateEmployee(username, password)) {
				customerMenu(username);
			}

			break;

		default:
			System.out.println("Invalid choice, try again...");
			break;
		}

	}

//Registration Menu
	public static void registrationMenu() {
		UserRegistrationService userRegServ = new UserRegistrationService();
		String userInput;
		String username;
		String password;
		String systemPassword;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nREGISTRATION MENU");
		System.out.println("1. Customer Registration: \n2. Employee Registration: ");
		userInput = scanner.nextLine();

		switch (userInput) {
		case "1":
			System.out.println("Username: ");
			userInput = scanner.nextLine();
			username = userInput;

			System.out.println("Password : ");
			userInput = scanner.nextLine();
			password = userInput;

			userRegServ.registerCustomer(username, password);
			signInMenu();
			break;

		case "2":
			System.out.println("Username: ");
			userInput = scanner.nextLine();
			username = userInput;

			System.out.println("Password : ");
			userInput = scanner.nextLine();
			password = userInput;

			System.out.println("Root password : ");
			userInput = scanner.nextLine();
			systemPassword = userInput;

			userRegServ.registerEmployee(username, password, systemPassword);
			signInMenu();
			break;

		default:
			System.out.println("Invalid choice, try again...");
			break;
		}
	}

//CustomerMenu
	public static void customerMenu(String username) {
		String userInput, vinNumber;
		Double offer;
		Scanner scanner = new Scanner(System.in);
		CarViewService carViewServ = new CarViewService();
		CarBidService carBidServ = new CarBidService();

		System.out.println("CUSTOMER MENU: \n Hello " + username);
		System.out.println("1. Explore Cars: \n2. Make Offer: \\n3. View Cars: \\n4. View Remaining Balance: ");
		userInput = scanner.nextLine();

		switch (userInput) {
		case "1":
			carViewServ.viewCars();
			break;

		case "2":
			System.out.println("--MAKE OFFER--");
			System.out.println("Enter Vehicle Identification Number(VIN): ");
			vinNumber = scanner.nextLine();
			// Clear the scanner
			scanner.hasNextLine();
			System.out.println("Enter Amount: ");
			offer = scanner.nextDouble();
			carBidServ.addOffer(vinNumber, username, offer);
			break;
		case "3":
			System.out.println("--VIEW CARS--");
			System.out.println("Enter Vehicle Identification Number(VIN): ");
			vinNumber = scanner.nextLine();
			// Clear the scanner
			scanner.hasNextLine();
			System.out.println("Enter Amount: ");
			offer = scanner.nextDouble();
			carBidServ.addOffer(vinNumber, username, offer);
			break;
		case "4":
			System.out.println("--VIEW REMAINING BALANCE--");
			System.out.println("Enter Vehicle Identification Number(VIN): ");
			vinNumber = scanner.nextLine();
			// Clear the scanner
			scanner.hasNextLine();
			System.out.println("Enter Amount: ");
			offer = scanner.nextDouble();
			carBidServ.addOffer(vinNumber, username, offer);
			break;

		default:
			System.out.println("Invalid choice, try again...");
			break;
		}
	}

//EmployeeMenu
	public static void employeeMenu(String username) {
		CarViewService carViewServ = new CarViewService();
		CarBidService carBidServ = new CarBidService();
		CarRegistrationService carRegServ = new CarRegistrationService();
		CarRemovalService carRemvServ = new CarRemovalService();
		CustomerPaymentService custPayServ = new CustomerPaymentService();
		String userInput, vinNumber, make, model, year, customer;
		Double price;
		Scanner scanner = new Scanner(System.in);

		System.out.println("EMPLOYEE MENU: \n Hello " + username);
		System.out.println("1. Add Cars: \n2. Accept Offers: \\n3. Remove Car From Lot: \\n4. View All Payments: ");
		userInput = scanner.nextLine();

		switch (userInput) {
		case "1":
			System.out.println("--ADD CARS--");
			System.out.println("Enter VIN:");
			System.out.println("Enter Make:");
			System.out.println("Enter Model:");
			System.out.println("Enter Year:");
			System.out.println("Enter price:");
			
			carRegServ.addCar(vinNumber, make, model, year, price);
			vinNumber = "";
			make = "";
			model = "";
			year = "";
			price = 0D;
			break;

		case "2":
			System.out.println("--ACCEPT OFFER--");
			System.out.println("Enter Vehicle Identification Number(VIN): ");
			vinNumber = scanner.nextLine();
			// Clear the scanner
			scanner.hasNextLine();
			System.out.println("Enter Amount: ");
			
			carBidServ.acceptOffer(customer, vinNumber);
			customer = "";
			vinNumber = "";
			break;
		case "3":
			System.out.println("--REMOVE CARS--");
			System.out.println("Enter Car VIN:");
			vinNumber = scanner.nextLine();
			carRemvServ.removeCar(vinNumber);
			vinNumber = "";
			
			break;
		case "4":
			System.out.println("--VIEW ALL PAYMENTS--");
			System.out.println("Enter Vehicle Identification Number(VIN): ");
			vinNumber = scanner.nextLine();
			// Clear the scanner
			scanner.hasNextLine();
			System.out.println("Enter Amount: ");
			offer = scanner.nextDouble();
			carBidServ.addOffer(vinNumber, username, offer);
			break;

		default:
			System.out.println("Invalid choice, try again...");
			break;
		}
	}
}
