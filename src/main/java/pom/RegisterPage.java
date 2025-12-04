package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ====== Locators ======
	@FindBy(xpath = "//a[text()='Register']")
	WebElement registerLink;

	@FindBy(id="gender-male")
	WebElement genderMale;

	@FindBy(id = "gender-female")
	WebElement genderFemale;

	@FindBy(id = "FirstName")
	WebElement firstName;

	@FindBy(id = "LastName")
	WebElement lastName;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(id = "register-button")
	WebElement registerButton;

	@FindBy(xpath = "//div[contains(@class,'validation-summary-errors')]")
	WebElement duplicateEmailError;

	// ====== Actions ======

	public void clickRegister() {
		registerLink.click();
	}
	

	public void selectGender(String gender) {
		if (gender.equalsIgnoreCase("Male")) {
			genderMale.click();
		} else {
			genderFemale.click();
		}
	}

	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void enterConfirmPassword(String pass) {
		confirmPassword.sendKeys(pass);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}

	public String getDuplicateErrorMessage() {
		return duplicateEmailError.getText();
	}
}
