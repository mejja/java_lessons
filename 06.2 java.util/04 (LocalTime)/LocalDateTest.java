import java.time.LocalTime;

/**
 * Demonstrates how to get the current time using LocalTime in Java
 */
public class LocalDateTest {

    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();

        // Print the current time
        System.out.println("Current Time is: " + currentTime);
    }
}
