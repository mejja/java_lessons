import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates storing objects in a List using generics.
 */
public class MoneyLists1 {

    public static void main(String[] args) {

        // Create a List to store Money objects
        List<Money> list1 = new ArrayList<>();

        // Add Money objects to the list (duplicates are allowed in a List)
        list1.add(new Money(Currency.GBP, 20));
        list1.add(new Money(Currency.GBP, 20));
        list1.add(new Money(Currency.GBP, 20));

        // Print the contents of the list
        System.out.println("list1 = " + list1);
    }
}
