import java.util.LinkedList; // Import LinkedList class from java.util package

public class TestLinkedListGet {

    public static void main(String[] args) {

        // Create a LinkedList to be used as a stack (LIFO structure)
        LinkedList<String> stack = new LinkedList<>();

        // Push elements onto the stack
        // push() inserts elements at the head (index 0) of the LinkedList
        stack.push("Zero");   // Stack: [Zero]
        stack.push("First");  // Stack: [First, Zero]
        stack.push("Second"); // Stack: [Second, First, Zero]

        // Retrieve the element at index 1 without removing it
        // get(1) returns the second element in the list
        System.out.print
