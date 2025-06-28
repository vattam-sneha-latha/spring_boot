package com.spring.core.assignment1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.spring.core.assignment1")
public class AppConfig {
    // java based configuration
    /* 

    @Bean
    public DataSource MySqlDataSource(){
        return new MySqlDataSource();
    }

    @Bean
    public DataSource PostgreSqlDataSource(){
        return new PostgreSqlDataSource();
    }

    @Bean
    public EmailService EmailService(){
        return new EmailService(PostgreSqlDataSource());
    }

    @Bean
    public void sendEmail(){
        String[] res=this.dataSource.getEmails();
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
        */

}
