import java.time.LocalDate;
import java.time.Period;

/**
 * Demonstrates how to calculate age using LocalDate and Period,
 * and how to manipulate the age by subtracting years.
 */
public class LocalDateTest2 {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the birthday (year, month, day)
        LocalDate birthday = LocalDate.of(1960, 1, 1);

        // Calculate the period (age) between birthday and current date
        Period age = Period.between(birthday, currentDate);

        // Subtract 5 years from the age
        Period
