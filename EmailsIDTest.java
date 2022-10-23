package com.JunitEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmailsIDTest {
	private String emailIDs;
	private boolean expectedResult;
	public EmailsIDTest(String emailIDs, boolean expectedResult) {
		this.emailIDs = emailIDs;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection emailIds_with_Results() {
		return Arrays.asList(new Object[][]{{"abc.syz@bl.co.in", true}, {"abc-100@yahoo.com", true},
            {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc-100@abc.net", true},
            {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
            {"abc+100@gmail.com", true}, {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false},
            {"abc123@.com", false}, {"abc123@.com.com", false}, {".abc@abc.com", false},
            {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
            {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false},
            {"abc@gmail.com.aa.au", false}});
		
	}
	
	@Test
	public void givenAllEmails() {
		UserRegistration user = new UserRegistration();
		boolean actual = user.Email(emailIDs);
		Assert.assertEquals(expectedResult, actual);
	}
	
}

