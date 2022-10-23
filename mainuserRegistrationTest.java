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

@Test
	public void giverLastname_true() {
		boolean actual = user.lastName("Kanojia");
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void givenEmail_true() {
		boolean actual = user.Email("abhishek14kanojia@gmail.com");
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void givenMobuileNumber_true() {
		boolean actual = user.Mobileno("8989232830");
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void givenPassword_true() {
		boolean actual = user.password("abc@123");
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
}
