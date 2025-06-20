package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Vehicle cycle(){
        return new Cycle();
    }

    @Bean
    public Vehicle bus(){
        return new Bus();
    }

    @Bean
    public Traveller traveller(){
        return new Traveller(car());  // Dependency injection Traveller depends on car
        // we have to inject dependencies manually
    }
}
