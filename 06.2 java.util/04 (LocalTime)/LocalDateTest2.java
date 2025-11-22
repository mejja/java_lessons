import java.time.LocalTime;

/**
 * Demonstrates how to get the current time and its components using LocalTime in Java
 */
public class LocalDateTest2 {

    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();

        // Extract the current hour and minute
        int currentHour = currentTime.getHour();
        int currentMinute = currentTime.getMinute();

        // Print the current time and its components
        System.out.println("Current Time is: " + currentTime);
        System.out.println("Current Hour is: " + currentHour);
        System.out.println("Current Minute is: " + currentMinute);
    }
}
