import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting of an ArrayList in Java.
 */
public class TestArrayListSort {

    public static void main(String[] args) {
        // Initialize an array of Long numbers
        Long[] numerals = {10L, 5L, 7L, 9L, 8L};

        // Create an ArrayList to store the numbers
        List<Long> stack = new ArrayList<>();

        // Add all elements from the array to the ArrayList
        Collections.addAll(stack, numerals);

        // Print the ArrayList before sorting
        System.out.println("Unsorted ArrayList: " + stack);

        // Sort the ArrayList in a
