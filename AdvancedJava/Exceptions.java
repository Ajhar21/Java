
/******************** Exceptions **************************
 * 
 * Types of error: 1. compile time 2. Run time 3. Logical error
 * 
 * Exception handle the run time error
 * 
 * Exception works on critical statement, not necessary for normal statement
 * 
 ********************************************/

public class Exceptions {
    public static void main(String[] args) {
        int i=0;    //normal statement
        //int j=18/i; //critical statement
        //since i=0, it will cause runtime error
        int j=0;
        
        try{
            j=18/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
