package com.aryan.springbootannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringbootAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(SpringbootAnnotationsApplication.class, args);
        Alien a1= context.getBean("alien",Alien.class);
        System.out.println(a1.getAge());
        a1.start();
    }

}
