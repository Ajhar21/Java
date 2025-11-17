package org.bih;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object created");
    }
    @Override
    public void compile(){
        System.out.println("Compiling by Desktop");
    }
}
