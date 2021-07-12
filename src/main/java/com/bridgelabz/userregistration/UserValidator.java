package com.bridgelabz.userregistration;
import java.util.regex.*;
public class UserValidator
{
    UserDetails userDetails = new UserDetails();
    /**
     * asking user to enter the first name and setting the firstname.
     */
    public boolean firstName(String firstName)
    {

        boolean firstNameMatcher = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
        if (firstNameMatcher == true)
        {
            userDetails.setFirstName(firstName);
        }
        else
        {
            System.err.println("you have entered wrong input First name starts with Cap and has minimum 3 characters");
            System.out.println();
        }
        return firstNameMatcher;
    }
    /**
     * asking user to enter the last name and setting the lastname.
     */
    public boolean lastName(String lastName)
    {

        boolean lastNameMatcher = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
        if (lastNameMatcher == true)
        {
            userDetails.setLastName(lastName);
        }
        else
        {
            System.err.println("you have entered wrong input last name starts with Cap and has minimum 3 characters");
            System.out.println();
        }
        return lastNameMatcher;
    }
    /**
     * asking user to enter the email and setting the email.
     */
    public boolean userEmail(String email)
    {
        boolean emailMatcher = Pattern.compile("^[a-z]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(email).matches();
        if(emailMatcher == true)
        {
            userDetails.setEmail(email);
        }
        else
        {
            System.err.println("you have entered wrong input E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions ");
            System.out.println();
        }
        return emailMatcher;
    }
    /**
     * asking user to enter the mobile number and setting the mobile number.
     */
    public boolean userMobileNumber(String mobileNumber)
    {
        boolean mobileNumberMatcher = Pattern.compile("^[0-9]\\d{1}\\s[789]\\d{9}$").matcher(mobileNumber).matches();
        if(mobileNumberMatcher == true)
        {
            userDetails.setMobileNumber(mobileNumber);
        }
        else
        {
            System.err.println("you have entered wrong input Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number");
            System.out.println();
        }
        return mobileNumberMatcher;
    }
    /**
     * asking user to enter the password and setting the password.
     */
    public boolean userPassWord(String password)
    {
        boolean passwordMatcher = Pattern.compile("^[a-z]{8}$").matcher(password).matches();
        if(passwordMatcher == true)
        {
            userDetails.setPassword(password);
        }
        else
        {
            System.err.println("you have entered wrong input User need to follow pre -defined Password rules minimum 8  Characters ");
            System.out.println();
        }
        return passwordMatcher;
    }
    /**
     * printing the user details.
     */
    public void printUserDetails()
    {
        if(userDetails.getFirstName()!=null)
        {
            System.out.print(userDetails);
        }
    }
}
