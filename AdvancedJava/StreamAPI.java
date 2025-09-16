import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/******************* Stream API *****************
 * Stream API is used to process collections of objects.
 * Stream is an interface that provides methods to perform various operations on a sequence of elements.
 * Stream is one time use, it cannot be reused.
 * Only one intermediate operation can be performed on a stream.
 * Stream operations are of two types: intermediate and terminal.
 * Intermediate operations return a stream, terminal operations return a non-stream result.
 * Example usecase: Big data -> filter -> map(process) -> reduce(to get single value) 
 **********************************************/

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,6,7,9);

        Stream <Integer> s1= nums.stream(); //creating a stream from the list
        Stream <Integer> s2= s1.filter(n -> n%2==0); //intermediate operation, returns a stream
        // s2.forEach(n -> System.out.println(n)); //terminal operation, consumes the stream
        // s2.forEach(n -> System.out.println(n)); //will give runtime error as stream is already used

        Stream <Integer> s3= s2.map(n -> n*2); //intermediate operation, returns a stream
        // s3.forEach(n -> System.out.println(n)); //terminal operation, consumes the stream
        int result= s3.reduce(0, (c,e) -> c+e); //terminal operation, returns a single value
        System.out.println("Result by multi lines: "+ result); 

        int quickResult= nums.stream().
                    filter(n -> n%2==0).
                    map(n -> n*2).
                    reduce(0, (c,e) -> c+e); //chaining all operations in a single statement
        System.out.println("Quick Result: " + quickResult);

    }

}

