import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMapEg2 {
    public static void main(String[] args) {
        // Define the denominations and their quantities
        double[] denominations = {100, 50, 20, 10, 1}; // Ordered from highest to lowest
        int[] quantities = {2000, 200, 300, 100, 200}; // Quantities corresponding to each denomination

        // Calculate the total amount of money
        double totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalAmount += denominations[i] * quantities[i];
        }

        // Number of robbers
        int numberOfRobbers = 4;

        // Calculate the amount of money each robber should receive
        double amountPerRobber = totalAmount / numberOfRobbers;

        // Create the map to hold each robber's money distribution
        Map<String, List<Money>> outerMap = new HashMap<>();

        // Distribute money among robbers
        for (int i = 0; i < numberOfRobbers; i++) {
            String robberName = "Robber " + (i + 1);
            List<Money> moneyList = allocateMoney(amountPerRobber, denominations, quantities);
            outerMap.put(robberName, moneyList);
        }

        // Print the contents of the map
        System.out.println("Robbers' shares:");
        for (Map.Entry<String, List<Money>> entry : outerMap.entrySet()) {
            System.out.println(entry.getKey() + " receives " + entry.getValue());
        }
    }

    private static List<Money> allocateMoney(double amount, double[] denominations, int[] quantities) {
        List<Money> moneyList = new ArrayList<>();
        for (int i = 0; i < denominations.length; i++) {
            double denom = denominations[i];
            int denomQuantity = quantities[i];
            int numNotes = (int) Math.min(amount / denom, denomQuantity);
            if (numNotes > 0) {
                moneyList.add(new Money(Currency.USD, denom * numNotes));
                amount -= denom * numNotes;
                // Reduce the quantity of the denomination available
                quantities[i] -= numNotes;
            }
            if (amount <= 0) break; // If amount is fully distributed
        }
        return moneyList;
    }
}