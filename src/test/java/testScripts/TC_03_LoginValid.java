package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.LoginPage;

public class TC_03_LoginValid extends BaseClass {

    @Test
    
    public void loginWithValidCredentials() throws Exception {
        Thread.sleep(2000);


        LoginPage login = new LoginPage(driver);

        // Step 1: Click "Log in" on homepage
        driver.findElement(org.openqa.selenium.By.linkText("Log in")).click();

        // Step 2: Use POM login() method
        login.login("admin123@email.com", "12345678");

        // Step 3: Validate login success
        String expectedUrl = "https://demowebshop.tricentis.com/";
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "❌ Login failed!");
        Thread.sleep(2000);
        System.out.println("✅ Login successful for valid user!");
        Thread.sleep(2000);

    }
}
