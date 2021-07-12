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
