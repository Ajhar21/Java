
/******************** Multiple Exceptions **************************
 * 
 * Exception is the parent class of all exceptions
 * 
 * we can catch multiple exceptions by specifying the exception name
 * 
 * Parent Exception should be used at the bottom, not top
 * 
 ********************************************/

public class MultipleExceptions {
    public static void main(String[] args) {
        int i=2;         
        int j=0;
        int nums[]=new int[5];
        String str=null;
        
        try{
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot devide by zero"+e);  //should show specific message to the users
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Selection is out of limit"+e);
        }
        catch(Exception e){     //Parent Exception should be used at the end/bottom
            System.out.println("Something went wrong"+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
