package com.spring.core;

import org.springframework.stereotype.Component;

/* loose coupling */
/* 
public class Bus implements Vehicle{
    @Override
    public void move(){
        System.out.println("bus is moving");
    }
}
    */

// ANNOTATION BASED CONFIGURATION

@Component
public class Bus implements Vehicle{
    @Override
    public void move(){
        System.out.println("bus is moving");
    }
}