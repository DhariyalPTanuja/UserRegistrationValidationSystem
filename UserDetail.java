package com.userregistration;

import java.util.Scanner;

public class UserDetail {
	String firstname;
	String lastname;

	Scanner scanobj = new Scanner(System.in);
	public UserDetail(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
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
	@Override
	public String toString() {
		return "UserDetail [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public void validateUserInput() {
		System.out.println("Enter the first name: ");
		String fName = scanobj.next();
		patternMatching(fName);
		 System.out.println("Enter the Last name: ");
			String lName = scanobj.next();
			patternMatching(lName);
	}
	private void checkValid(boolean regexResult) {
		if(regexResult == false) {
			System.out.println("Please Enter a valid Input");
			System.out.println("Again Enter a Input");
			String Name = scanobj.next();
			patternMatching(Name);
		}
		else 
			System.out.println("Matches");
		
	}
	private void patternMatching(String name) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		boolean regexResult =name.matches(regex);
		 checkValid(regexResult);

		
	}
}

