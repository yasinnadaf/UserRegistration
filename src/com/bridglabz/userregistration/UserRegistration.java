package com.bridglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validPhoneNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$",phoneNumber);

        if(number){
            System.out.println("Phone number is correct");
        }
        else{
            System.out.println("Phone number is incorrect");
        }

    }

    public static void main(String[] args) {
        UserRegistration getNumber = new UserRegistration();
        getNumber.validPhoneNumber();
    }
}
