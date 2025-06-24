package com.spring.core;

import org.springframework.stereotype.Component;

/* loose coupling */
/* 
public class Cycle implements Vehicle{ 
    @Override
    public void move(){
        System.out.println("cycle is moving");
    }

}

*/

// ANNOTATION BASED CONFIGURATION

@Component
public class Cycle implements Vehicle{ 
    @Override
    public void move(){
        System.out.println("cycle is moving");
    }

}

