class Calculator{

    int num=5;  //instance variable
    public int add(int n1,int n2){
        System.out.println(num);
        return n1+n2;
    }
    
}
public class instance_variable {
    public static void main(String[] args){
        Calculator calc=new Calculator();
        calc.num=8; //only first object value will be changed
        System.out.println(calc.num);
        Calculator calc2=new Calculator();
        System.out.println(calc2.num);
        
        // int result=calc.add(5, 4);

        // System.out.println(result);
    }
}
