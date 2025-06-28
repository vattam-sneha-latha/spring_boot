package com.spring.core.assignment1.java_based_configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration

public class AppConfig {
   
    @Bean
    public DataSource mySqlDataSource(){
        return new MySqlDataSource();
    }

    @Bean
    public DataSource postgreSqlDataSource(){
        return new PostgreSqlDataSource();
    }

    @Bean
    public EmailService emailService(){
        return new EmailService(postgreSqlDataSource());
    }


}
