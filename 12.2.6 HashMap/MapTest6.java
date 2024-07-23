import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry; 

public class MapTest6 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("Kenya",        "Nairobi");
		hashMap.put("Uganda",       "Kampala");
		hashMap.put("Tanzania",     "Dodoma");
		hashMap.put("Ethiopia",     "Addis Ababa");
		hashMap.put("Rwanda",       "Kigali");
		hashMap.put("South Africa", "Johannesburg");
		
		Set<String> keySet = hashMap.keySet();		
		Collection<String> values = hashMap.values();

		 // Iterate over the entries and print key-value pairs
        for (Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 		
	}	
}
