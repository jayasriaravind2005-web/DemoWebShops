package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.ProductPage;
import pom.CartPage;

public class TC_06_AddToCart extends BaseClass {

    @Test
    public void addProductToCart() throws InterruptedException {

        ProductPage pp = new ProductPage(driver);
        CartPage cp = new CartPage(driver);

        // Step 1: Click Electronics
        pp.clickElectronics();
        Thread.sleep(2000);

        // Step 2: Click Camera Category
        pp.clickCameraCategory();
        Thread.sleep(2000);

        // Step 3: Add Product to Cart
        pp.clickAddToCart();
        Thread.sleep(3000);

        // Step 4: Validate cart quantity changes
        String qty = pp.getCartQty();    // e.g., "(1)"
        Assert.assertTrue(qty.contains("1"), "Product NOT added to cart!");

        // Step 5: Open Shopping Cart
        cp.openShoppingCart();
        Thread.sleep(2000);

        // Step 6: Verify product is inside cart
        String productName = cp.getProductName();
        Assert.assertTrue(productName.length() > 0, "No product found in cart!");

        System.out.println("TC_06 Passed: Product added to cart successfully!");
    }
}
