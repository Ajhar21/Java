
/***************************** Thread Priority & Sleep  ************************
 * Thead max priority is 10, min is 1, default/normal is 5
 * MIN_PRIORITY=1, MAX_PRIORITY=10, NORM_PRIORITY=5
 * getPriority() method of Thread class is used to get priority
 * 
 * setPriority() method of Thread class is used to set priority
 * getPriority() method of Thread class is used to get priority
 * Thread with higher priority is executed first
 * 
 * sleep() method of Thread class is used to pause execution for specified time
 * sleep() count time on milliseconds
 * even after using sleep one thread may execute more than other once at a time,
 * because the multiple can reach scheluer same time, then Priority matters
 ********************************************************************/

class A extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}

class B extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrioritySleep {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        obj2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}

