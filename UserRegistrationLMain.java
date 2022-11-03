package com.userregistration;

import java.util.Scanner;

//Refactor the Code to use Lambda Function  to validate User Entry
@FunctionalInterface
interface UserEntryValidator {
	boolean checkPattern(String message);
}
public class UserRegistrationLMain {
 		
	public static void main(String[] args) {
		 UserEntryValidator nameMatchingPattern = (name) -> name.matches("^[A-Z]{1}[a-z]{3,}$");
			
			UserEntryValidator passwordMatchingPattern = (String password) -> password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&])(?=.{8,}).*$");
			
			UserEntryValidator phoneMatchingPattern = (phonenumber) -> phonenumber.matches("^+(0/91)?[7-9]{1}[0-9]{9}");
			
			UserEntryValidator emailMatching = (email) -> email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
			
		Scanner scanobj = new Scanner(System.in);
		UserRegistrationLMain user1 = new  UserRegistrationLMain();
		System.out.println("Enter the first name: ");
		String fName = scanobj.next();
		boolean regexResult= nameMatchingPattern.checkPattern(fName);
		checkValid(regexResult);
		System.out.println("Enter the Last name: ");
		String lName = scanobj.next();
		boolean regexResult1= nameMatchingPattern.checkPattern(lName);
		checkValid(regexResult1);
		System.out.println("Enter the email address: ");
		String email = scanobj.next();
		boolean regexmailResult= emailMatching.checkPattern(email);
		checkValid(regexmailResult);
		System.out.println("Enter the Phone Number: ");
		String phonenumber = scanobj.next();
		boolean regexPhoneResult= phoneMatchingPattern.checkPattern(phonenumber);
		checkValid(regexPhoneResult);
		System.out.println("Enter the Password: ");
		 String password = scanobj.next();
		 boolean regexPassResult=passwordMatchingPattern.checkPattern(password);
		checkValid(regexPassResult);
	}
		
		private static void checkValid(boolean regexResult) {
			if (regexResult == false) {
				System.out.println("No match");
			} else
				System.out.println("Matches");

		
	}
	
	
	
		
	
	
}
