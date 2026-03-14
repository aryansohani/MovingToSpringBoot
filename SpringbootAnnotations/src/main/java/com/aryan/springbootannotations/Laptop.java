package com.aryan.springbootannotations;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop implements Computer {

    public void runcpu()
    {
        System.out.println("The cpu of laptop is running");
    }

}
