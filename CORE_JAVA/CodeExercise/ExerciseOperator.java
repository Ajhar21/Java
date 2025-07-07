package CodeExercise;

public class ExerciseOperator {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        boolean compare=a>b ? true:false;
        System.out.println("Is a greater than b? "+compare);
        boolean com1;
        if((a>b) && (b>0)){
            com1=true;
            System.out.println("Is a > b and b > 0? "+com1);
        }
        else{
            com1=false;
            System.out.println("Is a > b and b > 0? "+com1);
        }

/*
  Addition:  30

  Subtraction:  10

  Multiplication:  200

  Division:  2

  Is a greater than b?  true

  Is a > b and b > 0?  true
 */
    }
}
