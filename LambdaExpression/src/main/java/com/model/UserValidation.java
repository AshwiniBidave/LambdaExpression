package com.model;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidation {
	public static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public static String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public static String REGEX_EMAIL ="[a-z0-9@.]*";
	
	public static Predicate<String> validateUserName = name -> Pattern.matches(FIRST_NAME, name);
	public static Predicate<String> validateEmail = email -> Pattern.matches(REGEX_EMAIL, email);

	Scanner sc = new Scanner(System.in);

    public void validateFirstName() {
        System.out.println("Enter First Name :");
        String Name = sc.nextLine();
        if (validateUserName.test(Name))
            System.out.println("First Name is Vaild");
        else {
            System.out.println("First Name is Not Vaild");
            System.out.println("First name should starts with Capital letter and has minimum 3 characters");
        }}
        public void validateLastName() {
            System.out.println("Enter Last Name :");
            String LastName = sc.nextLine();
            if (validateUserName.test(LastName)) {
                System.out.println("Last name is Vaild");
            }
            else {
                System.out.println("Last name is Not Vaild");
                System.out.println("Last name should starts with Capital letter and has minimum 3 characters");
            }
        }
        public void validateEmail() {
            System.out.println("Enter email :");
            String email = sc.nextLine();
            if (validateEmail.test(email))
                System.out.println("email is Vaild");
            else
                System.out.println("email is Not Vaild");
        }
		
    }


