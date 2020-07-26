package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage=new HomePage();
    PhoneCategory phoneCategory=new PhoneCategory();
    Shopingcart shopingcart=new Shopingcart();

    @Test
    public void verifyUserShouldBeAbleToAddBothProductSuccessfully(){
        homePage.clickOnPhoneAndPDAS();
        phoneCategory.userabletoaddtocartbothproductsuccessfully();
        phoneCategory.usercanseetwoproductinshoppingcart();
        shopingcart.verifyUserCanAbleToClickOnShoppingCartButton();


    }
}
