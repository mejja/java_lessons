/**
 * Demonstrates string equivalency using the equals() method.
 */
public class EquivalencyTest1 {

    public static void main(String[] args) {

        // Declare and initialize a String literal
        String a = "a";

        /*
         * The equals() method compares the content of the String.
         * Since 'a' is compared with itself, the result is always true.
         */
        boolean result = a.equals(a);

        // Print the result
        System.out.println("Result = " + result);
    }
}

