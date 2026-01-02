import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstrates iterating over a List of objects using an Iterator.
 */
public class Banana {

    @Override
    public String toString() {
        return "banana";
    }

    public static void main(String[] args) {

        // Create a List to store Banana objects
        List<Banana> bananaList = new ArrayList<>();

        // Add Banana objects to the list
        bananaList.add(new Banana());
        bananaList.add(new Banana());
        bananaList.add(new Banana());

        // Obtain an Iterator for the list
        Iterator<Banana> iterator = bananaList.iterator();

        // Iterate through the list and print each Banana
        while (iterator.hasNext()) {
            Banana banana = iterator.next();
            System.out.println(banana); // toString() is called implicitly
        }
    }
}
