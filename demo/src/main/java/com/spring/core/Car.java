package com.spring.core;

import org.springframework.stereotype.Component;

/* loose coupling */
/* 
public class Car implements Vehicle{ 
    @Override
    public void move(){
        System.out.println("car is moving");
    }
}
    */


/* tight coupling 
public class Car {
    public void move(){
        System.out.println("The car is moving");
    }
        
}

*/

// ANNOTATION BASED CONFIGURATION

@Component
public class Car implements Vehicle{ 
    @Override
    public void move(){
        System.out.println("car is moving");
    }
}
