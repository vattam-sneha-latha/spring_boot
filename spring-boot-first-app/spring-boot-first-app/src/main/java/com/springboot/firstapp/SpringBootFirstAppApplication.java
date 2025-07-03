package com.springboot.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringBootFirstAppApplication.class, args);
		System.out.println("working");
		/* 
		String[] beanNames=applicationContext.getBeanDefinitionNames();
		for(String name:beanNames){
			System.out.println(name);
		}
			*/
		
	}

}
