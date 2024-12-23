package ListDemo;
import java.util.Stack;

public class PracticeStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Peek at the top
        System.out.println("Top: " + stack.peek()); // Output: C

        // Pop elements
        System.out.println("Popped: " + stack.pop()); // Output: C
        System.out.println("Stack: " + stack);        // Output: [A, B]
    }
}
