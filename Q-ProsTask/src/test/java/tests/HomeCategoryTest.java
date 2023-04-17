package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HomeCategoryTest extends BaseTest{
    @Test
    public void verifyCategories_should_hasItems() {
       homePage.clickOnPhonesCategoryBtn();
       Assert.assertTrue(homePage.isPhoneItemExists());
       homePage.clickOnMonitorsCategoryBtn();
       Assert.assertTrue(homePage.isMonitorItemExists());
       homePage.clickOnLaptopsCategoryBtn();
       Assert.assertTrue(homePage.isLaptopItemExists());}
}