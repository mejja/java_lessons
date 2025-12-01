import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates sorting of a LinkedList in Java.
 */
public class TestLinkedListSort {

    public static void main(String[] args) {
        // Initialize an array of Long numbers
        Long[] numerals = {99L, 55L, 77L, 22L, 88L};

        // Create a LinkedList to store the numbers
        List<Long> stack = new LinkedList<>();

        // Add all elements from the array to the LinkedList
        Collections.addAll(stack, numerals);

        // Print the LinkedList before sorting
        System.out.println("Unsorted LinkedList: " + stack);

        // Sort the LinkedList in ascending order
        Collections.sort(stack);

        // Print the LinkedList after sorting
        System.out.println("Sorted LinkedList: " + stack);
    }
}
