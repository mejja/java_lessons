import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest6 {
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> hashMap = new HashMap<>();

        // Populate the HashMap with African countries and their capitals
        hashMap.put("Kenya",        "Nairobi");
        hashMap.put("Uganda",       "Kampala");
        hashMap.put("Tanzania",     "Dodoma");
        hashMap.put("Ethiopia",     "Addis Ababa");
        hashMap.put("Rwanda",       "Kigali");
        hashMap.put("South Africa", "Johannesburg");

        // Retrieve the set of keys (countries)
        Set<String> keySet = hashMap.keySet();

        // Retrieve the collection of values (capitals)
        Collection<String> values = hashMap.values();

        // Print all country-capital pairs
        System.out.println("African Countries and Their Capitals:");
        for (Entry<String, String> entry : hashMap.entrySet()) {
            String country = entry.getKey();     // Get the country name
            String capital = entry.getValue();   // Get the capital city
            System.out.println(country + ": " + capital);
        }
    }
}