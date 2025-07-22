import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TestHashSetSpliterator {
    public static void main(String[] args) {
        // Create an instance of HashSet
        Set<String> hashSet = new HashSet<>();

        // Add Strings to the HashSet
        hashSet.add("Java");
        hashSet.add("Programming");
        hashSet.add("Language");
        System.out.println("HashSet: " + hashSet);

        // Using Spliterator
        Spliterator<String> spliterator = hashSet.spliterator();

        // Using forEachRemaining to process elements
        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Processing element: " + s);
            }
        });
    }
}
