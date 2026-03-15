package com.aryan.springbootrepositorylayer.Service;

import com.aryan.springbootrepositorylayer.Respository.Repodatalayer;
import com.aryan.springbootrepositorylayer.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class Servicecenter {

    @Autowired
    Repodatalayer repo;

    public void serving(Computer comp)
    {
        repo.save(comp);
    }

}
