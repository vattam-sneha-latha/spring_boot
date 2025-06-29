package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;

public class DemoClient {

    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        DemoController demoController=applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoRepository demoRepository=applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());

        DemoService demoService=applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());
    }

}
