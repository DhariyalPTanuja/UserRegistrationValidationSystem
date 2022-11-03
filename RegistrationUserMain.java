package com.userregistration;

import java.util.Scanner;

public class RegistrationUserMain {
	Scanner scanobj = new Scanner(System.in);

	public static void main(String[] args) {
		RegistrationUserMain user1 = new RegistrationUserMain();


	}


	boolean passwordMatchingPattern(String password) {

		String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&])(?=.{8,}).*$";
		boolean regexResult = password.matches(regexPassword);
		return regexResult;
	}

	boolean phoneMatchingPattern(String phonenumber) {
		String regexPhone = "^\\+[0-9]{1,3}\\[7-9]{1}[0-9]{9}$";
		// String regexPhone = "^+(0/91)?[7-9]{1}[0-9]{9}";
		boolean regexResult = phonenumber.matches(regexPhone);
		return regexResult;
	}

	boolean emailMatching(String email) {
		String regexEmail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean regexResult = email.matches(regexEmail);
		return regexResult;

	}

	boolean patternMatchingTest(String name) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		boolean regexResult = name.matches(regex);
		return regexResult;

	}

}
