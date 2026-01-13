import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of a nested List (List of Lists) with generics.
 */
public class NestedListEg1 {

    public static void main(String[] args) {

        // Create the outer list that will hold inner lists of Money objects
        List<List<Money>> outerList = new ArrayList<>();

        // Create an inner list of Money objects
        List<Money> innerList = new ArrayList<>();

        // Add a Money object to the inner list
        innerList.add(new Money(Currency.USD, 100));

        // Add the inner list to the outer list
        outerList.add(innerList);

        // Print the nested list structure
        System.out.println("outerList = " + outerList);
    }
}

