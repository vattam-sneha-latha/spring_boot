package com.spring.core.DI;

// DI
// both SMSService and EmailService has printMessage() method

/* before implementing interface 
public class EmailService {
    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}

*/


public class EmailService implements MessageSenderInterface{
    public void printMessage(String message){
        System.out.println("The email message is "+message);
    }
}