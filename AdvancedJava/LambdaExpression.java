
/******************* LambdaExpression ***********************
 * 
 * Lambda expression only applicable for funstional interface implementation
 * it actually reduces code lines
 *  -> this is lambda expression
 * 
 ********************************************************/

@FunctionalInterface    //this annotation define it can have only one abstract method
interface A{
    void show();
    // void config();
}

@FunctionalInterface    //this annotation define it can have only one abstract method
interface B{
    void show(int i, int j);
    // void config();
}

@FunctionalInterface    
interface C{
    int show(int i, int j);     //method return value
    // void config();
}

// class B implements A{
//     public void show(){
//         System.out.println("In show B");
//     }
// }

public class LambdaExpression {
    public static void main(String[] args) {
        A obj=() -> System.out.println("In show");  //no need to use curly bracket for one line

        obj.show();

        B obj1= (i, j) -> {     //(int i, int j) also fine
            System.out.println("In show B");
            System.out.println("Test second statement:" + i +" " + j); //multiple statements
        };

        obj1.show(5, 6);

        C obj2=(i,j) -> i+j;    //when writing one statement without curly, can't write return

        int result=obj2.show(5, 6);
        System.out.println(result);
    }
}

