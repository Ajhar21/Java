public class Runner{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);

        //list.show();

        list.insertAtFirst(4);
        list.show();

        System.out.println();

        list.insertAt(0, 10);
        list.show();
        System.out.println();
        list.deleteAt(2);
        list.show();
    
    }

}