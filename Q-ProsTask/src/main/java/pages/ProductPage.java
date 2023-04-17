package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {super(driver);}
    private By addToCartBtn = By.linkText("Add to cart");
    private By cartBtn = By.linkText("Cart");
    public void clickOnAddToCartBtn() {
        findElement(addToCartBtn).click();
    }
    public CartPage clickOnCartBtn() {
        findElement(cartBtn).click();
        return new CartPage(driver);}
}