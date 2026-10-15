// Custom exception class for handling empty stack operations
class stackEmptyException extends Exception {
    public stackEmptyException() {
        super("Stack is empty!");
    }
}

// Node class representing each element in the linked list
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Your custom generic Stack implementation using a Linked List
class stack<T> {
    private Node<T> head;
    private int size;

    // Push: Adds an element to the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Pop: Removes and returns the top element of the stack
    public T pop() throws stackEmptyException {
        if (size == 0) {
            throw new stackEmptyException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Top: Returns the top element without removing it
    public T top() throws stackEmptyException {
        if (size == 0) {
            throw new stackEmptyException();
        }
        return head.data;
    }

    // Size: Returns the number of elements in the stack
    public int size() {
        return size;
    }

    // IsEmpty: Checks if the stack has no elements
    public boolean isEmpty() {
        return size == 0;
    }
}

// Main class to run and test the custom stack
class stackuse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Using your custom stack instead of java.util.Stack
        stack<Integer> myStack = new stack<>();

        System.out.println("Pushing elements onto the stack...");
        for (int val : arr) {
            myStack.push(val);
            System.out.println("Pushed: " + val);
        }

        try {
            System.out.println("\nStack stats:");
            System.out.println("Stack size: " + myStack.size());
            System.out.println("Top element: " + myStack.top());
            System.out.println("Is stack empty? " + myStack.isEmpty());

            System.out.println("\nPopping elements from the stack:");
            while (!myStack.isEmpty()) {
                System.out.println("Popped: " + myStack.pop());
            }

            System.out.println("\nFinal check:");
            System.out.println("Is stack empty? " + myStack.isEmpty());

            // This will trigger the exception to show it works
            System.out.println("\nTrying to pop from an empty stack...");
            myStack.pop();

        } catch (stackEmptyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}