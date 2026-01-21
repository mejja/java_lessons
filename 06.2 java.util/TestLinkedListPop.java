import java.util.LinkedList; // Import LinkedList class

public class TestLinkedListPop {

    public static void main(String[] args) {

        // Create a LinkedList to be used as a stack (LIFO – Last In, First Out)
        LinkedList<String> stack = new LinkedList<>();

        // Push elements onto the stack
        // push() inserts elements at the beginning (top) of the stack
        stack.push("First");   // Stack: [First]
        stack.push("Second");  // Stack: [Second, First]
        stack.push("Third");   // Stack: [Third, Second, First]

        // Print the stack contents before popping elements
        System.out.println("Stack contents: " + stack);

        // Pop elements from the stack
        // pop() removes and returns the first element (top of the stack)
        System.out.println("Popped element: " + stack.pop()); // Removes "Third"
        System.out.println("Popped element: " + stack.pop()); // Removes "Second"

        // Print the stack contents after popping elements
        // Only "First" remains in the stack
        System.out.println("Stack contents after pops: " + stack);
    }
}
