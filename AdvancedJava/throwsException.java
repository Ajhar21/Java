/******************** Throws Exception ********************
 * 
 * if we don't want to handle exception in method, throws it for a method which will call it
 * throws throw the exception to the caller method
 * even main can have throws exception, but it's not a good practice as JVM is the caller of main
 * 
 ***********************************************************/

class A{
    public void show() throws ClassNotFoundException{   //checked exception, must be handled or throws it

        Class.forName("status");  //checked exception, must be handled
        // try{
        //     Class.forName("status");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Class not found"+e);

        // }
    }
}

public class throwsException {

    static{
        System.out.println("In static block");
    }
    public static void main(String[] args)  {  //main can have throws exception, but not a good practice
        A obj=new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found"+e);
        }
    }
}
