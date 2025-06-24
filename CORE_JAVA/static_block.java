class Mobile{
    String brand;
    int price;
    static String phone_type;

    /*static block, static varibale should be declared here
    static block execute first.
    */
    static{
        phone_type="Phone";
        System.out.println("Inside the static block");
    }
    public void show(){
        System.out.println(brand+":"+price+":"+phone_type);
    }

    public static void show1(Mobile obj){   //must pass the reference object to use non-static variables
        System.out.println(obj.brand+":"+obj.price+":"+phone_type);
    }
}

public class static_block {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("Mobile"); //to show class loader execute first with static block
        // Mobile obj1=new Mobile();
        // Mobile obj2=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1500;
        // obj2.brand="Samsung";
        // obj2.price=1700;
        // // Mobile.phone_type="Smartphone";

        // obj1.show();
        // obj2.show();

        // obj1.show1(obj2);



    }
}

