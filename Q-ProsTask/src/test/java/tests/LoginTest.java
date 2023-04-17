package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import static staticData.StaticData.*;

public class LoginTest extends BaseTest{
    @Test
    public void loginWithValidUser_Should_LoggedInSuccessfully() {
        LoginPage loginPage = homePage.clickOnLoginBtn();
        loginPage.login(USER_NAME,PASSWORD);
        Assert.assertTrue(loginPage.getNameOfUserTxt().contains(WELCOME_USER_NAME));}
}