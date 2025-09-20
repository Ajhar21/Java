import java.util.Arrays;
import java.util.List;

/********************** Constructor Reference ********************
 * Constructor Reference is a special type of method reference
 * It is used to refer the constructor of a class
 * 
 *******************************************************************/
class Student {
    private String name;
    private int age;
    
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}
public class ConstructorReference {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Ajhar", "Navin", "Sabbir");

        List <Student> students = names.stream()
                                        // .map(name -> new Student(name))
                                        .map(Student :: new)  //Constructor Reference
                                        .toList();
        
        students.forEach(System.out :: println);                            }
}
