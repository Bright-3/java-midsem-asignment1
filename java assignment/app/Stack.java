public interface Stack {
    void push(int item) throws StackOverflowException;
    int pop() throws StackUnderflowException;
    int peek() throws StackUnderflowException;
    boolean isEmpty();
    boolean isFull();
}