import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry; 

public class MapTest5 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("Major",     "Mbandi");
		hashMap.put("Amy",       "Kiema");
		hashMap.put("Chief",     "Kiema");
		hashMap.put("Mitchelle", "Kiema");
		hashMap.put("Florence",  "Beti");
		hashMap.put("Kiema",     "Mbandi");
		
		Set<String> keySet = hashMap.keySet();		
		Collection<String> values = hashMap.values();

		 // Iterate over the entries and print key-value pairs
        for (Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 		
	}	
}
