import java.util.LinkedList; // Import LinkedList class
import java.util.Arrays;     // Import Arrays utility class for array operations

public class TestLinkedListToArray {

    public static void main(String[] args) {

        // Create a LinkedList to be used as a stack (LIFO data structure)
        LinkedList<String> stack = new LinkedList<>();

        // Push elements onto the stack
        // Each push() inserts the element at the beginning of the list
        stack.push("Zero");    // Stack: [Zero]
        stack.push("First");   // Stack: [First, Zero]
        stack.push("Second");  // Stack: [Second, First, Zero]
        stack.push("Third");   // Stack: [Third, Second, First, Zero]
        stack.push("Fourth");  // Stack: [Fourth, Third, Second, First, Zero]

        // Convert the LinkedList to an Object[] array
        // toArray() returns an array containing all elements in stack order
        System.out.println("Stack elements: " + Arrays.toString(stack.toArray()));
    }
}