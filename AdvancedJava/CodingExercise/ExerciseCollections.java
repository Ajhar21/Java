package CodingExercise;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
// import java.util.TreeSet;

public class ExerciseCollections {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Alice", "Bob", "Alice", "David","Bob");
        System.out.println("Original List: " + names);


        Set<String> uniqueNames=new LinkedHashSet<>(names); //TreeSet also can be used for as natural sorted order
        //HashSet does not maintain order, LinkedHashSet maintains insertion order
        System.out.println("Unique Names: " + uniqueNames);
        

    }
}
