class A extends Object{ //the first level class inherited Object class by default
    public A()  //constructpr
    {
        super(); //every constructor first execute this method
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A "+n);
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        //super();
        // super(5); //it will call parameterized constructor
        this(); //this method will call this class constructor without parameter
        System.out.println("In B "+n);
    }
}

public class super_this{
    public static void main(String[] args) {
        // B obj= new B();
        B obj=new B(5);
    }
}