
/********************** ANNOTATION **************
 * 
 * Annoration is a suplement to compiler 
 * It gives instruction to compiler
 * It helps to reduce error
 * Annotation can be set on both at complile time or runtime
 * 
 ***************************************************/

@Deprecated     //this annotation means this class code can be deleted
class A{
    public void showMethodWhereItBelongsTo(){
        System.out.println("In at show A");
    }
}

class B extends A{

    @Override
    public void showMethodWhereItBelongsTo(){
        System.out.println("In at show B");
    }
}
public class Annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.showMethodWhereItBelongsTo();
    }
}
