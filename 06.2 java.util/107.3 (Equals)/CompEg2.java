/**
 * Demonstrates comparing two String objects using the '==' operator.
 */
public class CompEg2 {

    public static void main(String[] args) {

        // Declare and initialize two String literals
        String a = "1";
        String b = "1";
		String c = "100";
		String d = "100";

        /*
         * When using string literals, both variables reference the same object
         * from the String constant pool. Therefore, 'a == b' returns true
         * because the references point to the same memory location.
         *
         * Note: For content comparison of Strings, always use equals().
         */
        boolean result = (a == b);
		boolean result2 = (c == d);

        // Print comparison result
        System.out.println("result 1 == 1 is " + result);
		System.out.println("result 100 = 100 is" + result2);
    }
}
