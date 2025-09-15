import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*************************** Map ******************************
 * 
 * 1. Map is a key-value pair data structure. It's an interface in java.util package.
 * 2. Each key is unique, but values can be duplicate.
 * 3. Key is a set, values is List. Means Map is combination of Set and List.
 * 3. Commonly used classes that implement Map interface:
 *    a. HashMap
 *    b. Hashtable(Hashtable & HashMap almost same, only difference is synchronization)
 *    c. TreeMap
 * 4. HashMap is not synchronized and allows null key and null values.
 * 5. Hashtable is synchronized and doesn't allow null key and null values. Good for multi-threaded environment.
 * 6. TreeMap is sorted based on the natural ordering of keys.
 ***************************************************************/

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students= new HashMap<>();
        Map<String, Integer> students1= new Hashtable<>(); //same as HashMap, but synchronized and doesn't allow null key and null values
        students.put("Ajhar", 60);
        students.put("Anoy", 70);
        students.put("Prottoy", 80);
        students.put("Shuvo", 85);

        students.put("Anoy", 75); //duplicate key, will update the value

        System.out.println("Students and their marks: " + students);
        System.out.println("Marks of Anoy : "+ students.get("Anoy"));
        System.out.println("Set of keys: " + students.keySet());
        System.out.println("List of values: " + students.values());

        for (String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }

    }
}
