package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.spring.core")
public class Client {
    public static void main(String[] args){
        /* loose coupling */
        /* 
        Vehicle vehicle=new Bus(); // car, bus, cycle must implement vehicle
        // Vehicle vehicle=new Car();
        Traveller traveller=new Traveller(vehicle);
        traveller.startJourney();
        */


        /* Tight coupling */
        /* 
        Traveller traveller=new Traveller();
        traveller.startJourney();
        */

        /* spring IOC container */
        // AppConfig is the class which is annotated with @Configuration which have methods annotated with @Bean
        // applicationContext is an interface which has many classes to implemet
        // spring IOC looks for the configuration file which we have mentioned(AppConfig)

        // 1. creating the spring IOC container
        // 2. reading the configuration file
        // 3.create and manage the spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // retreeiving the spring beans from IOC container
        Car car = applicationContext.getBean(Car.class);  
        car.move();

        Bus bus = applicationContext.getBean(Bus.class);
        bus.move();

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();

    }
}
