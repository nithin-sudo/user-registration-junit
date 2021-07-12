package com.bridgelabz.userregistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest
{
   @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.firstName("Nithin");
        Assertions.assertTrue(isValid);
    }
}
