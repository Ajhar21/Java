package CodingExercise;

interface Mechine{
    String start(); 
}

abstract class Appliance implements Mechine{

    private String name;

    public Appliance(String name){
        this.name=name;
    } 
}

class Fan extends Appliance{

    public Fan(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String start(){
        return "Fan is running";
    }

    // public Appliance(String name){

    // }
}

class WashingMachine extends Appliance{
    @Override
    public String start(){
        return "Washing Machine is operating";
    }

    public WashingMachine(String name){
        super(name);
    }
}

public class ExEightInterface {
    public static void main(String[] args) {
        Mechine fan;
        fan=new Fan("Fan");
        System.out.println(fan.start());
        Mechine washer;
        washer= new WashingMachine("Washing Machine");
        System.out.println(washer.start());
    }
}
