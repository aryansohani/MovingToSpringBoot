package com.aryan.springbootservicelayer.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desk")
@Primary
public class Desktop implements Computer{

    public void run()
    {
        System.out.println("Desktop is running");
    }

    public Desktop()
    {
        System.out.println("Desktop object created");
    }
    public String getType()
    {
        return "desktop";
    }

}
