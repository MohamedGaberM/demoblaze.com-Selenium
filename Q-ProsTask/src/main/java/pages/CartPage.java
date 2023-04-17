package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {super(driver);}
    private By deleteBtn = By.linkText("Delete");
    private By placeOrderBtn = By.xpath("//button[contains(text(),'Place Order')]");

    public void clickOnDeleteBtn(){
        findElement(deleteBtn).click();}
    public boolean isProductExists() {
        return findElement(deleteBtn).isDisplayed();}
    public PlaceOrderPage clickOnPlaceOrderBtn(){
        findElement(placeOrderBtn).click();
        return new PlaceOrderPage(driver);
    }
}