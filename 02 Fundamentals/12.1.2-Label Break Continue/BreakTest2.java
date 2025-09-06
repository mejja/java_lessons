public class BreakTest2 {
    public static void main(String[] args) {
        int limit = 8;           // Upper bound for the counter
        int counter = 0;         // Initialize counter to 0

        // Loop from 0 up to (but not including) the limit
        while (counter < limit) {
            System.out.println("Counter = " + counter); // Print current counter value
            counter++; // Increment counter
        }
    }
}