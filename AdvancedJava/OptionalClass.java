import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/*********************Optional Class*******************************
 * Optional class has been introduced in Java 8 to handle null values more effectively.
 * It avoids null pointer exceptions.
 * 
 *******************************************************************/

public class OptionalClass {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Ajhar", "John", "Jane", "Jack");

        /*Returning the first value where it contains character 'o' */

        Optional <String> nam= names.stream()
                                    .filter(str -> str.contains("f"))
                                    .findFirst();  //returns Optional class object

        try{
            System.out.println(nam.get());  //get() method returns the value if present
            //will throw NoSuchElementException if value is not present
        }catch(NoSuchElementException e){
            System.out.println("No value present" + e);
        }

        System.out.println(nam.orElse("Not found")); //if value is present, return value else return "Not found"
        //orElse() method handles NoSuchElementException internally

        /* Solution without importing Optional class import explicitly */
        String name = names.stream()
                           .filter(str -> str.contains("o"))
                           .findFirst()
                           .orElse("Not found");  //if no value found, return "Not found"
        System.out.println(name);
    }
}
