package com.userregistration;


public class UserRegistrationMain {
	
	public static void main(String[] args) {

		System.out.println("Welcome in the User Registration Validation System!!!!");
		
		//UC4 to follow pre-defined Mobile Format - E.g. 91 9919819801 
		//- Country code follow by space and 10 digit number
		
		UserDetail user1 = new UserDetail();
		
		user1.validateUserInput();
	
		
		
		
	}
}
