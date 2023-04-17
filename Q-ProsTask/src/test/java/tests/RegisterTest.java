package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import static staticData.StaticData.*;

public class RegisterTest extends BaseTest{

    @Test
    public void signUpWithValidUser_Should_RegisterSuccessfully(){
       SignUpPage signUpPage = homePage.clickOnSignUpBtn();
       signUpPage.signUp(faker.name().username(),faker.number().digits(6));
       Assert.assertTrue(signUpPage.getAlertMessage().contains(SIGN_UP_ALERT_MESSAGE));
       signUpPage.acceptAlert();}
}