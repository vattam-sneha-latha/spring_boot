package com.spring.core;

public class Bus implements Vehicle{
     /* loose coupling */
    @Override
    public void move(){
        System.out.println("bus is moving");
    }
}
