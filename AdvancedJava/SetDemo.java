import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*************************** Set ******************************
 * Set is a collection that doesn't allow duplicate elements
 * HashSet is a class that implements the Set interface
 * Set isn't ordered, so it doesn't have index
 * Set isn't sorted, so the elements are not in any particular order
 * TreeSet is a class that implements the Set interface and sorts the elements in ascending order
 ******************************************************************/

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums= new HashSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(20);  //duplicate element, will be ignored

        System.out.println("Elements in the set: " + nums);

        for (Object n : nums) {
            n=(Integer)n;  //type casting
            System.out.println(n);
        }

        Set <Integer> num1= new TreeSet<>(); 
        num1.add(50);
        num1.add(40);
        num1.add(30);
        num1.add(40);  //duplicate element, will be ignored
        System.out.println("Elements in the sorted set: " + num1);

        Collection<Integer> num2 = new TreeSet<>(); //Collection can take Set as well
        num2.add(60);
        num2.add(70);
        num2.add(80);
        num2.add(50);  //duplicate element, will be ignored
        Iterator<Integer> values = num2.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
