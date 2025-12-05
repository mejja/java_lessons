import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Demonstrates basic usage of NavigableSet using TreeSet in Java.
 * NavigableSet allows for navigation methods like lower, higher, floor, and ceiling.
 */
public class NavigableList1 {

    public static void main(String[] args) {
        // Create a NavigableSet of Integers using TreeSet
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Add elements to the set
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);

        // Print the NavigableSet (automatically sorted)
        System.out.println("NavigableSet: " + navigableSet);

        // Demonstrate navigation methods
        System.out.println("Lower than 30: " + navigableSet.lower(30));   // 20
        System.out.println("Higher than 30: " + navigableSet.higher(30)); // 40
        System.out.println("Floor of 25: " + navigableSet.floor(25));     // 20
        System.out.println("Ceiling of 25: " + navigableSet.ceiling(25)); // 30

        // Print in descending order
        System.out.println("Descending Set: " + navigableSet.descendingSet());
    }
}
