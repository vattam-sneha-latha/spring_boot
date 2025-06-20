package com.spring.core;

public class Cycle implements Vehicle{ 
    /* loose coupling */
    @Override
    public void move(){
        System.out.println("cycle is moving");
    }

}
