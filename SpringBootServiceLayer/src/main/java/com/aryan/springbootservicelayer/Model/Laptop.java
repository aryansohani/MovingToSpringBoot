package com.aryan.springbootservicelayer.Model;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop implements Computer {

    public void run()
    {
        System.out.println("Laptop is running");
    }
    public Laptop()
    {
        System.out.println("object of laptop is created");
    }
    public String getType()
    {
        return "laptop";
    }
}
