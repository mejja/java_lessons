import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of a nested List (List of Lists) containing Money objects
 * grouped by currency.
 */
public class NestedListEg3 {

    public static void main(String[] args) {

        // Create the outer list that holds multiple inner lists
        List<List<Money>> outerList = new ArrayList<>();

        // Create inner lists for different currencies
        List<Money> usdList = new ArrayList<>();
        List<Money> gbpList = new ArrayList<>();
        List<Money> eurList = new ArrayList<>();

        // Add USD Money objects
        usdList.add(new Money(Currency.USD, 100));
        outerList.add(usdList);

        // Add GBP Money objects
        gbpList.add(new Money(Currency.GBP, 50));
        gbpList.add(new Money(Currency.GBP, 60));
        outerList.add(gbpList);

        // Add EUR Money objects
        eurList.add(new Money(Currency.EUR, 200));
        eurList.add(new Money(Currency.EUR, 150));
        eurList.add(new Money(Currency.EUR, 250));
        outerList.add(eurList);

        // Print the nested list structure
        System.out.println("outerList = " + outerList);
    }
}
