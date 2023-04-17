package tests;

import com.github.javafaker.Faker;
import pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import static staticData.StaticData.*;

public class BaseTest {
    public BaseTest(){ }
    public HomePage homePage;
    protected WebDriver driver;
    Faker faker = new Faker();
    @BeforeMethod(alwaysRun = true)
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(BASE_URL_WIX_SITE);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);}
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();}
}