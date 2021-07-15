package com.bridgelabz.userregistration;
import java.util.regex.Pattern;
public class UserValidator
{
    static UserDetails userDetails = new UserDetails();
    /**
     * asking user to enter the first name and setting the firstname.
     */
    public boolean firstName(String firstName)  {
        try
        {
            ValidateUserEntry validate = (pattern, name) -> Pattern.compile(pattern).matcher(name).matches();
            String pattern = "^[A-Z]{1}[a-z]{2,}$";
            boolean firstNameMatcher = validate.validateEntry(pattern,firstName);
            ValidateUserEntry.printTrueOrFalse(pattern,firstName,"firstName",validate);
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
            ValidateUserEntry validate = (pattern, name) -> Pattern.compile(pattern).matcher(name).matches();
            String pattern = "^[A-Z]{1}[a-z]{2,}$";
            boolean lastNameMatcher = validate.validateEntry(pattern,lastName);
            ValidateUserEntry.printTrueOrFalse(pattern,lastName,"lastName",validate);
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
            ValidateUserEntry validate = (pattern, name) -> Pattern.compile(pattern).matcher(name).matches();
            String pattern = "^[a-z]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$";
            boolean emailMatcher = validate.validateEntry(pattern,emailId);
            ValidateUserEntry.printTrueOrFalse(pattern,emailId,"emailId",validate);
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
            ValidateUserEntry validate = (pattern, name) -> Pattern.compile(pattern).matcher(name).matches();
            String pattern = "^[0-9]\\d{1}\\s[789]\\d{9}$";
            boolean mobileNumberMatcher = validate.validateEntry(pattern,mobileNumber);
            ValidateUserEntry.printTrueOrFalse(pattern,mobileNumber,"mobileNumber",validate);
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
            ValidateUserEntry validate = (pattern, name) -> Pattern.compile(pattern).matcher(name).matches();
            String pattern = "^(?=.*[0-9])(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
            boolean passwordMatcher = validate.validateEntry(pattern,password);
            ValidateUserEntry.printTrueOrFalse(pattern,password,"password",validate);
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
