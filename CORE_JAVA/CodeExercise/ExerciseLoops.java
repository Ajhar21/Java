package CodeExercise;

public class ExerciseLoops {
    public static void main(String[] args) {
        System.out.print("For Loop: ");
        for(int i=1; i<=5; i++){
            if (i<5)
                System.out.print(i+" ");
            else 
                System.out.print(i);
            }
        System.out.println();

        int k=1;
        
        System.out.print("While Loop: ");
        while(k<=5){
            if (k<5)
                System.out.print(k+" ");
            else 
                System.out.print(k);
            k++;
            }
        System.out.println();

        System.out.print("Do-While Loop: ");
        int j=1;
        do{
            if (j<5)
                System.out.print(j+" ");
            else 
                System.out.print(j);
            j++;
            }   while(j<=5);
        System.out.println();
    }
}



