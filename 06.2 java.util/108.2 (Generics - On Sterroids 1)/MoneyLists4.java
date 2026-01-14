import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates storing Money objects with multiple currencies in a List.
 * Duplicate entries are allowed.
 */
public class MoneyLists4 {

    public static void main(String[] args) {

        // Create a List to hold Money objects
        List<Money> list4 = new ArrayList<>();

        // Add USD Money objects
        list4.add(new Money(Currency.USD, 10));
        list4.add(new Money(Currency.USD, 10));
        list4.add(new Money(Currency.USD, 10));
        list4.add(new Money(Currency.USD, 10));
        list4.add(new Money(Currency.USD, 10));

        // Add GBP Money objects
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));
        list4.add(new Money(Currency.GBP, 5));

        // Add ZAR Money objects
        list4.add(new Money(Currency.ZAR, 1));
        list4.add(new Money(Currency.ZAR, 1));
        list4.add(new Money(Currency.ZAR, 1));
        list4.add(new Money(Currency.ZAR, 1));
        list4.add(new Money(Currency.ZAR, 1));
        list4.add(new Money(Currency.ZAR, 1));

        // Print the contents of the list
        System.out.println("list4 = " + list4);
    }
}
