package com.cybertek.tests.reviews;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReview {


    @DataProvider
    public Object [][] capitals(){

        String capitals [] [] = {
                {"USA", "Washington"},
                { "France", "Paris"},
                { "Turkey", "Ankara"},
                {"England", "London"},
                 {"Spain", "Madrid"},
                 {"Japan", "Tokyo"}};

        return capitals;


    }

    @Test(dataProvider = "capitals")
    public void  capitalTest(String country, String capital){

        System.out.println("Capital of "  + country + " is : " + capital);
    }




    @DataProvider
    public Object [][] users(){

        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA1-short");
        String data [] [] = excelUtil.getDataArrayWithoutFirstRow();

        return data;


    }


@Test(dataProvider = "users")
    public  void usersTest(String username,String password,String firstName,String lastName, String result ){


      System.out.println("Username: " + username  + " Password: " + password + " firstName: " + firstName + " lastName: " + lastName + " result: " + result);


    }



    @DataProvider
    public Object [][] numbers(){

        Integer numbers [] [] = {
                {2, 4},
                { 3, 8},
                { 2, 10},
                {23, 2},
                {10, 10},
                {7, 7}};

        return numbers;


    }



    @Test(dataProvider = "numbers")
    public  void calculate (Integer num1, Integer num2 ){

        System.out.println("When you multiply " + num1 +  " and " + num2 + " result will be: " +  num1 * num2 );


    }






}
