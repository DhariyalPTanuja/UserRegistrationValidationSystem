package com.userregistration;


public class UserRegistrationMain {

	static String fName;
	static String lName;
	public static void main(String[] args) {

		System.out.println("Welcome in the User Registration Validation System!!!!");
		
		// UC2 As a User need to enter a valid Last Name
		//- First name starts with Cap and has minimum 3 characters

		UserDetail user1 = new UserDetail(fName, lName);
		user1.validateUserInput();
		
		
	}
}
