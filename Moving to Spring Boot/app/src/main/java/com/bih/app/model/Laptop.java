package com.bih.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    @Autowired
    CPU cpu;
    public void compile(){
        cpu.runCpu();
        System.out.println("Compiling in Laptop");
    }
}
