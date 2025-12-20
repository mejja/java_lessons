import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates formatting of LocalDateTime in Java
 */
public class DateTimeFormatterTest {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting: " + now);

        // Define the desired date-time format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date-time according to the pattern
        String formattedDateTime = now.format(formatter);
        System.out.println("After formatting: " + formattedDateTime);
    }
}