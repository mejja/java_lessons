import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the use of generics with Map in Java.
 * The map associates a String key with a Money value.
 */
public class MapsEg1 {

    public static void main(String[] args) {

        // Create a Map with String keys and Money values
        Map<String, Money> shareMap = new HashMap<>();

        // Add an entry to the map
        shareMap.put("Mr X", new Money(Currency.USD, 100));

        // Print the contents of the map
        System.out.println("shareMap = " + shareMap);
    }
}

