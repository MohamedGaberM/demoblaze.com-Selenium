package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {super(driver);};
    private By signUpBtn = By.linkText("Sign up");
    private By logInBtn = By.linkText("Log in");
    private By phonesCategoryBtn = By.linkText("Phones");
    private By laptopsCategoryBtn = By.linkText("Laptops");
    private By monitorsCategoryBtn = By.linkText("Monitors");
    private By samsungGalaxyS6PhoneItem = By.linkText("Samsung galaxy s6");
    private By sonyVaioI5LaptopItem = By.linkText("Sony vaio i5");
    private By appleMonitorItem = By.linkText("Apple monitor 24");
    public SignUpPage clickOnSignUpBtn(){
        findElement(signUpBtn).click();
        return new SignUpPage(driver);}
    public LoginPage clickOnLoginBtn(){
        findElement(logInBtn).click();
        return new LoginPage(driver);}
    public LoginPage clickOnPhonesCategoryBtn(){
        findElement(phonesCategoryBtn).click();
        return new LoginPage(driver);}
    public LoginPage clickOnLaptopsCategoryBtn(){
        findElement(laptopsCategoryBtn).click();
        return new LoginPage(driver);}
    public LoginPage clickOnMonitorsCategoryBtn(){
        findElement(monitorsCategoryBtn).click();
        return new LoginPage(driver);}
    public ProductPage clickOnSamsungPhoneProduct(){
        findElement(samsungGalaxyS6PhoneItem).click();
        return new ProductPage(driver);}
    public boolean isPhoneItemExists() {
        elementVisible(samsungGalaxyS6PhoneItem);
        return findElement(samsungGalaxyS6PhoneItem).isDisplayed();
    }
    public boolean isLaptopItemExists() {
        return findElement(sonyVaioI5LaptopItem).isDisplayed();}
    public boolean isMonitorItemExists() {
        return findElement(appleMonitorItem).isDisplayed();}
}