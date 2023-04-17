package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
public class BasePage {
    protected WebDriver driver;
    private final Duration TIMEOUT = Duration.ofSeconds(40);
    private final Duration POLLING_TIMEOUT = Duration.ofMillis(500);
    public BasePage(WebDriver driver) {this.driver = driver;}
    protected WebElement findElement(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(TIMEOUT)
                .pollingEvery(POLLING_TIMEOUT)
                .ignoring(NoSuchElementException.class);
        return wait.until(d -> d.findElement(locator));}

    protected void alertWait() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(TIMEOUT)
                .pollingEvery(POLLING_TIMEOUT)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.alertIsPresent());}

    protected boolean elementVisible(By locator) {
        boolean flag;
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(TIMEOUT)
                    .pollingEvery(POLLING_TIMEOUT)
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            flag = true;
        } catch (Exception ex) {
            flag = false;
        }
        return flag;}
    public String getAlertMessage(){
        alertWait();
        return driver.switchTo().alert().getText();}
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(("window.scrollBy(0,350)"), "");
    }
}