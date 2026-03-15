package com.aryan.springbootrepositorylayer;

import com.aryan.springbootrepositorylayer.Service.Servicecenter;
import com.aryan.springbootrepositorylayer.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRepositorylayerApplication {

    public static void main(String[] args) {
       ApplicationContext context=SpringApplication.run(SpringBootRepositorylayerApplication.class, args);
       Alien a1= context.getBean("alien",Alien.class);
       System.out.println(a1.getAge());
       System.out.println(a1.getComp());

        Servicecenter service=context.getBean("service",Servicecenter.class);
        service.serving(a1.getComp());

    }

}
