import java.util.LinkedList; // Import LinkedList class from java.util package

public class TestLinkedListPush {

    public static void main(String[] args) {

        // Create a LinkedList to be used as a stack (LIFO data structure)
        LinkedList<String> stack = new LinkedList<>();

        // Push elements onto the stack
        // push() inserts elements at the beginning (top) of the stack
        stack.push("First");   // Stack: [First]
        stack.push("Second");  // Stack: [Second, First]

        // Print the stack elements after pushing
        // The most recently pushed element appears first
        System.out.println("Stack elements after pushing: " + stack);
    }
}
