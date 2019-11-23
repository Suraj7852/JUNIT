import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    private String firstName="^[A-Z][a-z]{3,}";
    private String lastName="^[A-Z][a-z]{3,}";
    private String email="(\\w+)([+_-.]\\w+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$";
    private String mobileNumber="^[0-9]{2}([ ])?[6-9]{10}";
    private String password="((?=.*[0-9])(?=.*[a-z]?)(?=.*[A-Z])((?=.*[@#$%])).{8,})";
    public boolean validate_First_Name(String firstName) {
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = firstNamePattern.matcher(firstName);
        if(match.matches())
            return true;
        else
            return false;
    }

    public boolean validate_Last_Name(String lastName) {
        Pattern lastNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = lastNamePattern.matcher(lastName);
        if(match.matches())
            return true;
        else
            return false;
    }

    public boolean validate_Email(String email) {
        Pattern emailPattern = Pattern.compile("^(\\w+)([+,_,-,.]\\w+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$");
        Matcher match = emailPattern.matcher(email);
        if(match.matches())
            return true;
        else
            return false;
    }

    public boolean validate_MobileNumber(String mobileNumber) {
        Pattern mobilePattern = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}");
        Matcher match = mobilePattern.matcher(mobileNumber);
        if(match.matches())
            return true;
        else
            return false;
    }

    public boolean validate_Password(String password) {
        Pattern passwordPattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z]?)(?=.*[A-Z])((?=.*[@#$%])).{8,})");
        Matcher match = passwordPattern.matcher(password);
        if(match.matches())
            return true;
        else
            return false;
    }
}
