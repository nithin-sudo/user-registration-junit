package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserValidatorMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first name:");
        String firstName = scanner.next();
        UserValidator userValidator = new UserValidator();
        userValidator.printUserDetails();
        System.out.print(userValidator.firstName(firstName));
    }
}
