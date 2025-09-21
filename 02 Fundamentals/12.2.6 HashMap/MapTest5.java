import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest5 {
    public static void main(String[] args) {
        // Create a HashMap to store first name as key and surname as value
        HashMap<String, String> hashMap = new HashMap<>();

        // Populate the HashMap with name pairs
        hashMap.put("Major",     "Mbandi");
        hashMap.put("Amy",       "Kiema");
        hashMap.put("Chief",     "Kiema");
        hashMap.put("Mitchelle", "Kiema");
        hashMap.put("Florence",  "Beti");
        hashMap.put("Kiema",     "Mbandi"); // 'Kiema' used as a key here

        // Retrieve the set of keys (not used directly here)
        Set<String> keySet = hashMap.keySet();

        // Retrieve the collection of values (also unused directly)
        Collection<String> values = hashMap.values();

        // Print all key-value pairs in the HashMap
        System.out.println("HashMap Entries:");
        for (Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();       // Get the key (first name)
            String value = entry.getValue();   // Get the value (surname)
            System.out.println(key + ": " + value); // Print formatted output
        }
    }
}
