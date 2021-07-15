package com.bridgelabz.userregistration;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class JunitUserRegistrationTest
{
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.firstName("Nithin");
        Assertions.assertTrue(isValid);
    }
   @Test
    public void givenFirstName_WhenNull_ShouldReturnException()  {
       try {
           UserValidator userValidator = new UserValidator();
           exceptionRule.expect(UserValidatorException.class);
           exceptionRule.expectMessage("first name can not be null");
           boolean isValid = userValidator.firstName(null);
       } catch (UserValidatorException e) {
           e.printStackTrace();
       }
   }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.lastName("Krishna");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnException()  {
        try {
            UserValidator userValidator = new UserValidator();
            exceptionRule.expect(UserValidatorException.class);
            exceptionRule.expectMessage("Last name can not be null");
            boolean isValid = userValidator.lastName(null);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.userEmail("sathramnithin@gmail.com");
        Assertions.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenNull_ShouldReturnException()
    {
        try {
            UserValidator userValidator = new UserValidator();
            exceptionRule.expect(UserValidatorException.class);
            exceptionRule.expectMessage("email can not be null");
            boolean isValid = userValidator.userEmail(null);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.userMobileNumber("91 7986985868");
        Assertions.assertTrue(isValid);
    }
    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnException()
    {
        try {
            UserValidator userValidator = new UserValidator();
            exceptionRule.expect(UserValidatorException.class);
            exceptionRule.expectMessage("mobile number can not be null");
            boolean isValid = userValidator.userMobileNumber(null);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.userPassWord("nithinkR1@");
        Assertions.assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenOneCapital_ShouldReturnTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean isValid = userValidator.userPassWord("nithinKr1@");
        Assertions.assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenNull_ShouldReturnException()
    {
        try {
            UserValidator userValidator = new UserValidator();
            exceptionRule.expect(UserValidatorException.class);
            exceptionRule.expectMessage("password can not be null");
            boolean isValid = userValidator.userPassWord(null);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }
}
