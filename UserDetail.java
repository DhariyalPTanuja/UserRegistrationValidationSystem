package com.userregistration;

public class UserDetail {
	String firstname;

	public UserDetail(String fName) {
		this.firstname = fName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "UserDetail [firstname=" + firstname + "]";
	}

}
