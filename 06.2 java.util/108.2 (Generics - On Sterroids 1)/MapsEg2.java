import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates storing multiple entries in a Map using generics.
 * Each key maps to a Money value.
 */
public class MapsEg2 {

    public static void main(String[] args) {

        // Create a Map with String keys and Money values
        Map<String, Money> shareMap = new HashMap<>();

        // Add multiple entries to the map
        shareMap.put("Mr Sly", new Money(Currency.USD, 1000));
        shareMap.put("Mr Slicko", new Money(Currency.USD, 1000));
        shareMap.put("Mr No3", new Money(Currency.USD, 1000));
        shareMap.put("Mr John", new Money(Currency.USD, 1000));

        // Print the contents of the map
        System.out.println("shareMap = " + shareMap);
    }
}

