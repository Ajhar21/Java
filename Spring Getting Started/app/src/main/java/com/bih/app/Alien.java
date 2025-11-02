package com.bih.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/*** @Component is making this class available for SPring IoC *******************/
public class Alien {
//    @Autowired
    Laptop laptop;
    public Alien(Laptop laptop){
        this.laptop=laptop;
    }
    public void code(){
        laptop.compile();
        System.out.println("Coding");
    }
}
