package CodeExercise;

public class ExerciseArray {
    public static void main(String[] args) {
        
        int[] numbers = {45, 22, 89, 16, 90, 33};
        int smallest=numbers[0];
        int largest=numbers[0];

        for(int num:numbers){
            if(num<smallest)
                smallest=num;
            if(num>largest)
                largest=num;
        }
        System.out.println("Smallest:" +smallest);
        System.out.println("Largest:" +largest);
}
}
