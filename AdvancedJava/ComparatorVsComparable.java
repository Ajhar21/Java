import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*****************************Comparator Vs Comparable***********************************************
 * Collections is a final class, provides methods like sorting, searching, reversing, synchronizing, etc in Collection.
 * Comparator and Comparable are both interfaces in Java used for sorting objects, 
 * but they have some key differences
 * 1. Comparable: is an interface which has compareTo method.
 *    - It is used to define the natural ordering of objects.
 *   - It is implemented by the class whose objects need to be sorted.
 *   - It has a single method compareTo(Object obj) that compares the current object with the specified object.
 *  - It modifies the original class.
 *  - Example: String, Integer, and other wrapper classes implement Comparable interface.
 * 2. Comparator:
 *   - It is used to define multiple ways to sort objects.
 *  - It's a functional interface, can be implemented using lambda expressions or anonymous classes.
 *  - It has two methods compare(abstract method) and equals(concrete method) that compare two objects.
 ***************************************************************************************************/
class Students implements Comparable<Students> { //must implement Comparable interface to use compareTo method
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public int compareTo(Students that) { //that is another object to compare with, good practice to use 'that' instead of 's' or other variable name
        if (this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class ComparatorVsComparable {
    public static void main(String[] args) {

        /*******************Comparator <Integer> *********************/

        Comparator <Integer> com= new Comparator<Integer>() { 
            //must specify the type of Comparator both side for anonymous class
            public int compare(Integer n1, Integer n2) {    //must pass Integer instead of int
                if (n1%10 > n2%10) //sorting based on last digit
                    return 1;
                else
                    return -1;                
            }
        };

        List <Integer> nums= new ArrayList<>();
        nums.add(54);
        nums.add(13);
        nums.add(36);
        nums.add(22);
        nums.add(45);
        System.out.println("Before sorting: " + nums);
        Collections.sort(nums,com); //sorting based on Comparator
        System.out.println("After sorting: " + nums);    

         /*******************Comparator <String> *********************/

        Comparator <String> comString= (s1,s2) -> s1.length() > s2.length() ? 1 : -1; //sorting based on length of string using lambda expression

        List <String> names= new ArrayList<>();
        names.add("Ajhar");
        names.add("Zebraaa");
        names.add("Apple");
        names.add("Mangoes");
        names.add("Bananaaaaa");
        System.out.println("Before sorting: " + names);
        Collections.sort(names,comString); //sorting based on Comparator
        System.out.println("After sorting: " + names);

        /*******************Comparator <Students> *********************/

        // Comparator <Students> comAge= new Comparator<Students>() {
        //     public int compare(Students s1, Students s2){
        //         if (s1.age > s2.age){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };

        Comparator <Students> comAge= (s1,s2) -> s1.age > s2.age ? 1 : -1; //sorting based on age using lambda expression

        List <Students> studs= new ArrayList<>();
        studs.add(new Students("Ajhar", 28));
        studs.add(new Students("Anoy", 24));
        studs.add(new Students("Prottoy", 26));
        studs.add(new Students("Shuvo", 25));
        System.out.println("Before sorting: ");
        for (Students s: studs){
            System.out.println(s);
        }

        Collections.sort(studs, comAge); //sorting based on age using Comparator
        System.out.println("After sorting based on age: ");
        for (Students s: studs){
            System.out.println(s);
        }

        /*******************Comparable <Students> *********************/

        List <Students> studs1= new ArrayList<>();
        studs1.add(new Students("Sabab", 30));
        studs1.add(new Students("Noman", 26));
        studs1.add(new Students("Joy", 27));
        studs1.add(new Students("Emon", 28));
        System.out.println("Before sorting: ");
        for (Students s: studs1){
            System.out.println(s);
        }

        Collections.sort(studs1); //must implement compareTo method in Students class to use Comparable
        System.out.println("After sorting based on age: ");
        for (Students s: studs1){
            System.out.println(s);
        }


    }
}