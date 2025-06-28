package com.spring.core.DI;

import org.springframework.stereotype.Component;

// wihtout DI
// both SMSService and EmailService has printMessage() method
/* before implementing interface 
public class SMSService {
    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}

*/

/* after implementing */
/* without depency injection using spring framework 
public class SMSService implements MessageSenderInterface{

    public void printMessage(String message){
        System.out.println("The SMS message is "+message);
    }
}
    */

@Component("smsservice")
public class SMSService implements MessageSenderInterface{

    @Override
    public void printMessage(String message){
        System.out.println("The SMS message "+message);
    }
}



