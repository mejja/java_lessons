import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the use of generics with Map and HashMap in Java.
 */
public class GenericsEg2 {

    public static void main(String[] args) {

        // Create a Map with Integer keys and String values (type-safe)
        Map<Integer, String> strings = new HashMap<>();

        // Add key-value pairs to the map
        strings.put(1, "one");
        strings.put(2, "two");
        strings.put(3, "three");

        // Print the contents of the map
        System.out.println("strings = " + strings);
    }
}
