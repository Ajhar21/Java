package CodeExercise;
import java.util.Scanner;

public class ExerciseCalc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String again="y";

        while (again.equalsIgnoreCase("y")) {
            double num1,num2;
            double result;
            System.out.print("Enter first numbers: ");
            num1=input.nextDouble();
            System.out.print("Enter second numbers: ");
            num2=input.nextDouble();
            char ops;
            System.out.print("Choose operation: (+,-,*,/):");
            ops=input.next().charAt(0);

            switch (ops) {

                case '+':
                result=num1+num2;
                    System.out.println("Result: "+result);
                    break;
                
                case '-':
                result=num1-num2;
                    System.out.println("Result: "+result);
                    break;
                case '*':
                result=num1*num2;
                    System.out.println("Result: "+result);
                    break;
                case '/':
                if (num2==0){
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                else{
                    result=num1/num2;
                    System.out.println("Result: "+result);
                    break;
                }                                                
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
            input.nextLine();
            System.out.println("Do you want to calculate again? (y/n)");
            again=input.nextLine();

        }
        System.out.println("Thank you for using the calculator.");
        input.close();
        
    }
}
