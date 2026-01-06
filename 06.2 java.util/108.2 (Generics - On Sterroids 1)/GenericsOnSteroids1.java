import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates iteration over a generic List using index-based access.
 */
public class GenericsOnSteroids1 {

    public static void main(String[] args) {

        // Create a List of Long values using generics (type-safe)
        List<Long> amounts = new ArrayList<>();

        // Add elements to the list
        amounts.add(1L);
        amounts.add(2L);
        amounts.add(3L);
        amounts.add(4L);

        // Iterate through the list using an index-based for loop
        for (int i = 0; i < amounts.size(); i++) {
            Long amount = amounts.get(i);
            System.out.println("Position [" + i + "] amount [" + amount + "]");
        }
    }
}

