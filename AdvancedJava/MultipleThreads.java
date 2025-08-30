/***************************** Multiple Threads ************************
 * Threads can run parallally by sharing same resources
 * 
 * Schedular decides which thread to run at what time
 * so even if we have multiple threads
 * 
 * class need to extend Thread class 
 * must call start() method to start threading
 * start is an in-built method of Thread class
 * each thread must have run method to start threading 
 * not need to call run method explicitly
 * start method internally calls run method
 * for few statement, it may look like they are not running in parallel
 * but in reality they are running in parallel
 ********************************************************************/

class A extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("Hi");
        }
        
    }
}

class B extends Thread{
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        obj1.start();
        obj2.start();
    }
}
