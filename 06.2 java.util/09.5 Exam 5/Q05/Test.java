import java.time.LocalDate;

public class Test {
	public static void main(String [] args) {
		LocalDate date = LocalDate.ofYearDay(2018, 0);
		System.out.println(date);
	}
}