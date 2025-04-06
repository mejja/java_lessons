import java.time.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTimel = ZonedDateTime.of(date, time, zone);
		ZonedDateTime dateTime2 = dateTimel.plus(1, ChronoUnit.HOURS);

		long hours = ChronoUnit. HOURS.between(dateTimel, dateTime2);
		int clockl = dateTimel.getHour ();
		int clock2 = dateTime2. getHour ();
		System.out.println(hours + ", " + clockl + "," + clock2);
		}
}
