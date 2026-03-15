package com.aryan.springbootrepositorylayer.model;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop implements Computer {

    public void run()
    {
        System.out.println("running laptop");
    }

    public String nametype()
    {
        return "laptop";
    }
}
