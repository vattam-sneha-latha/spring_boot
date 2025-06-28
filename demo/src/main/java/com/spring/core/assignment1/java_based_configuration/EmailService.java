package com.spring.core.assignment1.java_based_configuration;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class EmailService {

    private DataSource dataSource;
    @Autowired
    public EmailService(@Qualifier("mysql") DataSource dataSource){  // we used @Primary in PostgreSqlDataSource so it is not mandatory to use @Qualifier
        this.dataSource=dataSource;
    }

    public void sendEmail(){
        String[] res=this.dataSource.getEmails();
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
