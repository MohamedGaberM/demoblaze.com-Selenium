package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;
import static staticData.StaticData.*;

public class CartTest extends BaseTest{

    @Test
    public void addAndDeleteItem_shouldBe_doneSuccessfully(){
        ProductPage productPage= homePage.clickOnSamsungPhoneProduct();
        productPage.clickOnAddToCartBtn();
        Assert.assertTrue(productPage.getAlertMessage().contains(PRODUCT_AlERT_MESSAGE));
        productPage.acceptAlert();
        CartPage cartPage =productPage.clickOnCartBtn();
        Assert.assertTrue(cartPage.isProductExists());
        cartPage.clickOnDeleteBtn();}
}