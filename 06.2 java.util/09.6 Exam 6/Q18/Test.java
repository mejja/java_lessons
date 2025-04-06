import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of (2018, 8, 15);
		d= d.plusDays (1) ;
		LocalDate d2 = d.plusDays (1);
		LocalDate d3 = d2;
		d2 = d2.plusDays (1);
		System. out.println (d + " "+d2+ " "+ d3); // line X

	}
}
