package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import static staticData.StaticData.*;

public class OrderTest extends BaseTest{
    @Test
    public void orderAnItem_Should_orderedSuccessfully(){
        ProductPage productPage= homePage.clickOnSamsungPhoneProduct();
        productPage.clickOnAddToCartBtn();
        Assert.assertTrue(productPage.getAlertMessage().contains(PRODUCT_AlERT_MESSAGE));
        productPage.acceptAlert();
        CartPage cartPage =productPage.clickOnCartBtn();
        PlaceOrderPage placeOrderPage = cartPage.clickOnPlaceOrderBtn();
        placeOrderPage.placeOrder(USER_NAME,COUNTRY,CITY,CREDIT_CARD,MONTH,YEAR);
        Assert.assertTrue(placeOrderPage.isThankYouTxtExists());}
}