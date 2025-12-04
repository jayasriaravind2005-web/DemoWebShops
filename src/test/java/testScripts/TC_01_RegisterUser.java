package testScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.RegisterPage;

  class TC_01_RegisterUser    {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void registerUser() throws InterruptedException {
        // Your registration steps here
    	RegisterPage rp = new RegisterPage(driver);
    	rp.clickRegister();
    	Thread.sleep(2000);
    	rp.selectGender("Male");
    	Thread.sleep(2000);
    	rp.enterFirstName("Aravindh");
    	Thread.sleep(2000);
    	rp.enterLastName("L R");
    	Thread.sleep(2000);
    	rp.enterEmail("abc@gmail.com");
    	Thread.sleep(2000);
    	rp.enterPassword("123456");
    	Thread.sleep(2000);
    	rp.enterConfirmPassword("123456");
    	Thread.sleep(2000);
    	rp.clickRegisterButton();
    }
    

    @AfterMethod
    public void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }
}
