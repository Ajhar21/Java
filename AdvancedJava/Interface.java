
/**************************Interface******************************
 * 
 * interface defines a design where it contain default abstract method
 * all abstract methods of interface are by default public
 * interface isn't a class, it's a type of design only
 * classe who implements interface must implement all abstract methods
 * all variables of interface is by default final & static also public
 * one class can implement multiple interfaces
 * an interface can inherit another interface
 * 
 *******************************************************************/

/*********************Keywords**************************************
 * 
 * class -> implements (interface)
 * class -> extends(inherite)
 * interface -> extends(inherite interface to interface)
 * 
 *********************************************************************/
 
 interface A{

    int age=28;
    String area="Mymensingh";
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A, Y{
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }

    public void run(){
        System.out.println("Running...");
    }
}
public class Interface {
    public static void main(String[] args) {
        A obj;  //here it is only defining type, not creating any object
        obj=new B();
        obj.show();
        obj.config();

        //obj.run(); //it's show error. Type A don't have run method

        X obj1=new B();
        obj1.run();
        System.out.println(A.age);
        System.out.println(B.age);

    }
}
