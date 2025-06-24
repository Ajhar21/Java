class Human{
    private String name;
    private int age;
    /**
     * constructor should be same name as class
     * constructor being called with creating new object
     */ 
    
    public Human() {    // default constructor
        this.age=12;
        this.name="Babu";
    }

    public Human(String name, int age){     //parameterized constructor

        this.age=age;
        this.name=name;
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

    
}

public class constructor {
    public static void main(String [] args){

        Human obj1=new Human("Ajhar",28);
        Human obj2=new Human(); //calling default

        System.out.println(obj1.getName()+ ":" + obj1.getAge());
        
        System.out.println(obj2.getName()+ ":" + obj2.getAge());

        // obj1.setAge(28);
        // obj1.setName("Ajhar");

        // System.out.println(obj1.getName()+ ":" + obj1.getAge());
    }
      
}
