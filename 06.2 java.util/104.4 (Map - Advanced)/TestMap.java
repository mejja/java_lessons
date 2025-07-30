import java.util.*;

public class TestMap{
	public static void main(String[] args){
		// Create a TreeMap instance
        Map<String, Integer> treeMap = new TreeMap<>();
        
        // Put items into the TreeMap
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 1);
        treeMap.put("Cherry", 2);
        treeMap.put("Date", 4);
        treeMap.put("Elderberry", 5);

        // Print the TreeMap
        System.out.println("TreeMap contents:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
}