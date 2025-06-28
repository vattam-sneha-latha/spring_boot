package com.spring.core.assignment1.java_based_configuration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class PostgreSqlDataSource implements DataSource{

    public String[] getEmails(){
        String[] res=new String[3];
        res[0]="p1@gmail.com";
        res[1]="p2@gmail.com";
        res[2]="p3@gmail.com";
        return res;
    }

}
