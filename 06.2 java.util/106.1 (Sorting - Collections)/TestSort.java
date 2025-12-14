import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting of an ArrayList of Strings in Java.
 */
public class TestSort {

    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        List<String> unsortedArray = new ArrayList<>();

        // Add elements to the ArrayList
        unsortedArray.add("Cherry");
        unsortedArray.add("Apple");
        unsortedArray.add("Banana");

        // Print the ArrayList before sorting
        System.out.println("Unsorted ArrayList: " + unsortedArray);

        // Sort the ArrayList in ascending (natural) order
        Collections.sort(unsortedArray);

        // Print the ArrayList after sorting
        System.out.println("Sorted ArrayList: " + unsortedArray);
    }
}
