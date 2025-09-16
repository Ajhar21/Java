import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**************** ForEach Example ***************************
 * forEach() is a method which take a Consumer functional interface as an argument.
 * It is used to perform an action for each element of the Iterable.
 * Consumer is a functional interface that has a single abstract method accept(T t) 
 * **which takes an argument and returns nothing.
 **************************************************************/

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,6,7,9);
        
        // Consumer<Integer> con= new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // Consumer<Integer> con = n -> System.out.println(n); //using lambda expression

         //using forEach method to iterate through the list
        nums.forEach(n -> System.out.println(n));
    }
}
