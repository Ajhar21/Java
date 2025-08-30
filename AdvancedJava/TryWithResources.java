import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/******************** try With Resources & finally********************
 * 
 * Try with resources is a feature that was introduced in Java 7. It is used to
 * automatically close resources that are opened in the try block.
 * 
 * finally block is used to close the resources that are opened in the try block.
 * 
 * better to use finally block to close the resources instead of closing it in try block automitacally
 * because closing in finally will give clear indication that which resource is closed
 * 
 */

public class TryWithResources {
    public static void main(String[] args) throws java.io.IOException {
        int i=0;
        int j=0;
        BufferedReader bf = null;
        
        //try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            //inside try, it will autpmitically close the resource
        try{
            j=18/i;
            InputStreamReader in = new InputStreamReader(System.in);
            bf=new BufferedReader(in);
            int num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot devide by zero"+e);  //should show specific message to the users
        }
        finally{
            //use finally block to close the resources    
            bf.close();
        }
    }
}
