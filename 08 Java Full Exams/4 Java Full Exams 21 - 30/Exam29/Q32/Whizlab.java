import java.time.LocalDate;
import java.time.Period;

public class Whizlab{
	public static void main(String[] args) {
		LocalDate today = LocalDate.parse("2016-01-26");
		Period days = Period.ofDays(7);
		today.plus(days);
		System.out.println(today);
	}
}