package com.aryan.springbootservicelayer.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    @Value("36")
    private int age;

    @Autowired
//    @Qualifier("lappy")
    private Computer comp;

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp() {
        return comp;
    }

    public int getAge() {
        return age;
    }

    public void start()
    {
        comp.run();
    }
}
