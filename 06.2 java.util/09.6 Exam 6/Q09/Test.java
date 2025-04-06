import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Singapore");
		ZonedDateTime zonedDateTime =
		ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime.getOffset());
	}
}