package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {
    private By _yourStoreLocator= By.xpath("//a[text()=&quot;Your Store&quot;]");
    String expected="Your Store";
    private By _PhoneAndPDAS=By.xpath("//a[text()=&quot;Phones &amp; PDAs&quot;]");


    public void ToVerifyUserisOnHomepage(){
        Assert.assertEquals(_yourStoreLocator,expected);

    }
    public void clickOnPhoneAndPDAS(){
        clickOnElement(_PhoneAndPDAS);
    }


}
