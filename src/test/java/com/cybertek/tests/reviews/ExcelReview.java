package com.cybertek.tests.reviews;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ExcelReview {


   static Faker faker = new Faker();


    static String [] columns = {"username", "password","firstName","lastName" };
    static List<Users> users = new ArrayList <>();


    @Test

    public void createUserExcelFile(){

        for (int i = 0; i <5 ; i++) {

            String password;
            String username;
            String firstName;
            String lastName;






        }



    }








}
