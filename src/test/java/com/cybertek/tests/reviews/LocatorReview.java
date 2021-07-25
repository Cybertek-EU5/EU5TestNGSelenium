package com.cybertek.tests.reviews;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorReview {

    @Test
    public void test1(){

        //write a locator for etsy.com based on the text variable, locator will dynamically change.
        String text ="Clothing & Shoes";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");

        String xPathText ="//ul[@data-ui='top-nav-category-list']//span[contains(text(),'"+text+"')]";

        System.out.println(xPathText);
        WebElement homeLivingLink = driver.findElement(By.xpath(xPathText));



    }
}
