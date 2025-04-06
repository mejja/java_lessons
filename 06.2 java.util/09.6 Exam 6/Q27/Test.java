import java.time.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Define the time zone
        ZoneId zone = ZoneId.of("US/Eastern");
        
        // Define the LocalDate and LocalTime
        LocalDate date = LocalDate.of(2017, 2, 29);
        LocalTime time1 = LocalTime.of(2, 15);
        System.out.println("LocalTime time1: " + time1);
        
        // Combine LocalDate and LocalTime into a ZonedDateTime
        ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
        
        // Print the result
        System.out.println("ZonedDateTime: " + a);
    }
}
