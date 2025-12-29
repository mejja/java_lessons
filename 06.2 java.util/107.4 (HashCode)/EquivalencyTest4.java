/**
 * Demonstrates String immutability and its effect on equals() comparison.
 */
public class EquivalencyTest4 {

    public static void main(String[] args) {

        // Create two separate String objects with the same content
        String a = new String("a");
        String b = new String("a");

        // Compare before attempting modification
        boolean result = a.equals(b);
        System.out.println("Result before concat = " + result);

        /*
         * concat() does NOT change the original String object.
         * It returns a new String, but the returned value is ignored here.
         * Therefore, 'a' remains "a".
         */
        a.concat("hello");

        // Compare again after concat attempt
        result = a.equals(b);
        System.out.println("Result after concat = " + result);
    }
}
