
/***************************** Thread Priority & Sleep  ************************
 * Thread class implements Runnable interface
 * Thread has a constructor to accept Runnable interface object
 * so we can create thread class by implementing Runnable interface also
 * Ruunable interface has abstract run method only, so it is a functional interface
 * so, we can use lambda expression also to create thread
 * 
 * We have to create separate Thread class object by passing Runnable interface object
 * Java does not support multiple inheritance with classes
 * but it support inheritance & implementation with interface at the same time
 ********************************************************************/

class A implements Runnable{
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

class B implements Runnable{
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

public class RunnableVsThread {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        /*Ruunable donen't have any start, only Thread class has start() method */

        // obj1.start();
        // obj2.start();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        Runnable obj3=() -> {
            for (int i=0; i<10; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Runnable obj4=() -> {
            for (int i=0; i<10; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        /*Ruunable donen't have any start, only Thread class has start() method */

        // obj1.start();
        // obj2.start();
        System.out.println("Lambda Expression");

        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);

        t3.start();
        t4.start();



    }
}

