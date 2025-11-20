import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;

/**
 * Demonstrates how to get detailed information about the current date
 * using LocalDateTime in Java.
 */
public class LocalDateTest2 {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();

        // Extract the year, month, day of month, and day of week
        int currentYear = currentDate.getYear();
        Month currentMonth = currentDate.getMonth();
        int currentDay = currentDate.getDayOfMonth();
        DayOfWeek dayOfTheWeek = currentDate.getDayOfWeek();

        // Print the current date and its components
        System.out.println("Today's Date is: " + currentDate);
        System.out.println("Year is: " + currentYear);
        System.out.println("Month is: " + currentMonth);
        System.out.println("Day of the Month is: " + currentDay);
        System.out.println("Day of the Week is: " + dayOfTheWeek);
    }
}