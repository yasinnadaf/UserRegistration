package com.bridglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        UserRegistration check = new UserRegistration();
        check.validPassword();
    }


    public static void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^[a-z]{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("passward is invalid");
        }
    }
}
