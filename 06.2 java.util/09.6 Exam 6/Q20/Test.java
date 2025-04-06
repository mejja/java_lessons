import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse(
		"2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE) ;
		date.plusDays(2);
		date.plusHours(3);
		System.out.println(date.getYear () + " "
		+ date.getMonth() + " "+ date.getDayOfMonth());
	}
}
