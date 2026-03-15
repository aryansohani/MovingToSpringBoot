package com.aryan.springbootrepositorylayer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    @Value("67")
    private int age;

    @Autowired
    @Qualifier("lappy")
    private Computer comp;

    public void start()
    {
        comp.run();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
