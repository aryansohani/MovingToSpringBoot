package com.aryan.springbootservicelayer;

import com.aryan.springbootservicelayer.Model.*;
import com.aryan.springbootservicelayer.Service.ServiceCenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringBootServiceLayerApplication {

    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(SpringBootServiceLayerApplication.class, args);
      Alien a1= context.getBean("alien",Alien.class);
      ServiceCenter service = context.getBean("service",ServiceCenter.class);
      System.out.println(a1.getAge());
       System.out.println(a1.getComp());
       a1.start();
       service.serving(a1.getComp());


    }

}
//What we did here is created two packages
//com.aryan.model
//com.aryan.service
//In com.aryan.model we stored alien,computer(Interface),desktop,laptop and also added getter setter in alien for comp
// we added @qualifier("lappy")
//In service we created a class ServiceCenter in which we created a method public void serving(Computer comp)
//In main file we .getBean(Alien.class) and .getBean(ServiceCenter.class) so we got bean now we can use methods
//I first printed values of Alien comp and age I know that which object has spring created for Computer comp by @Autowrired
//Then in service.serving(a1.getComp()) in service method I passed the computer object

//This is how service layer works it takes object from model and perform its own operation by getting the object as parameter
//and then save it or give it back to model
