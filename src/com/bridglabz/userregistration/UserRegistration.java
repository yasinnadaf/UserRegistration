package com.bridglabz.userregistration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    public void validFirstName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name : ");
        String firstName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-z]{3,}$", firstName);

        if (fName) {
            System.out.println("firstname is correct ");
        } else {
            System.out.println("firstname is incorrect ");
        }
    }

     public static void main(String[] args) {
         UserRegistration userRegistration = new UserRegistration();
         userRegistration.validFirstName();
     }

}
