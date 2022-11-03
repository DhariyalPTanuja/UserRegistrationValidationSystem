package com.userregistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserRegistrationTestCase {

	@Test
	public void givenName_WhenPropper_ShouldReturnTrue() {
		
		RegistrationUserMain validator = new RegistrationUserMain();
		
		boolean result = validator.patternMatchingTest("Tanuja");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenPropper_ShouldReturnTrue() {
		
		RegistrationUserMain validator = new RegistrationUserMain();
		
		boolean result = validator.emailMatching("Tanuja.p@xyz.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPhoneNumber_WhenPropper_ShouldReturnTrue() {
		
		RegistrationUserMain validator = new RegistrationUserMain();
		
		boolean result = validator.phoneMatchingPattern("96373526727");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPassword_WhenPropper_ShouldReturnTrue() {
		
		RegistrationUserMain validator = new RegistrationUserMain();
		
		boolean result = validator.passwordMatchingPattern("Tanuja123@ab");
		Assert.assertEquals(true, result);
	}
	
}
