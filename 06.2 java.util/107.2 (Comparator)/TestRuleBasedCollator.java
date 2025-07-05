import java.text.RuleBasedCollator;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestRuleBasedCollator {
    public static void main(String[] args) {
        try {
            // Define custom collation rules
            // This example creates a rule where 'a' < 'b' < 'c' (default behavior) but with specific ordering
            String rules = "< a < b < c < d < e < f < g < h < i < j < k < l < m < n < o < p < q < r < s < t < u < v < w < x < y < z";
            
            // Create a RuleBasedCollator instance with the custom rules
            RuleBasedCollator collator = new RuleBasedCollator(rules);

            // Create a list of strings to sort
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
            for (String s : strings) {
                System.out.println(s);
            }

            // Compare two strings using the RuleBasedCollator
            String str1 = "banana";
            String str2 = "apple";

            int comparisonResult = collator.compare(str1, str2);

            System.out.println("\nComparison Result between \"" + str1 + "\" and \"" + str2 + "\":");
            if (comparisonResult < 0) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
            } else if (comparisonResult > 0) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
            } else {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            }
            
        } catch (ParseException e) {
            System.err.println("Error parsing collation rules: " + e.getMessage());
        }
    }
}
