package com.model;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidation {
	public static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	
	public static Predicate<String> validateUserName = name -> Pattern.matches(FIRST_NAME, name);
	Scanner sc = new Scanner(System.in);

    public void validateFirstName() {
        System.out.println("Enter First Name :");
        String Name = sc.nextLine();
        if (validateUserName.test(Name))
            System.out.println("First Name is Vaild");
        else {
            System.out.println("First Name is Not Vaild");
            System.out.println("First name should starts with Capital letter and has minimum 3 characters");
        }
		
    }

}
