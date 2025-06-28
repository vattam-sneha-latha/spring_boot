package com.spring.core.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// without DI
// both SMSService and EmailService has printMessage() method
/* 
public class MessageSender {
    private MessageSenderInterface messageSenderInterface;

    public MessageSender(MessageSenderInterface messageSenderInterface){   // Constuctor dependecy
        this.messageSenderInterface=messageSenderInterface;
    }

    public void sendMessage(String message){
        this.messageSenderInterface.printMessage(message);
    }
}
    */

/* dependency injection using spring framework */

@Component("messagesender")
public class MessageSender {

    

    // Constuctor based dependecy
    /* 
    private MessageSenderInterface messageSenderInterface;

    private MessageSenderInterface smsService;
    @Autowired
    public MessageSender(@Qualifier("smsservice") MessageSenderInterface messageSenderInterface){   // Constuctor based dependecy
        this.messageSenderInterface=messageSenderInterface;
        System.out.println("constrcutor based dependency innjection 1");
    }

    */
    
    // setter based dependency injection
    /* 
    private MessageSenderInterface messageSenderInterface;

    private MessageSenderInterface smsService;
    @Autowired
    public void setMessageSenderInterface(@Qualifier("emailservice") MessageSenderInterface messageSenderInterface) {
        this.messageSenderInterface = messageSenderInterface;
        System.out.println("welcome to setter method");
    }

    @Autowired
    public void setSmsService(@Qualifier("smsservice") MessageSenderInterface smsService) {
        this.smsService = smsService;
    }

    */

    // field based dependency injection


    @Autowired
    @Qualifier("emailservice")
    private MessageSenderInterface messageSenderInterface;

    @Autowired
    @Qualifier("smsservice")
    private MessageSenderInterface smsService;

    public void sendMessage(String message){
        this.messageSenderInterface.printMessage(message);
        this.smsService.printMessage(message);
    }


    

}



