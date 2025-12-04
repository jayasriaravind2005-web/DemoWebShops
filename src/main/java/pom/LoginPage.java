package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.LoginPage;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    private WebElement emailTxt;

    @FindBy(id = "Password")
    private WebElement passwordTxt;

    @FindBy(css = "input[value='Log in']")
    private WebElement loginBtn;

    public void login(String email, String password){
        emailTxt.sendKeys(email);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }




public void clickLoginMenu() { WebElement loginMenu = null;
loginMenu.click(); }

public void enterEmail(String email) { WebElement emailField = null;
emailField.sendKeys(email); }

public void enterPassword(String pwd) { WebElement passwordField = null;
passwordField.sendKeys(pwd); }

public void clickLoginButton() { loginBtn.click();}
}



