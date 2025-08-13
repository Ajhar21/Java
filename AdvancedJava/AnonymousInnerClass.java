/*
    **********************AnonymousInnerClass********************
 * AnonymousInnerClass is used specially when class need to be used for onetime
 * when it needs multiple reuse, then there shouldn't be AnonymousInnerClass, should be a seperate class
 * it's actually method overriding without creating different class by using anonymous inner class
 */
class A{
    public void show(){
        System.out.println("In show method");
    }
}

// class B extends A{  //should be the way when it needs to reuse multiple times
//     public void show(){
//         System.out.println("In show Updated");
//     }    
// }
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {   //method overriding without creating a different class
            public void show(){
                System.out.println("In show by anonymous Inner Class");
            }
        };
        obj.show();     
    }
}
