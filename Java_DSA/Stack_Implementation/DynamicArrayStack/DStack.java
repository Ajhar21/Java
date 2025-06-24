public class DStack{
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;

    public void push(int data){  //insert value in top
        if (this.size()==capacity){
            expand();
        }
        stack[top]=data;
        top++;

    }

    public void expand(){
        int length=this.size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        capacity=capacity*2;
        stack=newStack;
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
            shrink(); 
        }
        return data;

    }
    public void shrink(){
        int length=this.size();
        if (length==(capacity/2)/2){
            capacity=capacity/2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack,0, newStack , 0, length);
        stack=newStack;

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
        System.out.println();
    }
}