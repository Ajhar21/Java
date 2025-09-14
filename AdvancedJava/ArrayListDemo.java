import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*********************** Collection & Arraylist **************************
 * 
 * collection API, collections, Collection
 * 
 * Collection is an interface that has several subinterfaces like List, Set, Queue
 * List is an interface that has several implementations like ArrayList, LinkedList, Vector, Stack
 * ArrayList is a class that implements the List interface
 * 
 * Collection always takes Object type
 * Collection can be printed without any loops
 * Integer is a wrapper class for int
 * Collection doesn't have index. But List has index
 *************************************************************************/

public class ArrayListDemo {
    public static void main(String[] args) {
        // Collection nums = new java.util.ArrayList();
        // nums.add(10);
        // nums.add(20);
        // nums.add(30);
        // nums.add(40);
        // nums.add(50);

        // System.out.println("Elements in the collection: " + nums);

        // for (Object n : nums) {     
        //     System.out.println(n);
        // }

        Collection<Integer> nums = new ArrayList<Integer>();    //it is integere to use generics
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        //Collection doesn't allow primitive types, so we use Integer instead of int
        //Collection doesn't have index, so we can't use for loop with index

        System.out.println("Elements in the collection: " + nums);

        for (int n : nums) {    //now we can use int, because of generics already specified Integer
            System.out.println(n);
        }

        /*************List interface for index *******************/
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);

        System.out.println(nums1.get(2));  //List has index, so we can use get() method to access elements by index
        System.out.println(nums1.indexOf(200));

    }
}
