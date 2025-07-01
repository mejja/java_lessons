import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TestCollator {
    public static void main(String[] args) {
        // Create a list of strings to sort
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("Banana");
        strings.add("kiwi");
        strings.add("Orange");
        strings.add("grape");

        // Create a Collator instance for the default locale
        Collator collator = Collator.getInstance(Locale.getDefault());

        // Sort the list using the Collator
        Collections.sort(strings, collator);

        // Print the sorted list
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
