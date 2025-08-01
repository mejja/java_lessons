import java.util.*;

public class TestMerge{
	public static void main(String[] args){
		// Create a TreeMap instance
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> treeMap2 = new TreeMap<>();

        // Put items into the treeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        // Put items into the treeMap2
        treeMap2.put("Elderberry", 4);
        treeMap2.put("Cherry", 3);
        

        // Create a new TreeMap to hold the combined results
        Map<String, Integer> combinedMap = new TreeMap<>(treeMap);
        //merging
        treeMap2.forEach((key, value)->
    		combinedMap.merge(key,value, Integer::sum)
    	);
    	//Print the combined TreeMap
    	System.out.println("Combined TreeMap:");
    	combinedMap.forEach((key, value)-> 
    		System.out.println(key + ": "+ value));

	}
}