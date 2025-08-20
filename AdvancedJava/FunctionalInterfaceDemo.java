
/******************** FunctionalInterface ******************
 * 
 * Funtional Interface only have one abstract method
 * 
 * FuntionalInterface annotation used to define functional interface
 * 
 **********************************************************/
@FunctionalInterface    //this annotation define it can have only one abstract method
interface A{
    void show();
    // void config();
}

// class B implements A{
//     public void show(){
//         System.out.println("In show B");
//     }
// }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
