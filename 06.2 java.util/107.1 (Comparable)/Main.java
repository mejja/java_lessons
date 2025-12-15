import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates sorting a list of Money objects.
 * Assumes that the Money class implements Comparable<Money>.
 */
public class Main {

    // Main method to test sorting of Money objects
    public static void main(String[] args) {

        // Create a list to hold Money objects
        List<Money> moneyList = new ArrayList<>();

        // Add Money objects with different currencies and amounts
        moneyList.add(new Money(Currency.USD, 10.00));
        moneyList.add(new Money(Currency.EUR, 50.00));
        moneyList.add(new Money(Currency.ZAR, 200.00));
        moneyList.add(new Money(Currency.GBP, 5.00));
        moneyList.add(new Money(Currency.USD, 25.00));
        moneyList.add(new Money(Currency.EUR, 15.00));
        moneyList.add(new Money(Currency.ZAR, 100.00));
        moneyList.add(new Money(Currency.GBP, 20.00));
        moneyList.add(new Money(Currency.USD, 1.00));
        moneyList.add(new Money(Currency.EUR, 30.00));

        // Print the list before sorting
        System.out.println("Unsorted List:");
        System.out.println(moneyList);

        // Sort the list using natural ordering defined in Money.compareTo()
        Collections.sort(moneyList);

        // Print the list after sorting
        System.out.println("Sorted List:");
        System.out.println(moneyList);
    }
}
