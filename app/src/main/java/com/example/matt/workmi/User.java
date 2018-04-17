package com.example.matt.workmi;

public class User {


    String name, employeeid, password;

    public User (String name, String employeeid, String password){

        this.name = name;
        this.employeeid = employeeid;
        this.password = password;
    }

    public User (String employeeid){

        this.employeeid = employeeid;
        this.password = "pass123";
        this.name = "Please insert name";
    }


}
