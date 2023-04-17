package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {super(driver);}
    private By inputTextUsername = By.cssSelector("#sign-username");
    private By inputTextPassword = By.cssSelector("#sign-password");
    private By signUpBtn = By.xpath("//button[contains(text(),'Sign up')]");

    public void signUp(String username, String password) {
        findElement(inputTextUsername).sendKeys(username);
        findElement(inputTextPassword).sendKeys(password);
        findElement(signUpBtn).click();
    }
}