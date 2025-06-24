package com.spring.core.DI;


// DI
// both SMSService and EmailService has printMessage() method
public class MessageSender {
    private MessageSenderInterface messageSenderInterface;

    public MessageSender(MessageSenderInterface messageSenderInterface){   // Constuctor dependecy
        this.messageSenderInterface=messageSenderInterface;
    }

    public void sendMessage(String message){
        this.messageSenderInterface.printMessage(message);
    }
}


