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
	public boolean lastName(String lastName) {
		String Regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
		
	}
	
public boolean Email(String email) {
		String Regex =  "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	public boolean Mobileno(String mobileno) {
		String Regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(mobileno);
		return matcher.matches();
		
	}
	public boolean password(String password) {
		String Regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
		
	}
	public boolean emailIds(String emailsIds) {
		String Regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		Pattern pattern = Pattern.compile(Regex);
		Matcher matcher = pattern.matcher(emailsIds);
		return matcher.matches();
		
	}
}
