import org.junit.Assert;
import org.junit.Test;

public class MobileNumberTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void mobileNumberShouldNotBeSmallerThan10DigitWithCounteryCode() {
        boolean result = userRegistration.validate_MobileNumber("91 773942730");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumberShouldBeGreaterThan10DigitWithCounteryCode() {
        boolean result = userRegistration.validate_MobileNumber("91 0009657000");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumberShouldNotBe2SpaceInBetweenWithCounteryCode() {
        boolean result = userRegistration.validate_MobileNumber("91   0009657000");
        Assert.assertFalse(result);
    }
}
