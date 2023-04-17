package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {super(driver);}
    private By userNameTxt = By.id("loginusername");
    private By loginPasswordTxt = By.id("loginpassword");
    private By loginBtn = By.xpath("//button[contains(text(),'Log in')]");
    private By nameOfUserTxt = By.cssSelector("#nameofuser");
    public void login(String username, String password) {
        findElement(userNameTxt).sendKeys(username);
        findElement(loginPasswordTxt).sendKeys(password);
        findElement(loginBtn).click();}
    public String getNameOfUserTxt(){
        elementVisible(nameOfUserTxt);
        return findElement(nameOfUserTxt).getText();}
}