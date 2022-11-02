package com.userregistration;

import java.util.Scanner;

public class UserDetail {
	String firstname;
	String lastname;
	String email;

	Scanner scanobj = new Scanner(System.in);

	public UserDetail(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		
	}

	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetail [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}

	public void validateUserInput() {
		System.out.println("Enter the first name: ");
		String fName = scanobj.next();
		patternMatching(fName);
		System.out.println("Enter the Last name: ");
		String lName = scanobj.next();
		patternMatching(lName);
		System.out.println("Enter the email address: ");
		String email = scanobj.next();
		emailMatching(email);
	}

	private void emailMatching(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean regexResult = email.matches(regex);
		checkValid(regexResult);

	}

	private void checkValid(boolean regexResult) {
		if (regexResult == false) {
			System.out.println("Please Enter a valid Input");
			System.out.println("Again Enter a Input");
			String Name = scanobj.next();
			patternMatching(Name);
		} else
			System.out.println("Matches");

	}

	private void patternMatching(String name) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		boolean regexResult = name.matches(regex);
		checkValid(regexResult);

	}
}
