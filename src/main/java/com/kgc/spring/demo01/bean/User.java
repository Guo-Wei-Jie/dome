package com.kgc.spring.demo01.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Date;


public class User {


    private  int Id;

    private  String name;
    private Date time;
    private  int age;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
