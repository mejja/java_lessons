public class Money1 {
    private int amount;
    private String currency;

    // Constructor
    public Money1(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getters
    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object param) {
        // Check if the param is null
        if (param == null) {
            return false;
        }

        // Check if the param is an instance of Money1
        if (!(param instanceof Money1)) {
            return false;
        }

        // Check if this is the same object as param
        if (this == param) {
            return true;
        }

        // Cast the param to Money1
        Money1 other = (Money1) param;

        // Compare the amount and currency fields
        return this.amount == other.amount && this.currency.equals(other.currency);
    }

    @Override
    public int hashCode() {
        // Implement hashCode to be consistent with equals
        int result = Integer.hashCode(amount);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
