public class DStack{
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;

    public void push(int data){  //insert value in top
        if (this.size()==capacity){
            expand()
        }
        stack[top]=data;
        top++;

    }
    

    public int pop(){
        int data=0;

        if (isEmpty()){
            System.out.println("Stack is Empty");   //to avoid underflow
        }
        else {
  
            top--;
            data=stack[top];
            stack[top]=0;
        }
        return data;

    }

    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
    }
}