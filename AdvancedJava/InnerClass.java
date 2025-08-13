/*
 * ****************Inner Class**********************
 * Inner class is a class inside another class, will be declared inside outer class
 * inner class can be static, but outer class can't be static
 * 
 */
class A{    //it's outer class
    int age;
    public void show(){
        System.out.println("In show");
    }

    class B{    //it's inner class
        public void config(){
            System.out.println("In config");
        }
    }
    static class C{    //it's inner class
        public void config(){
            System.out.println("In config inside C");
        }
    }
}
public class InnerClass{
    public static void main(String[] args){
        A obj=new A();
        obj.show();

        /*B obj1=new B(); //wrong syntax, because B belongs to A. can't initialize without A    
        A.B obj1=new A.B(); //also wrong
        */
        A.B obj1=obj.new B();   //must use object of outer class
        obj1.config();

        A.C obj2=new A.C(); //this is correct syntax, because C is a static object
        obj2.config();


    }
}