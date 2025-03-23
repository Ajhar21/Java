class Human{
    private String name;    //only accessible inside class block
    private int age;

    public void setName(String name){   //setter
        this.name=name;
    }
    public String getName(){    //getter
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj1=new Human();

        obj1.setAge(27);
        obj1.setName("Ajahr");
        System.out.println(obj1.getName()+":" + obj1.getAge());
        
    }
}
