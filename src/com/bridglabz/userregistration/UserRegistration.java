package com.bridglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public void validLastName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last name : ");
        String lastName = sc.nextLine();

        boolean lName = Pattern.matches("^[A-Z]+[a-z]{3,}$", lastName);

        if (lName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }

    }
        public static void main (String[]args){
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validLastName();
        }

}