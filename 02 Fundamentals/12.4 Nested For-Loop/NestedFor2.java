public class NestedFor2 {
    public static void main(String[] args) {

        // Outer loop runs from 0 to 4
        for (int outer = 0; outer < 5; outer++) {

            // Inner loop runs from 0 to 4 for each outer iteration
            for (int inner = 0; inner < 5; inner++) {
                System.out.println("Outer = " + outer + " | Inner = " + inner);
            }
        }
    }
}
