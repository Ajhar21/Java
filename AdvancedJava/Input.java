import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/************************** Input from user ******************
 * 
 * System class is present in java.lang package
 * System class has two static member 1. in 2. out
 * in is object of InputStream class
 * out is object of PrintStream class
 * 
 * InputStream class has method read() to take input from user
 * read() method throws IOException, so we have to handle it
 * 
 **************************************************************/

public class Input {
    public static void main(String[] args) throws java.io.IOException {
        
        // System.out.println("Enter a number: "); 
        // //println is method of PrintStream class, out is object of PrintStream class
        // //out is static member of System class, that's why we can access it directly with class name

        // int num=System.in.read();
        
        // System.out.println(num-48); //ASCII value of character '0' is 48

        // System.out.println("Enter another number: ");
        
        // InputStreamReader in= new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in); //this is an old way to take input from user

        // int num2=Integer.parseInt(bf.readLine());
        // System.out.println(num2);

        // bf.close();
        // in.close();

        System.out.println("Enter another number: ");
        Scanner sc=new Scanner(System.in);
        int numn3 = sc.nextInt();
        System.out.println(numn3);
        sc.close();
    }
}
