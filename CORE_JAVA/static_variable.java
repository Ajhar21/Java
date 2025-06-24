class Mobile{
    String brand;
    int price;
    static String mobile_type;

    public void show(){
        System.out.println(brand+" "+price+" "+mobile_type);
    }
}
public class static_variable {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="iPhone";
        obj1.price=1500;
        Mobile.mobile_type="SmartPhone";    //static variable should be access by class name not by object

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=2000;
        Mobile.mobile_type="SmartPhone";    //static variable should be access by class name not by object
        
        obj1.show();
        obj2.show();
        System.out.println();
        Mobile.mobile_type="SolarPhone";    //will change all object mobile_type
        obj1.show();
        obj2.show();
    }
}