class Calculator{
    public int add(int n1, int n2){
        int result=n1+n2;
        System.out.print("Two number sum is: ");
        return result;
    }
}

public class class_object {
    public static void main(String[] args){
    Calculator calc=new Calculator();
    int a1=5,a2=4;
    int result=calc.add(a1, a2);
    System.out.println(result);
    }
}
