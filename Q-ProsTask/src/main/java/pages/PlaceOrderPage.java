package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage{
    public PlaceOrderPage(WebDriver driver) {super(driver);}
    private By nameTxt = By.id("name");
    private By countryTxt = By.id("country");
    private By cityTxt = By.id("city");
    private By creditCardNo = By.id("card");
    private By monthTxt = By.id("month");
    private By yearTxt = By.id("year");
    private By purchaseBtn = By.xpath("//button[contains(text(),'Purchase')]");
    private By thankYouTxt = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
    public void placeOrder(String name,String country,String city,String creditCard,String month,String year){
        findElement(nameTxt).sendKeys(name);
        findElement(countryTxt).sendKeys(country);
        findElement(cityTxt).sendKeys(city);
        findElement(creditCardNo).sendKeys(creditCard);
        findElement(monthTxt).sendKeys(month);
        findElement(yearTxt).sendKeys(year);
        scrollDown();
        findElement(purchaseBtn).click();}
    public boolean isThankYouTxtExists() {
        return findElement(thankYouTxt).isDisplayed();}
}