package com.aryan.springbootrepositorylayer.Respository;

import com.aryan.springbootrepositorylayer.model.Computer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Repodatalayer {

    public void save(Computer comp)
    {
        System.out.println("the data is saved in "+ comp.nametype());
    }
}
