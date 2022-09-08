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
		userRegistration.checkValidityOfFirstName(firstName);

		System.out.println("Enter Last Name : ");
		String lastName = scan.nextLine();
		userRegistration.checkValidityOfLastName(lastName);
	}

	public void checkValidityOfFirstName(String firstName) {

		// Regex Pattern for First Name
		String checkFirstName = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(checkFirstName);

		if(pattern.matcher(firstName).matches())
			System.out.println("Valid First Name ");
		else
			System.out.println("InValid First Name ");
	}

	public void checkValidityOfLastName(String lastName) {

		// Regex Pattern for Last Name
		String checkLastName = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(checkLastName);

		if(pattern.matcher(lastName).matches())
			System.out.println("Valid Last Name ");
		else
			System.out.println("Invalid Last Name ");
	}
}