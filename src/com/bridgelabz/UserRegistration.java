package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {

		String[] allEmail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
				"abc+100@gmail.com", "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
				"abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
				"abc..2002@gmail.com", "abc..2002@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au"};

		System.out.println("Welcome To User-Registration Program !");
		Scanner scan = new Scanner(System.in);

		// Object
		CheckValidation checkValidation = new CheckValidation();

		// For First Name
		System.out.println("\nEnter First Name : ");
		String fName = scan.nextLine();
		boolean checkFirstName = checkValidation.firstName(fName);

		if(checkFirstName)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");

        // For Last Name
        System.out.println("\nEnter Last Name : ");
        String lName = scan.nextLine();
        boolean checkLastName = checkValidation.lastName(lName);

        if(checkLastName)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");

        // For Email
        System.out.println("\nEnter Email Id : ");
        String email = scan.nextLine();
        boolean checkEmail = checkValidation.email(email);

        if(checkEmail)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

        // For Phone-no
        System.out.println("\nEnter Phone No With Country Code : MUST GIVE THE SPACE BETWEEN COUNTRY CODE AND PHONE NO");
        String phone_no = scan.nextLine();
        boolean check_phone_no = checkValidation.phone_no(phone_no);

        if(check_phone_no)
            System.out.println("Valid Phone No");
        else
            System.out.println("Invalid Phone No");

        // For Password 
        System.out.println("\nEnter your Password ");
        String password = scan.nextLine();
        boolean check_password_case = checkValidation.password_case_5(password);

        if(check_password_case)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

        // For All Email Check
        System.out.println("\nChecking Validity of all possible email id ");

        for(String str : allEmail) {
            boolean checkAllEmail = checkValidation.email(str);
            if(checkAllEmail)
                System.out.println("Valid Email");
            else
                System.out.println("Invalid Email");
        }
    }
}
