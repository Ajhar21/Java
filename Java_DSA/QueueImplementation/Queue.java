public class Queue {
    int queue[]=new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        if (!isFull()){
            queue[rear]=data;
            rear=(rear+1)%5; //5%5==0 will change index to zero(circular array) //changing pointer for rear
            size=size+1;;
        }
        else{
            System.out.println("Queue is Full");
        }

    }

    public int deQueue(){
        int data=queue[front];
        if (!isEmpty()){
            front=(front+1)%5;    //5%5==0 will change index to zero(circular array) //changing pointer for front
            size=size-1;
        }
        else{

            System.out.println("Queue is empty");
        
        }
        return data;
    }

    public int getsize(){
        return size;
    }

    public boolean isEmpty(){
        return getsize()==0;
    }

    public boolean isFull(){
        return getsize()==5;
    }

    public void show(){
        System.out.print("Queue Elements are: ");
        for (int i=0; i<size;i++){
            System.out.print(queue[(front+i)%5] + " ");   //front pinter change mod circuler array
        }
        System.out.println();

        for (int i:queue){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}