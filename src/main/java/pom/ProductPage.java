
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Electronics')]")
    private WebElement electronicsLink;

    @FindBy(xpath = "//a[contains(text(),'Camera, photo')]")
    private WebElement cameraCategory;

    @FindBy(xpath = "//input[@value='Add to cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//span[@class='cart-qty']")
    private WebElement cartQty;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Click Electronics
    public void clickElectronics() {
        electronicsLink.click();
    }

    // Click Camera Category
    public void clickCameraCategory() {
        cameraCategory.click();
    }

    // Click Add to Cart
    public void clickAddToCart() {
        addToCartBtn.click();
    }

    // Get Cart Qty text
    public String getCartQty() {
        return cartQty.getText();  // Example: "(1)"
    }
}
