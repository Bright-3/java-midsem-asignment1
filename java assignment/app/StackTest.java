public class StackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // Create a stack with a maximum size of 5

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println("Top element is: " + stack.peek());

            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());

            System.out.println("Top element is: " + stack.peek());

            stack.push(60);
            stack.push(70); // This will throw a StackOverflowException

        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}