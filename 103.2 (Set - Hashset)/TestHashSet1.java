import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestHashSet1 {
    public static void main(String[] args) {
    	// Create an instance of HashSet
        Set<String> hashSet = new HashSet<>();

        // Add Strings to the HashSet
        hashSet.add("Major");
        hashSet.add("Kiema");
        hashSet.add("Mbandi");

        System.out.println(hashSet);
    }
}