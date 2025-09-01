public class BreakTest3 {
    public static void main(String[] args) {
        // Define the upper limit for the counter
        int limit = 7;

        // Initialize the counter
        int counter = 0;

        // Use a do-while loop to print counter values from 0 to limit
        do {
            // Print the current value of counter
            System.out.println("Counter = " + counter);

            // Increment the counter
            counter++;
        } while (counter <= limit); // Continue looping while counter is less than or equal to limit
    }
}
