package org.example;



import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    public void chroBrowser() {
        //path and property for chrome driver
        System.setProperty("webdriver.chrome.driver","src\\test\\BrowserDriver\\chromedriver.exe");
        //creating chromdriver object to open google chrome browser
        driver = new ChromeDriver();
        //maximising screen
        driver.manage().window().maximize();
        //applying implicity wait of 20 sec to the driver instance
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    public void closeBrowser()
    {
        driver.close();
    }


}