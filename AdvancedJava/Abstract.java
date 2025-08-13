/*
 * abstract method must be declared in an abstract class
 * abstract class can have abstract method & concrete method both
 * abstract class has no compulsory to declare abstract method
 * abstract method is a method which is compulsory for inherited class to implement
 * no object can be created for abstract class, can be created for inherited classes of abstract class
 * abstract class only be declared in abstract class, implementation always done in inherited class
 * 
 */

abstract class Car{
    public abstract void Drive();   //abstract class

    public void playMusic(){
        System.out.println("Playing Music...");
    }
}

abstract class WagonR extends Car{   //abstract class
    public abstract void Drive();
    // {
    //     System.out.println("Driving...");
    // }
    public void playMusic(){
    System.out.println("Playing Music WagonR...");
    }
}
class UpdatedWagonR extends WagonR{     //concrete class
    public void Drive(){    //must implement abstract method
        System.out.println("Driving updated wagonR");
    }
}
public class Abstract{
    public static void main(String[] args){
        Car myCar=new UpdatedWagonR() ;
        myCar.Drive();
        myCar.playMusic();
    }
}
/* 
public class Main{
    public static void main(String[] args) {
        QuestionService service=new QuestionService();

        service.playQuiz();
        service.printScore();
    }
}*/