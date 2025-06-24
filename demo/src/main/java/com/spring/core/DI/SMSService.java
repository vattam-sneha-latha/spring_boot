package com.spring.core.DI;


// DI
// both SMSService and EmailService has printMessage() method
/* before implementing interface 
public class SMSService {
    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}

*/

/* after implementing */
public class SMSService implements MessageSenderInterface{

    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}

