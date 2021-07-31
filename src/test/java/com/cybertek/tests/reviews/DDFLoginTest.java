package com.cybertek.tests.reviews;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {



    @DataProvider

    public Object [][] userData(){

        ExcelUtil qa3short = new ExcelUtil("Users.xlsx","Users");

        String [][] dataArray =qa3short.getDataArrayWithoutFirstRow();

        return dataArray;
    }

    @Test(dataProvider = "userData")
    public void loginTest(String username,String password,String firstName,String lastName){


        extentLogger = report.createTest("QA3 login Test" + " " + firstName +" " + lastName);

        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);

//        DashboardPage dashboardPage = new DashboardPage();










    }






}
