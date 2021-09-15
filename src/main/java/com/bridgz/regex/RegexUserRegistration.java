package com.bridgz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static void main(String[] args) {
        System.out.println("Enter Your First Name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
