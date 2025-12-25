/**
 * Demonstrates symmetric behavior of equals() when comparing two distinct
 * String objects with the same content.
 */
public class EquivalencyTest2 {

    public static void main(String[] args) {

        // Create two separate String objects with identical content
        String a = new String("a");
        String b = new String("a");

        /*
         * equals() compares the character content of the Strings.
         * Even though 'a' and 'b' reference different objects,
         * their content is the same, so equals() returns true in both directions.
         */
        boolean result1 = a.equals(b);  // true
        boolean result2 = b.equals(a);  // true

        // Print results
        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
    }
}