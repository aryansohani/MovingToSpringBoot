package com.aryan.springbootannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    @Value("11")
    private int age;

    private Computer comp;

    public void start()
    {
        comp.runcpu();
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

    @Autowired
//    @Qualifier("lappy")
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
