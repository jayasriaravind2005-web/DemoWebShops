package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04_InvalidLogin {

    public static void main(String[] args) throws InterruptedException {

        // Set ChromeDriver path (optional for Selenium 4.6+)
        WebDriver driver = new ChromeDriver();

        // Step 1: Open application
        driver.get("https://demowebshop.tricentis.com/login");   // Replace with your URL
        driver.manage().window().maximize();

        // Step 2: Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@gmail.com");

        // Step 3: Enter invalid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567");

        // Step 4: Click Login button
        driver.findElement(By.xpath("//input[@type='submit'])[2]")).click();

        Thread.sleep(2000); // Wait for error message to appear

        // Step 5: Validate error message
        String errorMsg = driver.findElement(By.xpath("//span['The credentials provided are incorrect'][18]")).getText();

        if (errorMsg.contains("Invalid username or password")) {
            System.out.println("TC_04 Passed — Proper error message displayed");
        } else {
            System.out.println("TC_04 Failed — Error message not displayed correctly");
        }

        // Close browser
         
    }
}
