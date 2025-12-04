import java.util.Collections;
import java.util.Vector;

/**
 * Demonstrates sorting of a Vector in Java.
 */
public class TestVectorSort {

    public static void main(String[] args) {
        // Initialize an array of Long numbers
        Long[] numerals = {10L, 5L, 7L, 2L, 8L};

        // Create a Vector to store the numbers
        Vector<Long> stack = new Vector<>();

        // Add all elements from the array to the Vector
        Collections.addAll(stack, numerals);

        // Print the Vector before sorting
        System.out.println("Unsorted Vector: " + stack);
