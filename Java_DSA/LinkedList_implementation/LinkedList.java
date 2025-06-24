//5,6,7
public class LinkedList{
    Node head;

    public void insert(int data){   //inserting at tail
        Node node=new Node();
        node.data=data;
        node.next=null;

        if (head==null){
            head=node;
        }
        else{
            Node n=head;

            while(n.next != null){
                n=n.next;
            }
            n.next=node;

        }
    }

    public void insertAtFirst(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }

    public void insertAt(int index, int data){
        Node node=new Node();
        node.data=data;
        node.next=null;


        if (index==0){
            insertAtFirst(data);
        }

        else{
            Node n=head;
            for (int i=0; i < index-1; i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }

    }

    public void deleteAt(int index){
        Node node=head;
        if (index==0){
            head=node.next;
        }
        else{
            Node n=head;
            Node n1=null;
            for (int i=0; i< index -1; i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1 " + n1.data);
            n1=null; //it will delete the node from memory also by garbage collector

        }
    }

    public void show(){
        Node node=head;

        while(node.next != null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}