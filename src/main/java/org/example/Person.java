package org.example;

import java.util.ArrayList;

public class Person {

    String name;
    static int id =0;
    String pwd;
    String phone_no;


    /* Printing Info */
    public void printInfo(){
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
        System.out.println("Phone No:" + phone_no);
    }

    /* Getter methods */
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getPwd(){
        return pwd;
    }
    public String getPhone_no(){
        return phone_no;
    }
}
