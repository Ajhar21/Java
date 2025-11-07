package org.bih;

//import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

//@Component
public class Alien {
    private int age;
    private int salary=5000;
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
