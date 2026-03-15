package com.aryan.springbootrepositorylayer.model;

import org.springframework.stereotype.Component;

@Component("desk")
public class Desktop implements Computer{

    public void run()
    {
        System.out.println("running desktop");
    }

    public String nametype()
    {
        return "desktop";
    }
}
