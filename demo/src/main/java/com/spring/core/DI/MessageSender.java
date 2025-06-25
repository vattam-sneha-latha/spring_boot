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
    private MessageSenderInterface messageSenderInterface;

    @Autowired
    public MessageSender(@Qualifier("smsservice") MessageSenderInterface messageSenderInterface){   // Constuctor dependecy
        this.messageSenderInterface=messageSenderInterface;
    }

    public void sendMessage(String message){
        this.messageSenderInterface.printMessage(message);
    }
}



