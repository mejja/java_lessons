/**
 * Demonstrates immutability of String and how it affects equals() comparison.
 */
public class EquivalencyTest4 {

    public static void main(String[] args) {

        // Create two separate String objects with identical content
        String a = new String("a");
        String b = new String("a");

        // Compare the two strings before modification
        boolean result = a.equals(b);
        System.out.println("Result before concat = " + result);

        /*
         * concat() does NOT modify the existing String object.
         * It returns a new String instance instead.
         * Since the return value is not assigned, 'a' remains unchanged.
         */
        a.concat("hello");

        // Compare again after concat attempt
        result = a.equals(b);
        System.out.println("Result after concat = " + result);
    }
}
