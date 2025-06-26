/*
Method overriding: same method name with same parameter will behave differently

 */
 
class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvanceCalc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}
public class method_overriding {
    public static void main(String[] args) {
        AdvanceCalc obj=new AdvanceCalc();
        int value=obj.add(3,4); //it will override Calc method add by calling it's own method
        System.out.println(value);
    }
}
