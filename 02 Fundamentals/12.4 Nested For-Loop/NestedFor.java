public class NestedFor {
    public static void main(String[] args) {

        // Outer loop runs 5 times
        for (int outer = 0; outer < 5; outer++) {
            System.out.println("Outer = " + outer);

            // Inner loop runs 5 times for each outer iteration
            for (int inner = 0; inner < 5; inner++) {
                System.out.println("  Inner = " + inner);
            }
        }
    }
}

