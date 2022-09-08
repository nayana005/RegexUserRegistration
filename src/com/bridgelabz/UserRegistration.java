package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		System.out.println("Welcome To User Registration Program !");
		System.out.println("Enter The First Name :");
		Scanner scan = new Scanner(System.in);
		String firstName = scan.nextLine();
		// Object
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.checkValidity(firstName);
	}

	public void checkValidity(String firstName) {

		// Regex Pattern
		String checkFirstName = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(checkFirstName);

		if(pattern.matcher(firstName).matches()) {
			System.out.println("Valid ! ");
		}
		else {
			System.out.println("InValid ! ");
		}
	}
}
