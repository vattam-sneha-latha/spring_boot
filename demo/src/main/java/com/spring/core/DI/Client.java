package com.spring.core.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.AppConfig;

public class Client {
    public static void main(String[] args){

        // without DI
        // SMSService smsService=new SMSService();
        /* dependency injection without spring framework 
        EmailService emailService=new EmailService();
        MessageSender messageSender=new MessageSender(emailService);
        messageSender.sendMessage("Dependecy Injection without spring frameworkis successful");
        */

        /*dependency injection with spring framework */
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        // EmailService emailService=applicationContext.getBean(EmailService.class);  // we have to annoatate class with @Component in order to use getBean()
        // emailService.printMessage("Dependecy Injection using spring framework is successful directly using email service");

        MessageSender messageSender=applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage("Dependecy Injection using spring framework is successful");
        

    }
}
