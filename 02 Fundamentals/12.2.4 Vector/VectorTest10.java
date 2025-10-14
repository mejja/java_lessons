import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VectorTest10 {
    public static void main(String[] args) {

        // Create a List to store names using ArrayList implementation
        List<String> names = new ArrayList<>();

        // Add names to the list at specific indices
        names.add(0, "Major");
        names.add(1, "Mbandi");
        names.add(2, "Amy");
        names.add(3, "Kiema");

        // Create a ListIterator to traverse the list
        ListIterator<String> iterator = names.listIterator();

        // Traverse the list in forward direction
        System.out.println("Traversing elements in forward direction:");
        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex() + " | Value: " + iterator.next());
        }

        // Traverse the list in backward direction
        System.out.println("Traversing elements in backward direction:");
        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex() + " | Value: " + iterator.previous());
        }
    }
}
