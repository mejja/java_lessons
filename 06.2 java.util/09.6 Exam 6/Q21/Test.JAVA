import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth()
		+ " "+ date.getDayOfMonth());
	}
}
