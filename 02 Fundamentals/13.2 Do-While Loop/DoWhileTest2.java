public class DoWhileTest2 {
    public static void main(String[] args) {
        int counter = 0;
        // The do-while loop executes at least once before checking the condition
        do {
            // Print only even values of counter
            if (counter % 2 == 0) {
                System.out.println("Counter = " + counter);
            }
        } while (counter++ < 10); // Post-increment: loop runs from 0 to 10
    }
}