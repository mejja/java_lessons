import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Demonstrates sorting of strings using Collator for
 * locale-sensitive and case-aware ordering.
 */
public class TestCollator {

    public static void main(String[] args) {
        // Create a list of strings to be sorted
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("Banana");
        strings.add("kiwi");
        strings.add("Orange");
        strings.add("grape");

        // Create a Collator instance for the default system locale
        Collator collator = Collator.getInstance(Locale.getDefault());

        // Optional: make sorting case-insensitive
        collator.setStrength(Collator.PRIMARY);

        // Sort the list using the Collator
        Collections.sort(strings, collator);

        // Print the sorted list
        System.out.println("Sorted Strings (Locale-aware):");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
