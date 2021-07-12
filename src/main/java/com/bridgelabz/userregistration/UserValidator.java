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
