package com.JunitEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean firstName(String firstName) {
		String Regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
		
	}
	
}
