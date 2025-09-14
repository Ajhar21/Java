/****************** Race Condition ******************
 * Mutable -> changeable    
 * Immutable -> unchangeable ex.String
 * 
 * join() is a method of the Thread class.
 * Make the current thread wait until another join calling thread has finished its execution.”
 * 
 * Thread isn't safe for muting same variable, so it should be safe by synchronization
 * when a methond is synchronized, only one thread can access that method at a time
 * use synchronized keyword to make method synchronized
 * 
 * when not using synchronized keyword, different thread access same variable at the same time
 * 
 */

class Counter {
    int count;
    public synchronized void  increment(){
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        Counter c=new Counter();

        Runnable obj1=() -> {
            for (int i=0; i<1000; i++){
                c.increment();
            }
        };
        Runnable obj2=() -> {
            for (int i=0; i<1000; i++){
                c.increment();
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count is: " +c.count);

    }
}

