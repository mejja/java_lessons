import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry; 

public class MapTest4 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("12", "Number 1");
		hashMap.put("13", "Number 2");
		hashMap.put("24", "Number 3");
		hashMap.put("33", "Number 4");
		hashMap.put("rr", "Number 5");
		hashMap.put("gt", "Number 6");
		hashMap.put("qq", "Number 7");
		
		Set<String> keySet = hashMap.keySet();		
		Collection<String> values = hashMap.values();

		 // Iterate over the entries and print key-value pairs
        for (Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 		
	}	
}
