/*********************** Throw Exception *************************
 * 
 * throw keyword throw an exception, then catch block will catch it
 * 
 * by throw keyword we can create own exception logic
 * 
 * example syntax: throw new ArithmeticException("I don't want to print zero");
 * 
 ********************************************************************/

public class ThrowException {
    public static void main(String[] args) {
        int i=20; 
        int j=0;
        
        try{
            j=18/i;
            if (j==0){
                throw new ArithmeticException("I don't want to print zero"); //messegae pass by constructor
            }
        }
        catch(ArithmeticException e){   //for Arithmatic exception
            j=18/1;
            System.out.println("That's the default output"+e);
        }
        catch(Exception e){ //for all others exceptions
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

