package com.bridgelabz.userregistration;
@FunctionalInterface
interface ValidateUserEntry
{
    public boolean validateEntry(String pattern,String name);
    static void printTrueOrFalse(String pattern,String name,String function,ValidateUserEntry validate)
    {
        System.out.println("Result of :"+function+" function is "+validate.validateEntry(pattern,name));
    }
}
