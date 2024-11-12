import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("key1", "A");
		hashMap.put("key2", "B");
		hashMap.put("key3", "C");
		hashMap.put("key4", "D");
		hashMap.put("key5", "E");
		hashMap.put("key6", "F");
		
		Set keySet = hashMap.keySet();		
		Collection values = hashMap.values();

				
		
	}	
}
