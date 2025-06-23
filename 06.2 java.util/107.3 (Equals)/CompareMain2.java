public class CompareMain2 {
    public static void main(String[] args) {
        // Create two Money1 objects
        Money1 money1 = new Money1(10, "USD");
        Money1 money2 = new Money1(10, "USD");

        // Compare the two objects using 'equals' method
        boolean result = money1.equals(money2);

        // Print out the boolean result
        System.out.println("result = " + result);
    }
}
