package com.revature.CarDealershipApp;

import java.util.Scanner;

import com.revature.pojo.User;

/**
 * Hello world!
 *
 */
public class App {
	
	static User user = new User();
	
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		do {
			if(!user.)
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
