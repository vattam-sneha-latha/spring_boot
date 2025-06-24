package com.spring.core;

import org.springframework.context.annotation.Primary;
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

@Component("car")
// @Primary if we dont wanna use @Qualifier in Traveller and give high preference to any of the beans like car, bus, cycle
public class Car implements Vehicle{ 
    @Override
    public void move(){
        System.out.println("car is moving");
    }
}
