import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest3 {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> hashMap = new HashMap<>();

        // Populate the HashMap with sample entries
        hashMap.put("key1", "A");
        hashMap.put("key2", "B");
        hashMap.put("key3", "C");
        hashMap.put("key4", "D");
        hashMap.put("key5", "E");
        hashMap.put("key6", "F");

        // Retrieve the set of keys (not used in this version, but available)
        Set<String> keySet = hashMap.keySet();

        // Retrieve the collection of values
        Collection<String> values = hashMap.values();

        // Print all values in the HashMap
        System.out.println("Values in the HashMap:");
        for (String value : values) {
            System.out.println(value);
        }
    }
}