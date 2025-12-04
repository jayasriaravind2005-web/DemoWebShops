package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "removefromcart")
    private WebElement removeItemCheck;

    @FindBy(name = "updatecart")
    private WebElement updateCart;

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    public void proceedToCheckout(){
        checkoutBtn.click();
    }

    @FindBy(xpath = "//span[@class='cart-label']")
    private WebElement shoppingCartLink;

    @FindBy(xpath = "//td[@class='product']")
    private WebElement cartProductName;

    // Open shopping cart
    public void openShoppingCart() {
        shoppingCartLink.click();
    }

    // Get product name in cart
    public String getProductName() {
        return cartProductName.getText();
    }
}
