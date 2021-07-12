package com.bridgelabz.userregistration;

public class UserDetails
{
    private String firstName;
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    @Override
    public String toString()
    {
        return "UserDetails{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
