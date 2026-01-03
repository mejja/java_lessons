import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of generics with List and ArrayList in Java.
 */
public class GenericsEg1 {

    public static void main(String[] args) {

        // Create a type-safe List of Strings using generics
        List<String> strings = new ArrayList<>();

        // Add String elements to the list
        strings.add("1");
        strings.add("3");
        strings.add("3"); // Duplicate values are allowed in a List

        // Print the contents of the list
        System.out.println("strings = " + strings);
    }
}

