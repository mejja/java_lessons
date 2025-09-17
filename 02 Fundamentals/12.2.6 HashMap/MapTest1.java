import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
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

        // Retrieve and print the set of keys
        Set<String> keySet = hashMap.keySet();
        System.out.println("Keys in the HashMap:");
        for (String key : keySet) {
            System.out.println(key);
        }

        // Retrieve and print the collection of values
        Collection<String> values = hashMap.values();
        System.out.println("\nValues in the HashMap:");
        for (String value : values) {
            System.out.println(value);
        }

        // Optionally, print key-value pairs together
        System.out.println("\nKey-Value pairs:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }
    }
}