public class ThrowExampleDemo{
    // Method that throws an exception
    public static void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        System.out.println("Number is valid: " + number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);  // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
