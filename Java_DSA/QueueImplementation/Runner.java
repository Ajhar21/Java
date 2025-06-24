public class Runner {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(5);
        q.show();
        q.enQueue(4);
        q.show();
        q.enQueue(3);
        q.show();
        q.enQueue(2);
        q.show();
        q.enQueue(1);
        q.show();
        q.deQueue();
        q.show();
        q.deQueue();
        q.show();
        q.enQueue(6);
        q.show();
        q.enQueue(7);
        q.show();
        q.enQueue(9);
        q.show();

        System.out.println("Queue Size is: " + q.getsize());
        System.out.println("isEmpty: "+ q.isEmpty());
        System.out.println("isFull: " + q.isFull());
    }
}
    

