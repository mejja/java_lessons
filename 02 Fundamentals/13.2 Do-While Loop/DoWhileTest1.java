public class DoWhileTest1 {
    public static void main(String[] args) {
        int counter = 0;

        // The do-while loop executes at least once before checking the condition
        do {
            System.out.println("Counter = " + counter);
        } while (counter++ < 10); // Post-increment: prints from 0 to 10
    }
}
