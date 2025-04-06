import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();

		hashMap.put("key1", "A");
		hashMap.put("key2", "B");
		hashMap.put("key3", "C");
		hashMap.put("key4", "D");

		Set keySet = hashMap.keySet();
		Collection values = hashMap.values();
		System.out.println(hashMap);
	}
}