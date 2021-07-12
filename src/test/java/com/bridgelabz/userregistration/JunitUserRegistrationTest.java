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
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.firstName("Krishna");
        Assertions.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.userEmail("sathramnithin@gmail.com");
        Assertions.assertTrue(isValid);
    }
}
