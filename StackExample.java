
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Remove the top element
        stack.pop();

        System.out.println("After popping: " + stack);

        // Display the top element
        System.out.println("Top element: " + stack.peek());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
