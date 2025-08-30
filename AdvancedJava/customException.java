/************************** Custom Exception ******************
 * 
 * Throwable has two class 1. Error 2. Exception
 * Exception -> 1.RunTimeException(unchecked)  2. SQLException(checked)     3. IOException(checked)
 * RunTimeException is unchecked exception, optional to handle
 * checked exception is compulsory to handle
 * 
 * we can create own exception by creating class
 * 
 * class muct be inherited from default exception
 * 
 * 
 **************************************************************/
class AjharException extends RuntimeException{
    public AjharException(String str){
        super(str);
    }
}
public class customException {
    public static void main(String[] args) {
        int i=20; 
        int j=0;
        
        try{
            j=18/i;
            if (j==0){
                throw new AjharException("I don't want to print zero"); //messegae pass by constructor
            }
        }
        catch(AjharException e){   //for Arithmatic exception
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
