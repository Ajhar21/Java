/**************************************************************
 * final keyword for three cases:
 * variable: final variable can't be changed or assigned again, work as constant
 * method: final method can't be overrided
 * class: final class can't be inherited
 **************************************************************/
final class Calc{          
    final double pai=3.1416;

    // public Calc(double pai){ }  constructor won't work as pai is a constant variable
    public void show(){
        System.out.println("In class Calc");
    }

    final public void add(int a, int b){    //final method can't be overrided
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{}    //final class can't be inherited
public class finalKeyword {
    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.show();
        obj.add(5, 4);
        
    }
}
