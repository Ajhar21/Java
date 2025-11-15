package org.bih;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;
    private int salary=5000;

//    @Autowired    //Field Injection
//    @Qualifier("lap")
    private Computer com;
    public Alien(){
        System.out.println("Alien object created");
    }
//    @ConstructorProperties({"age","salary","lap"})
//    public Alien(int age ,int salary, Laptop lap){
//        System.out.println("Constructor being called");
//        this.age=age;
//        this.salary=salary;
//        this.lap=lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    @Autowired      //setter injection
    @Qualifier("lap")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
