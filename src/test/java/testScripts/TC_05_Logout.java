package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.LoginPage;
import pom.HomePage;

public class TC_05_Logout extends BaseClass {

    @Test
    public void logoutTest() {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        // Step 1: Login
        login.clickLoginMenu();
        login.enterEmail("yourEmail@gmail.com");
        login.enterPassword("Test@123");
        login.clickLoginButton();

        // Step 2: Click Logout
        home.clickLogout();

        // Step 3: Validate logout by checking Login link displayed again
        boolean loginLinkVisible = home.isLoginButtonDisplayed();

        Assert.assertTrue(loginLinkVisible, "Logout failed! Login button not visible after logout.");

        System.out.println("TC_05 Passed — User logged out successfully!");
    }
}
