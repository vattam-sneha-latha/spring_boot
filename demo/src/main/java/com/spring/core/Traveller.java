package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*loose coupling */
/* 
public class Traveller {
    private Vehicle vehicle=null;
    public Traveller(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
    */

/* tight coupling  */
/* 
public class Traveller {
    Car car=null;
    public Traveller(){
        car=new Car();
    }
    public void startJourney(){
        this.car.move();
    }
}
    */

// ANNOTATION BASED CONFIGURATION

@Component
public class Traveller {
    private Vehicle vehicle=null;

    @Autowired
    public Traveller(@Qualifier("car") Vehicle vehicle){    // here car is the component name in Car class
        // public Traveller(@Qualifier("cycle") Vehicle vehicle)
        // public Traveller(Vehicle vehicle) if we use @Primary in any of the car, bus, cycle classes (beans) then no need to use @Qualifier
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
