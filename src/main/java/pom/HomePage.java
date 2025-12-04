package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Log in")
    private WebElement loginLink;

    @FindBy(id = "small-searchterms")
    private WebElement searchBox;

    @FindBy(css = "input[value='Search']")
    private WebElement searchButton;

    public void clickRegister() {
        registerLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }
    @FindBy(linkText = "Log out")
    private WebElement logoutLink;


    public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchButton.click();
    }

	public boolean isLoginButtonDisplayed1() {
		// TODO Auto-generated method stub
		return false;
	}
	public void clickLogout() {
	    logoutLink.click();
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink1;


	public boolean isLoginButtonDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	 

}
