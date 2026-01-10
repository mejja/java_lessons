import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Demonstrates the use of a nested Map structure:
 * a Map whose values are Lists of Money objects.
 */
public class NestedMapEg1 {

    public static void main(String[] args) {

        // Create a Map where the key is a String and the value is a List of Money
        Map<String, List<Money>> outerMap = new HashMap<>();

        // Create an inner list to hold Money objects
        List<Money> moneyList = new ArrayList<>();

        // Add a Money object to the inner list
        moneyList.add(new Money(Currency.USD, 100));

        // Associate the list with a key in the map
        outerMap.put("Mr X", moneyList);

        // Print the nested map structure
        System.out.println("outerMap = " + outerMap);
    }
}
