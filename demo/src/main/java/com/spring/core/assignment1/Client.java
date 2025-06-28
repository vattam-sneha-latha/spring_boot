package com.spring.core.assignment1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.crypto.Data;

import org.springframework.context.ApplicationContext;

public class Client {
    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService=applicationContext.getBean(EmailService.class);
        emailService.sendEmail();
    }

}
