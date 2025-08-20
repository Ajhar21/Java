
/********************* ENUM CLASS **************************************
 * enum Class cannot be extended(Inheritance not allowed)
 * 
 */

enum Laptop{
    Macbook(2000), XPS(1500), Surface, Thinkpad(1200);  //here every item is an object
    //getting price by constructor
    private int price;

    private Laptop() {
        this.price=1400;    //Surface will get value from default constructor
        System.out.println("Testing how many times calling:" + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("Testing how many times calling:" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap=Laptop.Macbook;
        System.out.println(lap);

        for (Laptop l:Laptop.values()){
            System.out.println(l + ":" + l.getPrice());
        }
    }
}
