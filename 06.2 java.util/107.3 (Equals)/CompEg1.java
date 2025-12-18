/**
 * Demonstrates the use of the equality operator (==) to compare two primitive int values.
 */
public class CompEg1 {

    public static void main(String[] args) {

        // Declare and initialize two integer variables
        int a = 1;
        int b = 1;

        // Compare values of a and b using '==' operator
        // For primitive types, '==' checks value equality
        boolean result = (a == b);

        // Print the result of the comparison
        System.out.println("result = " + result);
    }
}
