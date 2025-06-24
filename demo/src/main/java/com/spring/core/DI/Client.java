package com.spring.core.DI;

public class Client {
    public static void main(String[] args){

        // DI
        
        // SMSService smsService=new SMSService();
        EmailService emailService=new EmailService();
        MessageSender messageSender=new MessageSender(emailService);
        messageSender.sendMessage("Dependecy Injection is successful");
        

    }
}
