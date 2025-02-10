package tests;

import PoundLandFrameWork.CartPage;
import PoundLandFrameWork.HomePage;
import PoundLandFrameWork.PLBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PLTests extends PLBase {
    HomePage homePage;
    CartPage cartPage;
    @BeforeClass
    public void initializePages(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
    }
    @Test
    public void verifyingProductSearchAndAddToCart() throws InterruptedException {

        homePage.clickOnProductSearchBar();
        homePage.clickOnCaptchaButton();
        Thread.sleep(5000);
        homePage.clickOnSearchIcon();
        String searchProductText=homePage.getProductText();
        String searchProductPrice=homePage.getProductPrice();
        System.out.println(searchProductText);
        System.out.println(searchProductPrice);
        homePage.clickOnAddButton();
        Thread.sleep(5000);
        cartPage.clickOnCartButton();
        String addProductText=cartPage.getCartProductText();
        String addProductPrice=cartPage.getCartProductPrice();
        System.out.println(addProductText);
        System.out.println(addProductPrice);

        Assert.assertEquals(searchProductText,addProductText);
        Assert.assertEquals(searchProductPrice,addProductPrice);
    }
}