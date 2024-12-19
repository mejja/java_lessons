import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestClass3 {
    public static void main(String[] args) {
        // Create a LocalDateTime instance for January 1, 2015 at midnight (00:00:00)
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 1, 0, 0);
        
        // Format the LocalDateTime using ISO_DATE_TIME
        String formattedDateTime = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        
        // Print the formatted date-time string
        System.out.println(formattedDateTime);
    }
}
