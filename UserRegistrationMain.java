package com.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {

		System.out.println("Welcome in the User Registration Validation System!!!!");
		
		// UC1 As a User need to enter a valid First Name
		//- First name starts with Cap and has minimum 3 characters
		UserRegistrationMain user = new UserRegistrationMain();
		user.validateUserInput();
		
		
	}
	private void validateUserInput() {
		Scanner scanobj = new Scanner(System.in);

		System.out.println("Enter the first name: ");
		String fName = scanobj.next();

		String regex = "^[A-Z]{1}[a-z]{3,}$";
		boolean regexResult =fName.matches(regex);
		 checkValid(regexResult);

	}
	private void checkValid(boolean regexResult) {
		if(regexResult == false) {
			System.out.println("Please Enter a valid Input");
		}
		else 
			System.out.println("Matches");
		
	}
}
