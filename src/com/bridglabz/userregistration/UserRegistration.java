package com.bridglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public static void main(String[] args) {
        UserRegistration mail = new UserRegistration();
        mail.validEmailId();

    }
}
