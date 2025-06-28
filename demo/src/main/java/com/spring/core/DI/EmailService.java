package com.spring.core.DI;

import org.springframework.stereotype.Component;

// without DI
// both SMSService and EmailService has printMessage() method

/* before implementing interface 
public class EmailService {
    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}

*/

/* without dependency injection using spring framework 
public class EmailService implements MessageSenderInterface{
    public void printMessage(String message){
        System.out.println("The email message is "+message);
    }
}
    */

@Component("emailservice")
public class EmailService implements MessageSenderInterface{

    @Override
    public void printMessage(String message){
        System.out.println("The email message "+message);
    }
}