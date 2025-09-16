import java.util.Arrays;
import java.util.List;

public class StreamAPIConcept {
    public static void main(String[] args) {
        List <Integer> nums= Arrays.asList(4,5,6,2,7,8);
        System.out.println("Print with normal for loop:");
        for (int i=0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println("Print with enhanced for loop:");
        for (int n : nums){
            System.out.println(n);
        }
        
        int sum=0;
        for (int n : nums){
            if (n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println("Sum of double of even numbers: " + sum);

        /*********************** Using Stream API *************************/
        System.out.println("Print with Stream API concept:");
        nums.forEach( n -> System.out.println(n)); //lambda expression
    }
}
