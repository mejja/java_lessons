import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of a nested List (List of Lists) containing Money objects.
 */
public class NestedListEg2 {

    public static void main(String[] args) {

        // Create the outer list that holds multiple inner lists
        List<List<Money>> outerList = new ArrayList<>();

        // Create inner lists of Money objects
        List<Money> usdList = new ArrayList<>();
        List<Money> gbpList = new ArrayList<>();

        // Add Money objects to the first inner list (USD)
        usdList.add(new Money(Currency.USD, 100));
        outerList.add(usdList);

        // Add Money objects to the second inner list (GBP)
        gbpList.add(new Money(Currency.GBP, 50));
        gbpList.add(new Money(Currency.GBP, 60));
        outerList.add(gbpList);

        // Print the nested list structure
        System.out.println("outerList = " + outerList);
    }
}
