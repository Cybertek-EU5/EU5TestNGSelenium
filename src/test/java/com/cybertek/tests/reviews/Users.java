package com.cybertek.tests.reviews;


import lombok.AllArgsConstructor;


//@AllArgsConstructor
public class Users {


    public String username;
    public String password;
    public String firstName;
    public String lastName;



    public Users(String username, String password, String firstName, String lastName){

        this.username=username;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;

    }


}
