package com.bridgelabz;

import java.util.regex.Pattern;

public class CheckValidation {

	// Method For First name
	public boolean firstName(String firstName) {
		String match = "^[A-Z]{1}[a-z]{3,}$";
		boolean check = Pattern.matches(match,firstName);
		return check;
	}

	// Method For Last Name
	public boolean lastName(String lastName) {
		String match = "^[A-Z]{1}[a-z]{3,}$";
		boolean check = Pattern.matches(match,lastName);
		return check;
	}

	// Method For Email
	public boolean email(String email) {
		String match = "^[A-Za-z0-9.]+@[a-zA-Z.]{2,}+$";
		boolean check = Pattern.matches(match,email);
		return check;
	}
}
