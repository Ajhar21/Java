import java.util.Arrays;
import java.util.List;

/************************ Method Reference ********************
 * Method Reference is passing the method name as a parameter in a method call
 * Mention the class name or object name followed by :: method name or operator name
 * 
 *************************************************************/

public class MethodReference {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Ajhar", "Navin", "Sabbir");

        List <String> uNames = names.stream()
                                    //    .map(name -> name.toUpperCase())
                                       .map(String :: toUpperCase)  //Method Reference
                                       .toList();   //toList() will convert Stream to List
        
        uNames.forEach(System.out :: println);  //Method Reference
    }
}
