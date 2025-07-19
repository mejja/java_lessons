import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestHashSetIterator {
    public static void main(String[] args) {
        // Create an instance of HashSet
        Set<String> hashSet = new HashSet<>();

        // Add Strings to the HashSet
        hashSet.add("Java");
        hashSet.add("Language");
        System.out.println("HashSet: "+hashSet);
        //we use an iterator to get an element as indexing is not supported
        Iterator<String> iterator = hashSet.iterator();
        for(int i=0; i<hashSet.size(); i++){
            if (iterator.hasNext()) {
            // Get the first element from the HashSet
            String firstElement = iterator.next();
            System.out.println("Retrieved element: " + firstElement);
        } else {
            System.out.println("HashSet is empty.");
            }
        }
    }
}