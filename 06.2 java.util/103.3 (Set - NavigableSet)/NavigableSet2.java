import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Demonstrates basic usage of NavigableSet using TreeSet in Java.
 * Shows how to add elements and retrieve the first (lowest) element.
 */
public class NavigableSet2 {

    public static void main(String[] args) {
        // Create a NavigableSet of Long values using TreeSet
        NavigableSet<Long> navigableSet = new TreeSet<>();

        // Add elements to the NavigableSet
        navigableSet.add(88L);
        navigableSet.add(11L);
        navigableSet.add(77L);
        navigableSet.add(22L);
        navigableSet.add(99L);

        // Print the NavigableSet (automatically sorted in ascending order)
        System.out.println("NavigableSet: " + navigableSet);

        // Retrieve and print the first (lowest) element
        System.out.println("The First Item in the Set is: " + navigableSet.first());
    }
}
