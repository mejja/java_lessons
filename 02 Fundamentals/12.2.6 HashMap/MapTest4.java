import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest4 {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> hashMap = new HashMap<>();

        // Populate the HashMap with sample entries
        hashMap.put("12", "Number 1");
        hashMap.put("13", "Number 2");
        hashMap.put("24", "Number 3");
        hashMap.put("33", "Number 4");
        hashMap.put("rr", "Number 5");
        hashMap.put("gt", "Number 6");
        hashMap.put("qq", "Number 7");

        // Retrieve the set of keys (not used here but available)
        Set<String> keySet = hashMap.keySet();

        // Retrieve the collection of values (also unused here)
        Collection<String> values = hashMap.values();

        // Iterate over the entries and print key-value pairs
        System.out.println("HashMap Entries:");
        for (Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();       // Get the key
            String value = entry.getValue();   // Get the value
            System.out.println(key + ": " + value); // Print key-value pair
        }
    }
}