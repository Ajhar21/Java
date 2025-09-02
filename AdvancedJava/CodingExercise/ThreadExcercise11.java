class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task "+i);
        }
    }
}

public class ThreadExcercise11 {
    public static void main(String[] args) {
        Runnable task = new PrinterTask();

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();
        try {
            t1.join();   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
