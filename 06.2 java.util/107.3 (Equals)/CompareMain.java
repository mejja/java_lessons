public class CompareMain {
    public static void main(String[] args) {
        // Create two Money objects
        Money money1 = new Money(10, "USD");
        Money money2 = new Money(10, "USD");
        
        // Compare the two objects using '=='
        boolean result = (money1 == money2);
        
        // Print out the boolean result
        System.out.println("result = " + result);
    }
}
class Money {
    private int amount;
    private String currency;

    // Constructor
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getters for amount and currency
    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}

