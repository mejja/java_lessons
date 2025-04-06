import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Test {
	public static void main(String[] args) {	
		LocalDate d1 = LocalDate.of(2018, 1, 1);
		LocalDate d2 = LocalDate.of(2018, 6, 15);
		Period r =ChronoUnit.between(d1, d2);
		System.out.println("Months and days: "+ r.getMonths() +", "+r.getDays());
	}
}
