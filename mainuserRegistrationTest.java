package com.JunitEx;

//import org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class mainuserRegistrationTest {
	UserRegistration user = new UserRegistration();
	@Test
	public void givenFirstName_true() {
		boolean actual = user.firstName("Abhishek");
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void givenFirstName_false() {
		boolean actual = user.firstName("abhishek");
		boolean expected = false;
		Assertions.assertEquals(expected, actual);
	}
	
	
}
