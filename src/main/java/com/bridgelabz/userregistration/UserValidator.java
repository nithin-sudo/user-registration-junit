package com.bridgelabz.userregistration;
import java.util.regex.*;
public class UserValidator
{
    static UserDetails userDetails = new UserDetails();
    /**
     * asking user to enter the first name and setting the firstname.
     */
    public boolean firstName(String firstName)  {
        try
        {
            boolean firstNameMatcher = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
            if (firstNameMatcher == true) {
                userDetails.setFirstName(firstName);
            } else {
                System.err.println("you have entered wrong input First name starts with Cap and has minimum 3 characters");
                System.out.println();
            }
            return firstNameMatcher;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidatorException("first name can not be null");
        }

    }
    /**
     * asking user to enter the last name and setting the lastname.
     */
    public boolean lastName(String lastName)
    {
        try {
            boolean lastNameMatcher = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
            if (lastNameMatcher == true) {
                userDetails.setLastName(lastName);
            } else {
                System.err.println("you have entered wrong input last name starts with Cap and has minimum 3 characters");
                System.out.println();
            }
            return lastNameMatcher;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidatorException("last name can not be null");
        }
    }
    /**
     * asking user to enter the email and setting the email.
     */
    public static boolean userEmail(String emailId)
    {
        try {
            boolean emailMatcher = Pattern.compile("^[a-z]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(emailId).matches();
            if (emailMatcher == true) {
                userDetails.setEmail(emailId);
            } else {
                System.err.println("you have entered wrong input E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions ");
                System.out.println();
            }
            return emailMatcher;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidatorException("email can not be null");
        }
    }
    /**
     * asking user to enter the mobile number and setting the mobile number.
     */
    public boolean userMobileNumber(String mobileNumber)
    {
        try {
            boolean mobileNumberMatcher = Pattern.compile("^[0-9]\\d{1}\\s[789]\\d{9}$").matcher(mobileNumber).matches();
            if (mobileNumberMatcher == true) {
                userDetails.setMobileNumber(mobileNumber);
            } else {
                System.err.println("you have entered wrong input Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number");
                System.out.println();
            }
            return mobileNumberMatcher;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidatorException("Mobile number can not be null");
        }
    }
    /**
     * asking user to enter the password and setting the password.
     */
    public boolean userPassWord(String password)
    {
        try {
            boolean passwordMatcher = Pattern.compile("^(?=.*[0-9])(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,20}$").matcher(password).matches();
            if (passwordMatcher == true) {
                userDetails.setPassword(password);
            } else {
                System.err.println("you have entered wrong input User need to follow pre -defined Password rules minimum 8  Characters ");
                System.out.println();
            }
            return passwordMatcher;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidatorException("password can not be null");
        }
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
