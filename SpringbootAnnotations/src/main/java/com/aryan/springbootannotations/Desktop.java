package com.aryan.springbootannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public void runcpu()
    {
        System.out.println("The desktop is running");
    }
}
