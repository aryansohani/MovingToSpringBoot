package com.aryan.springbootservicelayer.Service;

import com.aryan.springbootservicelayer.Model.Computer;
import org.springframework.stereotype.Service;

@Service("service")
public class ServiceCenter {

    public void serving(Computer comp)
    {
        System.out.println("serving done " +comp.getType());
    }
}
