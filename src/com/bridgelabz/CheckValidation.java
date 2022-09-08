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

	// Method For Phone No.
	public boolean phone_no(String phoneNo) {
		String match = "[0-9\s]{3}+[6789]{1}+[0-9]{9}+$";
		boolean check = Pattern.matches(match,phoneNo);
		return check;
	}

	// Method For Password Contain Minimum Eight Character
	public boolean password_case_1(String password) {
		String match = "^.{8,}+$";
		boolean check = Pattern.matches(match,password);
		return check;
	}
}	