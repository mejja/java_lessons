public class NestedDoWhile {
    public static void main(String[] args) {
        int outer = 0;

        // Outer do-while loop runs 5 times
        do {
            System.out.println("Outer = " + outer);

            int inner = 0;

            // Inner do-while loop runs 5 times for each outer iteration
            do {
                System.out.println("  Inner = " + inner);
                inner++;
            } while (inner < 5);

            outer++;
        } while (outer < 5);
    }
}