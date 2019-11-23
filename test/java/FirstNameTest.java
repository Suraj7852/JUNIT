import org.junit.Assert;
import org.junit.Test;

public class FirstNameTest
{
    UserRegistration userRegistration = new UserRegistration();
    
    //    Test For First Name
    @Test
    public void givenFirstnameWhenCorrectShouldBeMoreThan3Character() {
        boolean result = userRegistration.validate_First_Name("Suraj");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameShouldNotBeSmallLetters() {
        boolean result = userRegistration.validate_First_Name("suraj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameLengthShouldNotBeLessThan3Character() {
        boolean result = userRegistration.validate_First_Name("Su");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameShouldNotContainsNumericValue() {
        boolean result = userRegistration.validate_Last_Name("Suraj123");
        Assert.assertFalse(result);
    }




    @Test
    public void givenEmailShouldContainsAtSign() {
        boolean result = userRegistration.validate_Email("suraj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailShouldNotStartWithDot() {
        boolean result = userRegistration.validate_Email("abc@.com.my");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailIsValid() {
        Assert.assertTrue(userRegistration.validate_Email("abc@yahoo.com"));
        Assert.assertTrue(userRegistration.validate_Email("abc-100@yahoo.com"));
        Assert.assertTrue(userRegistration.validate_Email("abc.100@yahoo.com"));
//• 6. abc@1.com,
//• 7. abc@gmail.com.com
//• 8. abc+100@gmail.com
        Assert.assertTrue(userRegistration.validate_Email("abc111@abc.com"));
        Assert.assertTrue(userRegistration.validate_Email("abc-100@abc.net"));
        Assert.assertTrue(userRegistration.validate_Email("abc.100@abc.com.au"));
        Assert.assertTrue(userRegistration.validate_Email("abc@1.com"));
//        Assert.assertTrue(userRegistration.validate_Email("abc@yahoo.com"));
//        Assert.assertTrue(userRegistration.validate_Email("abc@yahoo.com"));
//        Assert.assertTrue(result);

    }

}
