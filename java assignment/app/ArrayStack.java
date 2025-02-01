public class ArrayStack implements Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold the stack elements
    private int top; // Index of the top element

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack
    @Override
    public void push(int item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Cannot push " + item);
        }
        stackArray[++top] = item; // Increment top and insert the item
    }

    // Method to remove and return the top element from the stack
    @Override
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot pop.");
        }
        return stackArray[top--]; // Return the top element and decrement top
    }

    // Method to return the top element without removing it
    @Override
    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot peek.");
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}