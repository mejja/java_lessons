public class NestedWhile {
    public static void main(String[] args) {
        int outer = 0;

        // Outer while loop runs 5 times
        while (outer < 5) {
            System.out.println("Outer = " + outer);
            outer++;

            int inner = 0;

            // Inner while loop runs 5 times for each outer iteration
            while (inner < 5) {
                System.out.println("  Inner = " + inner);
                inner++;
            }
        }
    }
}
