package com.userregistration;


public class UserRegistrationMain {

	static String fName;
	static String lName;
	static String email;
	
	public static void main(String[] args) {

		System.out.println("Welcome in the User Registration Validation System!!!!");
		
		//UC3  to enter a valid email - E.g. abc.xyz@bl.co.in - 
		
		UserDetail user1 = new UserDetail(fName, lName , email);
		
		user1.validateUserInput();
		
		
		
	}
}
