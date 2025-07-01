class A{
    public void show1(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In class B");
    }   
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        double val=4.5;
        int val1=(int) val; //this is called typecasting

        System.out.println(val1);

        A obj= (A)new B(); // it is dynamic dispatch
        //A obj= new B(); // it is dynamic dispatch
        /************************************************************************
         * it is a object of B class but it's A type. A is parent, B is child
         * that's why it is called Upcasting
         ************************************************************************/
        obj.show1();

        B obj1= new B();

        obj1=(B) obj; //Downcasting
        /***********************************************************
         * obj was A type class, but now casting to B class
         * A is parent, B is child
         * that's why this casting called Downcasting
         * upcasting & downcasting are also type of typecasting
         **********************************************************/
        obj1.show2();
        obj1.show1();


    }
}
