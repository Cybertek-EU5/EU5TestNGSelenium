package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    //@Test
    public void test1(){
          String s1 = Singleton.getInstance();
          String s2 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }


    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = Driver.get();
        Thread.sleep(2000);
        driver.get("https://www.google.com");

    }

    @Test
    public void test3(){
        WebDriver driver = Driver.get();

        driver.get("https://www.amazon.com");


        Driver.get().get("https://www.amazon.com");
    }

}
