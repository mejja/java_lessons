import java.util.HashSet;
import java.util.Set;

public class TestHashSetAdd {
    public static void main(String[] args) {
    	// Create an instance of HashSet
        Set<String> hashSet = new HashSet<>();

        // Add Strings to the HashSet
        hashSet.add("Java");
        hashSet.add("Language");

        System.out.println(hashSet);
    }
}