import java.time.LocalDate;
public class Test {
	public static void main(String [] args) {
		LocalDate date = LocalDate.ofYearDay(2018, 32);
		System.out.println(date);
	}
}