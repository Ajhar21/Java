package CodeExercise;

public class ExerciseConditionals {
    public static void main(String[] args) {
        int score=75;
        char grade='B';

        if(score >= 50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        if(score >= 90){
            System.out.println("Grade: A");
        }
        else if(score>=75 && score <90){
            System.out.println("Grade: B");
        }
        else if(score>=60 && score <75){
            System.out.println("Grade: C");
        }
        else if(score<60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Invalid value");
        }


        /*
         *  Passed

            Grade:  B
         */
    }
}
