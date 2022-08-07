package com.bridglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        UserRegistration check = new UserRegistration();
        check.validEmail();
    }

    public static void validEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Email: ");
        String email = sc.nextLine();

        boolean validatePassword = Pattern.matches("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$",email);
        if(validatePassword){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
    }
}
