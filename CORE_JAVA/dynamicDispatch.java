class A{
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In class C");
    }
}

public class dynamicDispatch {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();

        obj=new B();    //***dynamic dispatch****, here reference of obj been changed with new memory address
        obj.show(); //will call own method

        obj=new C();
        obj.show();     //will call own method

    }
    
}

/*****************************************************************
 *                  Polymorphism
******************************************************************

two types: 1. Runtime polymorphism(method overloading)  2.compile time oymorphism(method overriding)

Dynamic dispatch only possible in inheritance
*/
