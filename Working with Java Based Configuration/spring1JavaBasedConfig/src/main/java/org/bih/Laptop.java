package org.bih;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object created");
    }
    @Override
    public void compile(){
        System.out.println("Compiling by Laptop");
    }
}
