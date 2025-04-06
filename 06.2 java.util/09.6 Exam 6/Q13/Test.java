import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of (9, 0);
		LocalTime t2 = LocalTime.of (10, 5);
		//LocalTime t3= t1.plus(Duration.ofMinutes(65));
		LocalTime t3= t1.plus(65, ChronoUnit.MINUTES);
		System.out.println(t2);
		System.out.println(t3);
	}
}
