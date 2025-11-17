package com.bih.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    @Autowired
    CPU cpu;
    public void compile(){
        cpu.runCpu();
        System.out.println("Compiling in Desktop");
    }
}