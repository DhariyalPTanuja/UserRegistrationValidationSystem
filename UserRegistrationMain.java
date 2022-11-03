package com.userregistration;

public class UserRegistrationMain {

	public static void main(String[] args) {

		System.out.println("Welcome in the User Registration Validation System!!!!");

		// UC7 to follow pre-defined Password rules.
		// Rule1– minimum 8 Characters - NOTE – All rules must
		// Rule2– Should have at least 1 Upper Case -
		//Rule3 – Should have at least 1 numeric number in the password
		

		UserDetail user1 = new UserDetail();

		user1.validateUserInput();

	}
}
