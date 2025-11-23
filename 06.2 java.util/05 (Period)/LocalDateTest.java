import java.time.LocalDate;
import java.time.Period;

/**
 * Calculates the age of a person based on their birthday
 * using LocalDate and Period in Java.
 */
public class LocalDateTest {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the birthday (year, month, day)
        LocalDate birthday = LocalDate.of(1960, 1, 1);

        // Calculate the period between the birthday and the current date
        Period age = Period.between(birthday, currentDate);

        // Print the age in years, months, and days
        System.out.println("You are " + age.getYears() + " years, " 
                           + age.getMonths() + " months, and " 
                           + age.getDays() + " days old.");
    }
}
