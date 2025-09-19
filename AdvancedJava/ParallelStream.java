import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Random; 
// import java.lang.Thread;

/**************** Parallel Stream  *************************
 * when sure about large data set & operations, use parallel stream
 * don't use parallel stream for small data set, it will take more time
 * only use parallel stream when operations are independent
 * don't use parallel stream when order of elements matter
 * 
 * 
************************************************************/

public class ParallelStream{

    public static void main(String[] args) {

        int size=10_000;
        List <Integer> nums = new ArrayList<>(size);  //fixed size list

        Random rand= new Random();  

        for (int i=1; i < size; i++ ){
            nums.add(rand.nextInt(100));    //here 100 is bound
        }

        // int sum= nums.stream()
        //             .map(n -> n*2)
        //             .reduce(0, (c,e) -> c+e );

        long startSeq= System.currentTimeMillis();
        
        int sum= nums.stream()
                    .map( n -> {
                        try {
                            Thread.sleep(1);  //to show the difference in time taken by sequential and parallel stream
                        } catch (Exception e) {
                        }
                        return n*2;
                    })
                    .mapToInt(n -> n)  //convert to IntStream
                    .sum();
        long endSeq= System.currentTimeMillis();
        
        long startSeq1= System.currentTimeMillis();
        int sum1= nums.parallelStream()
                    .map( n -> {
                        try {
                            Thread.sleep(1);  //to show the difference in time taken by sequential and parallel stream
                        } catch (Exception e) {
                        }
                        return n*2;
                        })
                    .mapToInt(n -> n)  //convert to IntStream
                    .sum();
        long endSeq1= System.currentTimeMillis();

        System.out.println(sum + " " + sum1);
        System.out.println("Time taken by sequential stream: "+ (endSeq - startSeq) + " ms");
        System.out.println("Time taken by parallel stream: "+ (endSeq1 - startSeq1) + " ms");
    }
}