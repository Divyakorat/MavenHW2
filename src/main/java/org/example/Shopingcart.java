package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Shopingcart extends Util {
    private By _HTCTouchHDAddToCartAddSuccessfully=By.xpath("//div[@class=&quot;table-responsive&quot;]/table/tbody/tr[1]/td[2]/a");
    private By _iPhoneAddToCartAddSuccessfully=By.xpath("//div[@class=&quot;table-responsive&quot;]/table/tbody/tr[2]/td[2]/a");
    String expectedText1="HTC Touch HD";
    String expectedText2="iPhone";

    public void verifyUserCanAbleToClickOnShoppingCartButton(){
        Assert.assertEquals(_HTCTouchHDAddToCartAddSuccessfully,expectedText1);
        Assert.assertEquals(_iPhoneAddToCartAddSuccessfully,expectedText2);

    }
}
