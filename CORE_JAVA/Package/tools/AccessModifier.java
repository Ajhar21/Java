package Package.tools;

public class AccessModifier {
    // int marks;  //default access modifier can be accessed anywhere in same package, not other place
    // public int marks;  //public access modifier can be accessed from anywhere
    // private int marks;  //private access modifier only can be accessed in same class
    protected int marks;  //protected access modifier can be accessed from same class, same package, sub-classes
}


/*
 * class attribute should be private
 * method should be public. can be protected also for purpose
 * never use dafault access modifier
 */