import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void passwordShouldBeMinimum8Charactor() {
        boolean result = userRegistration.validate_Password("asdgwqer");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordShouldBeMinimum8CharactorAndAtlest1UpperCase() {
        boolean result = userRegistration.validate_Password("Asdgwqer");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordShouldBeMinimum8CharactorAndAtlest1UpperCaseAnd1Numeric() {
        boolean result = userRegistration.validate_Password("Asdgwqer12");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordShouldBeMinimum8CharactorAndAtlest1UpperCaseAnd1NumericAndSpecialCharactor() {
        boolean result = userRegistration.validate_Password("Asdg@qer12");
        Assert.assertTrue(result);
    }
}
