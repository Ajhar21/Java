public class Runner {
    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.push(15);
        stack.show();
        stack.push(30);
        stack.show();
        stack.push(60);
        stack.show();
        stack.push(120);
        stack.show();
        stack.push(100);
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();

    }
}
