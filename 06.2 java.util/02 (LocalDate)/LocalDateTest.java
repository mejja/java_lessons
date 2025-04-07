import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();

        // Set zone to EAT
        ZoneId eatZoneId = ZoneId.of("Africa/Nairobi");

        // Convert to EAT time zone
        ZonedDateTime eatDateTime = localDateTime.atZone(eatZoneId);

        // Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the date and time
        String formattedDateTime = eatDateTime.format(formatter);

        // Print the result
        System.out.println("Current Date and Time in EAT: " + formattedDateTime);
    }
}

