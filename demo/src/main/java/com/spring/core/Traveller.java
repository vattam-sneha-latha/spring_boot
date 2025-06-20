package com.spring.core;



/*loose coupling */
public class Traveller {
    private Vehicle vehicle=null;
    public Traveller(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
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
