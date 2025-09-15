import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest10 {
    public static void main(String[] args) {
        // Initialize a list of names
        List<String> names = new ArrayList<>();

        // Add names to the list at specific indices
        names.add(0, "Major");    // Index 0
        names.add(1, "Mbandi");   // Index 1
        names.add(2, "Amy");      // Index 2
        names.add(3, "Kiema");    // Index 3
        names.add(4, "Kitonga");  // Index 4

        // Create a ListIterator to traverse the list
        ListIterator<String> itr = names.listIterator();

        // Traverse and print elements in forward direction
        System.out.println("Traversing elements in forward direction:");
        while (itr.hasNext()) {
            System.out.println("Index: " + itr.nextIndex() + " | Value: " + itr.next());
        }

        // Traverse and print elements in backward direction
        System.out.println("Traversing elements in backward direction:");
        while (itr.hasPrevious()) {
            System.out.println("Index: " + itr.previousIndex() + " | Value: " + itr.previous());
        }
    }
}