public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        /*stack.push(15);
        stack.push(30);
        stack.push(60);
        stack.push(120);*/
        System.out.println(stack.pop());
        stack.show();
        System.out.println("Size is: "+ stack.size());
        /*System.out.println();
        System.out.println(stack.pop());
        stack.show();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println("Size is: "+ stack.size());*/
    }
}
