import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/******************** Map Filter Reduce Sorted **************************
 * Filter take Predicate as argument and return boolean. Abstract method test()
 * Map take Function as argument and return new stream. Abstract method apply()
 * Reduce take Object, BinaryOperator as argument and return single value.
 * Sorted is terminal operation
 * ****************************************************************************/

public class StreamMapFilterReduceSorted {
    public static void main(String[] args) {
        List <Integer> nums=Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate <Integer> p= n -> n%2==0;
        
        Function <Integer, Integer> f= n-> n*2;
   

        int result= nums.stream()
                        .filter(p)
                        .map(f)
                        .reduce(0, (c,e) -> c+e );  
                        //0 is initial value, c is current value, e is each element
        System.out.println("Result by reduce: "+result);

        Stream <Integer> s= nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .sorted();
        
        s.forEach(n -> System.out.println(n));

        Stream <Integer> s1= nums.parallelStream() //for multithreading
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .sorted();  //don't use sorted() in parallel stream, it will take more time

        s1.forEach(n -> System.out.println("By parallal stream: "+n));
    }
}
