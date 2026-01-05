import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates storing multiple Money objects in a List.
 */
public class MoneyLists2 {

    public static void main(String[] args) {

        // Create a List to store Money objects
        List<Money> list2 = new ArrayList<>();

        // Add Money objects to the list (duplicates are allowed in a List)
        list2.add(new Money(Currency.USD, 10));
        list2.add(new Money(Currency.USD, 10));
        list2.add(new Money(Currency.USD, 10));
        list2.add(new Money(Currency.USD, 10));
        list2.add(new Money(Currency.USD, 10));

        // Print the contents of the list
        System.out.println("list2 = " + list2);
    }
}
