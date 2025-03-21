class A{

    public A(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("In show method");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A();    //Anonymous object which hasn't reference or name
        new A().show();    //Anonymous object cannot be reused. that's why it will create new object
    }
}
