/*
 * ********************Anonymous Inner Class for Abstract Class
 * 
 * abstract method can be implemented by anonymous inner class
 * again it's very useful while implementing abstract method only for once
 * 
 */

abstract class A{
    public abstract void show();
}
public class AnonymousInnerAbstract {
    public static void main(String[] args) {
        A obj= new A() {
            public void show(){
                System.out.println("In show method");
            }
        };
        obj.show();
    }
}
