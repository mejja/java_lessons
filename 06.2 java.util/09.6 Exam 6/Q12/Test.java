import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		ZonedDateTime zd = ZonedDateTime.parse("2020-05-04T08:05:00");
		System.out.println(zd.getMonth() + " " + zd.getDayOfMonth());
	}
}