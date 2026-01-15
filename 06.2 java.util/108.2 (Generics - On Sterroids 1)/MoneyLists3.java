import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates storing multiple Money objects with different currencies
 * in a List. Duplicates are allowed.
 */
public class MoneyLists3 {

    public static void main(String[] args) {

        // Create a List to hold Money objects
        List<Money> list3 = new ArrayList<>();

        // Add USD Money objects
        list3.add(new Money(Currency.USD, 10));
        list3.add(new Money(Currency.USD, 10));
        list3.add(new Money(Currency.USD, 10));
        list3.add(new Money(Currency.USD, 10));
        list3.add(new Money(Currency.USD, 10));

        // Add GBP Money objects
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));
        list3.add(new Money(Currency.GBP, 5));

        // Print the contents of the list
        System.out.println("list3 = " + list3);
    }
}
