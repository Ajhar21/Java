
/********************* Interface Need **********************
 * 
 * interface or abstract class are concepts
 * 
 * 
 *********************************************************/

/*********** Real Life problem *****************************
 * 
 * All developer can able work with any computer(laptop,desktop)
 * 
 * developer has to develop app whatever type copmputer given to him
 * 
 ********************************************************/

// abstract class Computer{
//     public abstract void code();
// } 

interface Computer{
    void code();
} 

class Laptop implements Computer{
    public void code(){
        System.out.println("Code,compile,run");
    }
}

class Desktop implements Computer{
    public void code(){
       System.out.println("Code,compile,run: Faster"); 
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class needOfInterface{
    public static void main(String[] args) {

        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer ajhar=new Developer();
        ajhar.devApp(lap);
        ajhar.devApp(desk);
    }
}