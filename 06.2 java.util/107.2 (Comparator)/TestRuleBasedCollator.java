import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the use of RuleBasedCollator to define
 * custom string sorting rules in Java.
 */
public class TestRuleBasedCollator {

    public static void main(String[] args) {

        try {
            /*
             * Define custom collation rules.
             * This rule explicitly defines alphabetical ordering
             * from 'a' to 'z'.
             */
            String rules =
                    "< a < b < c < d < e < f < g < h < i < j < k < l < m "
                  + "< n < o < p < q < r < s < t < u < v < w < x < y < z";

            // Create a RuleBasedCollator using the custom rules
            RuleBasedCollator collator = new RuleBasedCollator(rules);

            // Create a list of strings to be sorted
            List<String> strings = new ArrayList<>();
            strings.add("banana");
            strings.add("apple");
            strings.add("cherry");
            strings.add("date");
            strings.add("elderberry");

            // Sort the list using the RuleBasedCollator
            Collections.sort(strings, collator);

            // Print the sorted list
            System.out.println("Sorted List:");
            for (String value : strings) {
                System.out.println(value);
            }

            // Compare two strings using the same collator
            String str1 = "banana";
            String str2 = "apple";

            int comparisonResult = collator.compare(str1, str2);

            System.out.println("\nComparison Result:");
            if (comparisonResult < 0) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
            } else if (comparisonResult > 0) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
            } else {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            }

        } catch (ParseException e) {
            // Handle invalid collation rule syntax
            System.err.println("Error parsing collation rules: " + e.getMessage());
        }
    }
}
