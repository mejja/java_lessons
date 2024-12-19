import java.util .*;

public class SetMapTest {
	public static void main(String[] args) {
		Set<String> uniqueItems = new HashSet<>(Arrays.asList("a", "b", "c", "a"));
		Map<Integer, String> indexedItems = new HashMap<>();

		int index = 0;
		for (String item : uniqueItems) {
		indexedItems.put(index++, item);
		}
		System.out.println(indexedItems.values());
	}
}