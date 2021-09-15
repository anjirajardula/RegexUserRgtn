package com.bridgz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration extends UserDetails {
    static Scanner scanner = new Scanner(System.in);
    static String firstName, lastName, emailId;

    public static void main(String[] args) {
        userFirstName();
        userLastName();
        userEmailId();
        System.out.println(firstName + " " + lastName + '\n' + emailId);
    }

    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        UserDetails.firstname(firstName);
    }

    public static void userLastName() {
        System.out.println("Enter your Last Name");
        lastName = scanner.next();
        UserDetails.lastname(lastName);
    }

    public static void userEmailId() {
        System.out.println("Enter your EmailId");
        emailId = scanner.next();
        UserDetails.emailid(emailId);
    }
}
