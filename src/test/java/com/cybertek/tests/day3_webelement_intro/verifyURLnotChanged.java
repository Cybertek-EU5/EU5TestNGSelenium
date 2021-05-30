package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) {
    /*Verify URL not changed
	    -open chrome browser
	    -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
	    -click on Retrieve password
	    -verify that url did not change
	*/

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected url before clicking button
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement --> Interface that represent elements on the webpage
        //findElement --> method used to find element on a page
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //save actual url after clicking button
        String actualUrl = driver.getCurrentUrl();

        //verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //close your browser
        driver.quit();


    }
}
