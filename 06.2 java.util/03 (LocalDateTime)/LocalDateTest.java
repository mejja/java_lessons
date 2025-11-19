import java.time.LocalDateTime;
import java.time.Month;

/**
 * Demonstrates how to get the current date and month using LocalDateTime
 */
public class LocalDateTest {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();

        // Extract the current month from the date
        Month currentMonth = currentDate.getMonth();

        // Print the current date and time
        System.out.println("Today's Date is: " + currentDate);

        // Print the current month
        System.out.println("Current Month is: " + currentMonth);
    }
}
