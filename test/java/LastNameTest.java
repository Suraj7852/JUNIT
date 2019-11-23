import org.junit.Assert;
import org.junit.Test;

public class LastNameTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenLastnameWhenCorrectShouldBeMoreThan3Character() {
        boolean result = userRegistration.validate_Last_Name("Kumar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameShouldNotBeSmallLetters() {
        boolean result = userRegistration.validate_Last_Name("kumar");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameLengthShouldNotBeLessThan3Character() {
        boolean result = userRegistration.validate_Last_Name("Ku");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameShouldNotContainsNumericValue() {
        boolean result = userRegistration.validate_Last_Name("Kumar123");
        Assert.assertFalse(result);
    }
}
