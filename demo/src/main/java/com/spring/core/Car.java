package com.spring.core;


public class Car implements Vehicle{ 
    /* loose coupling */
    @Override
    public void move(){
        System.out.println("car is moving");
    }
}


/* 
public class Car {

    tight cpuling 
    
    public void move(){
        System.out.println("The car is moving");
    }
        
}

*/
