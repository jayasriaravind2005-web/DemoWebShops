package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.RegisterPage;

public class TC_02_RegisterDuplicate extends BaseClass 
{

    @Test
    public void registerDuplicateUser() {

        RegisterPage register = new RegisterPage(driver);

        // Navigate to Register page
        register.clickRegister();

        // Enter user details
        register.selectGender("Male");
        register.enterFirstName("Aravindh");
        register.enterLastName("L R");
        register.enterEmail("aravindh@gmail.com");   // Already registered email
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
    }
    }
        
    