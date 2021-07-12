package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserValidatorMain
{
    public static void main(String[] args)
    {
        UserValidator userValidator = new UserValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first name:");
        String firstName = scanner.next();
        System.out.print(userValidator.firstName(firstName));
        System.out.print("enter the last name:");
        String lastName = scanner.next();
        System.out.print(userValidator.lastName(lastName));
        System.out.print("enter the email:");
        String email = scanner.next();
        System.out.print(userValidator.userEmail(email));
        userValidator.printUserDetails();
    }
}
