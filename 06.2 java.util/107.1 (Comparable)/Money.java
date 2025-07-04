public class Money implements Comparable<Money> {
    private Currency currency;
    private double value;

    // Constructor
    public Money(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    // Getter for currency
    public Currency getCurrency() {
        return currency;
    }

    // Setter for currency
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    // Getter for value
    public double getValue() {
        return value;
    }

    // Setter for value
    public void setValue(double value) {
        this.value = value;
    }

    // Implement compareTo method to sort by value
    @Override
    public int compareTo(Money other) {
        return Double.compare(other.value, this.value);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, currency);
    }
}
