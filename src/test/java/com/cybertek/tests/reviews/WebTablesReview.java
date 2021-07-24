package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesReview{


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/search?q=euro+2020&rlz=1C5CHFA_enUS770US770&ei=Gpj5YJrmNtfK-gS3jb6IBg&oq=" +
                "euro+2020&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAELEDMgUIABCxAzICCAAyBQgAELEDMgIIADIFCC4QsQMyAggAMgIIADICCAAyAgg" +
                "AOgcIABBHELADOgcIABCwAxBDOgoILhCwAxDIAxBDOgcIABCxAxBDSgUIOBIBMUoECEEYAFDNEljhFGDJF2gBcAJ4AIABiQGIAbAC" +
                "kgEDMi4xmAEAoAEBqgEHZ3dzLXdpesgBDsABAQ&sclient=gws-wiz&ved=0ahUKEwia28GJiPfxAhVXpZ4KHbeGD2EQ4dUDCA" +
                "4&uact=5#sie=lg;/m/0p3p7v6;2;/m/01l10v;st;fp;1;;");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.xpath("(//div[@class='jXpA9e Ui5IUc']//table)[1]"));

        System.out.println(table.getText());


    }


    @Test
    public void getAllHeaders() {
        //how many columns we have ?
        List<WebElement> headers = driver.findElements(By.xpath("(//div[@class='jXpA9e Ui5IUc']//table)[1]//th"));
        System.out.println("headers.size() = " + headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

    }





    private int getNumberOfColumns() {
        List<WebElement> headers = driver.findElements(By.xpath("(//div[@class='jXpA9e Ui5IUc']//table)[1]//th"));
        return  headers.size();
    }

    private int getNumberOfRows() {
        List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("(//div[@class='jXpA9e Ui5IUc']//table)[1]//tr"));
        return  allRowsWithoutHeader.size();
    }

    @Test
    public void test (){



        System.out.println( " number of columns:  "+getNumberOfColumns());

        System.out.println(" number of rows: " + getNumberOfRows());

    }



}