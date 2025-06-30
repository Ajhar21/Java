package Package;

import Package.tools.*;

class B extends AccessModifier{
    public void show(){
        System.out.println(marks);  //marks is protected. can be accessed from sub-class
    }
}
public class Main {
public static void main(String[] args) {
    Calc obj= new Calc();

    AccessModifier obj1= new AccessModifier();
    // obj1.marks=5;
    // System.out.println(obj1.marks);
    
}
}