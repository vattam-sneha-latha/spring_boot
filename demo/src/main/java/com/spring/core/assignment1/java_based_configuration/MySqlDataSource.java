package com.spring.core.assignment1.java_based_configuration;

import org.springframework.stereotype.Component;


public class MySqlDataSource implements DataSource{

     public String[] getEmails(){
        String[] res=new String[3];
        res[0]="m1@gmail.com";
        res[1]="m2@gmail.com";
        res[2]="m3@gmail.com";
        return res;
    }
}
